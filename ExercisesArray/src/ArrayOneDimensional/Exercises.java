package ArrayOneDimensional;
import java.util.*;
public class Exercises {

	public static void main(String[] args) {
		Question1();
		Question2();
		Question3();
		Question4();
		
	}
	
	public static void Question1() {
		System.out.println("Question 1:");
		//1a. Declare an array alpha of 15 elements of type integer
		int[] alpha = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] beta = new int [20];
				
		//1b. Output the value of the tenth element of the array alpha
		System.out.println(alpha[9]);
				
		//1c. Set the value of the fifth element of the array alpha to 35
		alpha[4]=35;
		System.out.println(alpha[4]);
				
		//1d. Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth element of the array alpha
		alpha[8]=alpha[5]+alpha[12];
		System.out.println("Sum=" + alpha[8]);
		System.out.println();
	}
	
	public static void Question2() {
		System.out.println("Question 2:");
		//2a. Write a statement that declare a string array initialize witn the following string:
		//Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
		//2b. Write a loop that display the content of each element in the array that you declared
				
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
				
		for (int i=0; i<days.length; i++) {
			System.out.println(days[i]);
		}
		System.out.println();
				
		int j=0;
		while(j < days.length) {
			System.out.println(days[j]);
			j++;
		}
		System.out.println();
				
		int k=0;
		do {
			System.out.println(days[k]);
			k++;
		}while(k < days.length);
		System.out.println();
	}
	
	public static void Question3() {
		System.out.println("Question 3:");
		//Write a program that create an array of 10 elements size. 
		//Your program should prompt the users to input numbers in array.
		//Display the sum of all array elements.
				
		int[] num = new int[10];
				
		Scanner in = new Scanner (System.in);
				
		System.out.print("Enter numbers: ");
				
		for (int i=0; i<num.length; i++) {
			num[i] = in.nextInt();
		}
		System.out.println();
				
		System.out.println("For Loop:");
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
				
		int sum1 = 0;
		for(int i=0; i<num.length; i++) {
			sum1 +=num[i];
		}
		System.out.println("The sum is equal to " + sum1);
		System.out.println();
				
		System.out.println("While Loop:");
		int j=0;
		while(j<num.length) {
			System.out.println(num[j]);
			j++;
		}
				
		int sum2 = 0;
		for(int i=0; i<num.length; i++) {
			sum2 +=num[i];
		}
		System.out.println("The sum is equal to " + sum2);
		System.out.println();
				
		System.out.println("Do While Loop:");
		int k=0;
		do {
			System.out.println(num[k]);
			k++;
		}while (k<num.length);
				
		int sum3 = 0;
		for(int i=0; i<num.length; i++) {
			sum3 +=num[i];
		}
		System.out.println("The sum is equal to " + sum3);
		System.out.println();
	}
	
	public static void Question4() {
		System.out.println("Question 4:");
		//The variable list1 and list2 are reference arrays that each have 5 elements. 
		//Write code that copies the values in list1 to list2. Values in list1 are input by user.
		
		int[] list1 = new int[5];
		int[] list2 = list1;
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter numbers:");
		for(int i=0; i<list1.length; i++) {
			list1[i]=in.nextInt();
		}
		System.out.println();
		
		System.out.println("List 1:");
		for(int i=0; i<list1.length; i++) {
			System.out.println(list2[i]);
		}
		System.out.println();
		
		System.out.println("List 2:");
		for(int i=0; i<list2.length; i++) {
			System.out.println(list2[i]);
		}
		
	}

}
