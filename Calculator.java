import java.util.Scanner;

public class Calculator{
	
	
	public static void main(String args[]){
		
		Scanner scnr;
		scnr = new Scanner(System.in);
		String num2="0",num4="0";
		double num1=0,num3=0,num5=0,num6=0,num7=0;
		int i = 0;
		
		for ( i = 0 ; i < 5; i++)
		{
		
		
		if (i == 0){
			System.out.println ("Enter the first number to perform calculation");
			 num1 = scnr.nextDouble();
		}
		
		if (i == 1){
			System.out.println ("Enter the Arithmatic Operator to perform calculation(+,-,*,/)");
			 num2 = scnr.next();
			 //System.out.println ("Check");
		}
		
		if (i == 2){
			System.out.println ("Enter thesecond number to perform calculation");
			 num3 = scnr.nextDouble();
		 num5 = performcal (num1, num2,num3);
		System.out.println ("Intermediate Calculated value is: "+ num5);
		}
		 if ( i ==3 ){
			 System.out.println ("Enter the operator to perform calculation(+,-,*,/,=)");
			 num4 = scnr.next();
			 
			 if (num4.equals("=")) {
				 System.out.println ("Calculated value is: "+ num5);	
				 scnr.close();
				 break;
					
		 } else {
			 System.out.println ("Enter next number"); 
			 num6 = scnr.nextDouble();
			 num7 = performcal (num5, num4,num6);
			 System.out.println ("Intemediate Calculated value is: "+ num7);
			 num5=num7;	 
		 }
			 
			 i=2;
			
		}
		
		}
	}
	
	public static double performcal(double n1 , String num2, double n3){
		
	//double n1 = Double.parseDouble(num1);
	//double n3 = Double.parseDouble(num3);
	 //double n1= num1;
	 
		if (num2.equals("+")) {
		 double n4 = n1 + n3;
		 return n4;
	 }
	 if (num2.equals("-")) {
		 double n5 = n1 - n3;
		 return n5;
	 }
	 if (num2.equals("*")) {
		 double n6 = n1 * n3;
		 return n6;
	 }
	 if (num2.equals("/")) {
		 double n7 = n1 / n3;
		 return n7;
	 }
	return 1.00;
	}
	
	//public static String readinput(){
		//Scanner scnr;
		//scnr = new Scanner(System.in);
		//String input = scnr.nextLine();
		//scnr.close();
		//return input;
		
	//}
	
}