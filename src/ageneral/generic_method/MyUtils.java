package ageneral.generic_method;

import java.util.ArrayList;

public class MyUtils {

	//This is the utility method that's why we are making it as static:- more info Q1
	//Generic method whose return type is void and taking type at run time
	public static <T> void iterateList(ArrayList<T> anyList){
		 
		for(T temp : anyList) {
			System.out.println(temp);
		}
	}
}
