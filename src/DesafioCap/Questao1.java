package DesafioCap;

import java.util.Arrays;
import java.util.Random;

public class Questao1 {
	public static void main(String[] args) {
		int[] num = new int[5];
		int a=0;
		int b=num.length-1;
		int c,meio;
		
		
		for(int i=0; i < num.length; i++)
			num[i] = new Random().nextInt(10);
		Arrays.sort(num); 
		

		c =(a+b)/2;
		meio = num[c];

		System.out.println(Arrays.toString(num));
		System.out.println(meio);
}	
}