import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	Question1();
	Question2();
	Question3();
	Question4();
	Question5();
	Question6();
	Question7();
	Question8();
	Question9();
	Questin10();
	
	}

	public static void Question1() {
		System.out.println("   J    a   v     v  a");
		System.out.println("   J   a a   v   v  a a");
		System.out.println("J  J  aaaaa   V V  aaaaa");
		System.out.println(" JJ  a     a   V  a     a");
		
		System.out.println("  GGGG    OOOO    OOOO   DDDD");
		System.out.println("G        O    O  O    O  D   D");
		System.out.println("G  GGG   O    O  O    O  D    D");
		System.out.println("  GG G   O    O  O    O  D   D");
		System.out.println("     G    OOOO    OOOO   DDDD");
	}
	
	public static void Question2() {
		Scanner in = new Scanner (System.in);
		System.out.print("Input radius of a circle in cm:");
		double r = in.nextDouble();
		double perimetercircle = 2*Math.PI*r;
		System.out.println("Perimeter of the circle :" + perimetercircle);
		double areacircle = Math.PI*Math.pow(r, 2);
		System.out.println("Area of the circle :" + areacircle);
		
		System.out.print("Input the side length of a square :");
		double s = in.nextDouble();
		double perimetersquare = s*4;
		System.out.println("Perimeter of the square :" + perimetersquare);
		double areasquare = s*s;
		System.out.println("Area of the square :" + areasquare);
		
	}
	
	public static void Question3() {
		Scanner in = new Scanner (System.in);
		System.out.print("Input first number :");
		int num1 = in.nextInt();
		System.out.print("Input second number :");
		int num2 = in.nextInt();
		System.out.print("Input third number :");
		int num3 = in.nextInt();
		System.out.print("Input fourth number :");
		int num4 = in.nextInt();
		System.out.print("Input fifth number :");
		int num5 = in.nextInt();
		double ave = (num1+num2+num3+num4+num5)/5;
		System.out.println("The average of the five number is " + ave);
		
	}
	
	public static void Question4() {
		Scanner in = new Scanner (System.in);
		System.out.print("Input the first number :");
		int num1 = in.nextInt();
		System.out.print("Input the second number :");
		int num2 = in.nextInt();
		System.out.println("The swapped value are " + num2 + " and " + num1);
	}
	
	public static void Question5() {
		Scanner in = new Scanner (System.in);
		System.out.print("Input a number :");
		int n = in.nextInt();
		System.out.println("Prints 1 if the number is even or 0 if the number is odd");
		if (n%2==0) {System.out.println("1");
		}
		else {System.out.println("0");
		}
	}
	
	public static void Question6() {
		System.out.println("Numbers between 1 to 100 which are divisible by 3 :");
		for (int i=1;i<100;i++) {
			if (i%3==0) System.out.print(i + ",");
		}
		System.out.println("\nNumbers between 1 to 100 which are divisible by 5 :");
		for (int i=1;i<100;i++) {
			if (i%5==0) System.out.print(i + ",");
		}
		System.out.println("\nNumbers between 1 to 100 which are divisible by 3 and 5 :");
		for (int i=1;i<100;i++) {
			if (i%3==0 & i%5==0) System.out.print(i + ",");
		}
	}
	
	public static void Question7() {
		Scanner in = new Scanner (System.in);
		System.out.print("Input the first number :");
		int x = in.nextInt();
		System.out.print("Input the second number :");
		int y = in.nextInt();
		System.out.print("Input the third number :");
		int z = in.nextInt();
		if (x+y==z) {System.out.println("The result is true");
		}
		else {System.out.println("The result is false");
		}
	}
	
	public static void Question8() {
		Scanner in = new Scanner (System.in);
		System.out.print("Input the first number :");
		int x = in.nextInt();
		System.out.print("Input the second number :");
		int y = in.nextInt();
		System.out.println("Result: " + result(x,y));
	}
	public static int result(int x, int y)
    {  
	if(x == y)
		return 0;
	    if(x % 6 == y % 6)
		    return (x < y) ? x : y;
	    return (x > y) ? x : y;
    }
	
	public static void Question9() {
		Scanner in = new Scanner (System.in);
		 System.out.print("Input the first number : ");
	        int a = in.nextInt();  
			System.out.print("Input the second number: ");
			int b = in.nextInt(); 
			int divided = a / b;
			int result = a - (divided * b);
			System.out.println(result);
	}
	
	public static void Questin10() {
		
		String str1 = "Python";    
		String str2 = "Tutorial"; 
		
		System.out.println(str1.substring(1) + str2.substring(1));
		
		String str3 = "Circle";
		String str4 = "Square";
		System.out.println(str3.substring(1) + str4.substring(1));
	}
	
}
