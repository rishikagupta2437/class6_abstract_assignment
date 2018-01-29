package class6;

import java.util.Scanner;

public class string_to_int {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter numbers");
		String a= sc.next();
		String b= sc.next();

	if (Integer.valueOf(a)>Integer.valueOf(b)) {
			System.out.println(a+" is greater");
		}
		else {
			System.out.println(b+" is greater");
		}
		
		
	}

}
