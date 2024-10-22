package SeleniumScripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Different ways to create the list
 */



public class DifferentwaysToCreateList {

	public static void main(String[] args) {

		createList();
		createList2();
		createList3();
	}
	
	//1st way:conventional method
	public static void createList() {
		
		List<String>list=new ArrayList<String>();
		list.add("java");
		list.add("c");
		list.add("python");
		list.add("c#");
		list.add("js");
		for(String e:list) {
			System.out.println(e);
		}
	}
	
	//2nd way:using Arrays.asList()
	public static void createList2() {
		
		List<String>list=Arrays.asList("java","c","python","c#","js");
		for(String e:list) {
			System.out.println(e);
		}
	}
	
	//3rd way:using java 9 List.of()
	public static void createList3() {
		
		List<String>list=List.of("java","c","python","c#","js");
		for(String e:list) {
			System.out.println(e);
		}
	}


}
