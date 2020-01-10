package com.test.java8.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BishnuPOC {

	public static void main(String[] args) throws FileNotFoundException{
		String fileName = "C:\\shib\\westernPower\\test_workspace\\Java8Test\\src\\com\\test\\java8\\example\\BRFile.txt";
		List<String> list = new ArrayList<>();
		List<DeviceMaster> deviceMasterList = new ArrayList<DeviceMaster>();
		
		Scanner input = new Scanner(new File(fileName));		 
	    input.useDelimiter("~|\n");
	    DeviceMaster deviceMaster;
	    
	    while(input.hasNext()) {
	    	String nextLine = input.nextLine();
	    			//input.skip(Pattern.compile("~$"));
	        String reasonCode = input.next();
	        String deviceType = input.next();
	        String reasonDesc = input.next();	       
	        String limitingComponent = input.next();
	        List<String> limitComponent = Arrays.asList(limitingComponent.trim().split("\\s*,\\s*"));
	        
	      // System.out.println(reasonCode+ " " +deviceType+ " "+reasonDesc+ " "+limitingComponent);
	     
	        deviceMaster = new DeviceMaster(reasonCode, deviceType, reasonDesc, limitComponent);
	        deviceMasterList.add(deviceMaster);
	    	
	        
	    }
	   // deviceMasterList.stream().forEach(System.out::println);
	    String lc="CD";
	    List<String> s = deviceMasterList.stream()
	    			.filter(p -> p.getDeviceType().equals("LINE"))
	    			.filter(p ->p.getReasonDesc().equals("90% TPES POL"))
	    			.filter(p -> isPresentLimitingComponent(p.getLimitingComponent(), lc))
	    			.map(DeviceMaster::getReasonCode)
	    			.collect(Collectors.toList());
	    
	    s.forEach(System.out::println);
	    			

		/*try (Stream<String> stream = Files.lines(Paths.get(fileName))) {			
			list = stream.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}*/

	}
	
	 public static boolean isPresentLimitingComponent(List<String> components, String targetValue) {
		System.out.println("component->" +components + "check value->"+targetValue);
		 //System.out.println(components.contains(targetValue.trim().toString()));
		 return components.contains(targetValue) || (components.size()==1 && components.get(0).equals(""));
	    }

}
