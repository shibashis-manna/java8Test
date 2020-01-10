package com.test.java8.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.beanutils.PropertyUtils;

public class ObjectTransfer {

	public static void main(String[] args) {
		List<DBAddress> dbAddressList = new ArrayList();
		dbAddressList.add(new DBAddress("12c", "AJC bose Road", "700035"));
		dbAddressList.add(new DBAddress("12b", "AJC bose Road", "700038"));
		dbAddressList.add(new DBAddress("12D", "AJC bose Road", "700034"));
		dbAddressList.add(new DBAddress("12e", "AJC bose Road", "700033"));
		dbAddressList.add(new DBAddress("12f", "AJC bose Road", "700037"));
		
		// 1st way
		
		/*List<Address> addressList = dbAddressList.stream()
									.map(dbAddress ->{
										Address address = new Address();
										address.setHouseNo(dbAddress.getHouseNo());
										address.setRoadNo(dbAddress.getRoadNo());
										return address;
									}).collect(Collectors.toList());*/
		
		
		// 2nd way
		
				List<Address> addressList1 = dbAddressList.stream()
											.map(dbAddress ->{
												Address address = new Address();
												try {
													PropertyUtils.copyPorperty(address, dbAddress);
												}catch(Exception e) {
									
												}
												return address;
											}).collect(Collectors.toList());
		
		
		System.out.println(addressList);
		
	}

}
