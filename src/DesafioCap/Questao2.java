package DesafioCap;

import java.util.Arrays;
import java.util.Random;


public class Questao2 {
	public static void main(String[] args) { 
		int[] num = new int[5];
	int par = 0;
	//int c;
	int c = 2;
	for(int i=0; i < num.length; i++) {
		num[i] = new Random().nextInt(10)+1;
		//System.out.println("Digite o valor do intervalo "); 
		//c = x.nextInt();
	 
			System.out.println(Arrays.toString(num));
			if(num[i] % c == num[i])                
	             par = par + 1;
	 
	                      System.out.println(par);
        
        
    }
	
	}
}