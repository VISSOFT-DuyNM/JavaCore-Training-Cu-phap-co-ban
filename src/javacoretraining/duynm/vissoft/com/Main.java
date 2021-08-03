package javacoretraining.duynm.vissoft.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("VISSOFT JSC - Java Core Training");
		
		System.out.println("1. In ra tong 10 so chan dau tien.");
		sumOfEvenNumbers();
		System.out.println("------------------------------");
		
		System.out.println("2. In ra tong N so nguyen to.");
		sumOfPrimeNumbers();
		System.out.println("------------------------------");
		
		System.out.println("3. Viet truong trinh in ra du lieu hinh tam giac");
		printOutTriangle();
		System.out.println("------------------------------");

	}
	
	static void sumOfEvenNumbers() {
		int temp = 0, result = 0, evenNumberCount = 0;
		int debugArray[] = new int[10];
		while(true) {
			if(temp % 2 == 0 && temp != 0) {
				result += temp;
				debugArray[evenNumberCount] = temp;
				evenNumberCount++;
			}
			temp++;
			if(evenNumberCount == 10) break;
		}
		System.out.print("Even numbers found: "); for(int i : debugArray) {System.out.print(i + " ");}
		System.out.println("\nResult: " + result);
	}
	
	static void sumOfPrimeNumbers() {
		int temp = 0, result = 0, primeNumberCount = 0;
		try (Scanner scnr = new Scanner(System.in)) {
			System.out.print("How many Prime Numbers do you want to have a Sum of? I want ");
			int inputOfN = scnr.nextInt();
			int debugArray[] = new int[inputOfN];
			while(true) {
				if(temp != 0 && temp != 1 && temp % 2 != 0) {
					if(isPrime(temp) == true) {
						result += temp;
						debugArray[primeNumberCount] = temp;
						primeNumberCount++;
					}
				}
				temp++;
				if(primeNumberCount == inputOfN) break;
			}
			System.out.print("Prime numbers found: "); for(int i : debugArray) {System.out.print(i + " ");}
			System.out.println("\nResult: " + result);
		}
	}
	
	static void printOutTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("*  *");
		System.out.println("*   *");
		System.out.println("*    *");
		System.out.println("*     *");
		System.out.println("*      *");
		System.out.println("*       *");
		System.out.println("**********");
	}
	
	public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	}  

}
