package week4.W4D1Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
	// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

	// get the length of the array		

	// sort the array			

	// Iterate it in the reverse order

	// print the array
		
	// Required Output: Wipro, HCL , CTS, Aspire Systems

	}
 */
		String[] str= {"Wipro", "HCL" , "CTS", "Aspire Systems"};
		int len = str.length;
		List<String> list=new ArrayList<>();
		Collections.addAll(list, str);
		Collections.sort(list);
		for (int i = list.size()-1;i>=0; i--) 
		{
			System.out.print(list.get(i));
		if(i>0)
		{
			System.out.print(" , ");
		}
	
		}
		
			
		
		
		
	
		
	
		
		
	}

}
