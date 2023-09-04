package week3.w3d2;

import java.util.Arrays;

public class ArrayReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {98,97,76,87,90};
		 Arrays.sort(scores);
		int len =scores.length;
		
		
		for (int i=len-1;i>=0; i--)
		{
			System.out.println(scores[i]);
		}
		
	}

}
