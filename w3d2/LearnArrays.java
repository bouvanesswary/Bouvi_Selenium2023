package week3.w3d2;
import java.util.Arrays;

public class LearnArrays {
	public static void main(String[] args) {
		int[] scores= {2,3,4,5,6,7,9};
		// find the length of an array
		int len=scores.length;
		System.out.println("Length of an array :" +len);
		// find index value
		System.out.println("Find the index value of 2 :" +scores[2]);
		// sort array
	    Arrays.sort(scores);
		System.out.println("Sort the array :"+ scores);
		//print all the items of an array
		for(int i=0;i<len;i++)
		{
			System.out.println(scores[i]);
		}
		//Find the largest number of this array
		System.out.println("Largest number in an array " +scores[len-1]);
		//second largest number
		System.out.println("Largest number in an array " +scores[len-2]);
		//least value of an array
		System.out.println("Largest number in an array " +scores[0]);
		//second least
		System.out.println("Largest number in an array " +scores[0+1]);
		//print all the values in reverse order
		
	}

}
