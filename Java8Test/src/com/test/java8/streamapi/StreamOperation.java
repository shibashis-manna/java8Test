package com.test.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.jar.Attributes.Name;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.sound.midi.ControllerEventListener;

public class StreamOperation {
	
	public static List<Person> createPeople() {
		return Arrays.asList(
				new Person("Amit", 42, Gender.MALE),
				new Person("Sera", 2, Gender.FEMALE),
				new Person("Sera", 73, Gender.FEMALE),
				new Person("Hari", 28, Gender.MALE),
				new Person("Gora", 14, Gender.MALE),
				new Person("Pari", 24, Gender.FEMALE),
				new Person("MIKE", 1, Gender.MALE),
				new Person("MIKE", 71, Gender.MALE),
				new Person("SHIB", 40, Gender.MALE),
				new Person("Rose", 12, Gender.FEMALE),
				new Person("Ali", 38, Gender.MALE)
				);
	}
			

	public static void main(String[] args) {
		List<Person> persons = createPeople();
		
		Stream<Person> personsStream = persons.stream();
		
		//************************* example-1 ************************************/
		// Name the uppercase, name of all female older then 18
		/*for(Person p : persons){
			if(p.getAge()<18){
				if(p.getGender()== Gender.FEMALE){
					System.out.println(p.getName().toUpperCase());
				}
			}
		}*///SERA	ROSE
		
		/*List<String> listPerson = 
				persons.stream()
				.filter(person -> person.getAge() < 18)
				.filter(person->person.getGender() == Gender.FEMALE)
				.map(Person::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toList());				
		System.out.println(listPerson);*/
		
		//************************* example-2 ************************************/
				// print all mail with uppercase
		
		/*persons
			.stream()
			.filter(person -> person.getGender() == Gender.MALE)
			.map(person ->new Person(person.getName().toUpperCase(), person.getAge(), person.getGender()))
			.forEach(System.out::println);*/
		
		//************************* example-3 ************************************/
		// print sum of age
		
		/*System.out.println(
		persons.stream()
				.map(Person::getAge)
				.reduce(0, (carry,age) -> carry+age));
		
		// 2nd way
		System.out.println(
				persons.stream()
						.map(Person::getAge)
						.reduce(0, Integer::sum));
		
		//3rd way
	
		System.out.println(
				persons.stream()
						.mapToInt(Person::getAge)
						.reduce(0, Integer::sum));
			   
		
				
		//4th way
		
		System.out.println(
				persons.stream()
						.mapToInt(Person::getAge)
						.sum());*/
		
		
	//************************* example-4 ************************************/
	// max, min , count find maximu age, minimum age and count of todlars
		
		/*System.out.println(
				persons.stream()
						.max((person1, person2) -> person1.getAge()>person2.getAge()?1:-1)
						
				);
		
		System.out.println(
				persons.stream()
						.min((person1, person2) -> person1.getAge()>person2.getAge()?1:-1)
						
				);
		
		System.out.println(
				persons.stream()
						.filter(person -> person.getGender() == Gender.FEMALE)
						.min((person1, person2) -> person1.getAge()>person2.getAge()?1:-1)
						
				);
		
		System.out.println(
				persons.stream()
						.filter(person -> person.getGender() == Gender.FEMALE)
						.count()
						
				);
		
		Optional<Person> p = persons.stream()
							.max((person1, person2) -> person1.getAge()>person2.getAge()?1:-1);				
		
		System.out.println(p);
		
		long i = persons.stream()
				.filter(person -> person.getGender() == Gender.FEMALE)
				.count();
		System.out.println(i);*/
		
		//************************* example-5 ************************************/
		//list of all name which is >17
		
		// very bad idea concurrency issue dont use this kind of logic not hyginiq
		/*List<String> names = new ArrayList<String>();
			persons.stream()
					.filter(person -> person.getAge() > 17)
					.map(person -> person.getName().toUpperCase())
					.forEach(name->names.add(name));
		
		System.out.println(names);
		
		// use this one
		List<String> name2 = 
				persons.stream()
				.filter(person -> person.getAge() > 17)
				.map(person -> person.getName().toUpperCase())
				.collect(Collectors.toList());
		System.out.println(name2);
		
		// 	with different way
		
		List<String> name3 = 
				persons.stream()
				.filter(person -> person.getAge() > 17)
				.map(person -> person.getName().toUpperCase())
				.collect(
						()->new ArrayList<String>(),
						(list, name) -> list.add(name),
						(list1, list2) -> list1.addAll(list2));
		System.out.println(name3);*/
		
		
		//************************* example-6 ************************************/
		
		//find the unique name from the list :: set example
		/*Set<String> nameSet = 
				persons.stream()
						.filter(person -> person.getGender() == Gender.MALE)
						.map(Person::getName)
						.collect(Collectors.toSet());
		System.out.println(nameSet);*/
		
		//************************* example-7 ************************************/
		//Map example
		
		/*Map<String, Person> nameMap = 
				persons.stream()
						.collect(Collectors.toMap(
								person -> person.getName()+":"+person.getAge(), person->person));		
		System.out.println(nameMap);*/
		
		//************************* example-8 ************************************/
		//groupingBy example
		
		Map<String, List<Person>> groupNameMap = 
				persons.stream()
					.collect(Collectors.groupingBy(person -> person.getName()));
		
		groupNameMap.forEach((k,v) -> System.out.println(k + "--->"+v));
		

	}

}
