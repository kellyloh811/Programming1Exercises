
public class SumAverageRunningInt {

	public static void main(String[] args) {
		
		int lowerbound = 1;
		int upperbound = 100;
		
		//For
		int sumf = 0;
		double averagef;
		
		System.out.println("1. For Loop");
		for (int numberf=lowerbound; numberf<=upperbound; ++numberf) {
			sumf+=numberf; //same as sum=sum+number
		}
		
		averagef=sumf/100.00;
		
		System.out.println("The sum of 1 to 100 is "+ sumf);
		System.out.println("The average is " + averagef);
		System.out.println();
		
		//While
		int sumw = 0;
		double averagew;
		System.out.println("2. While Loop");
		int numberw=lowerbound;
		while(numberw<=upperbound) {
			sumw+=numberw;
			++numberw;
		}
		
		averagew=sumw/100.00;
		
		System.out.println("The sum of 1 to 100 is " + sumw);
		System.out.println("The average is " + averagew);
		System.out.println();
		
		//Do While
		int sumd = 0;
		double averaged;
		System.out.println("3. Do While Loop");
		int numberd=lowerbound;
		do {
			sumd+=numberd;
			++numberd;
			
		}while(numberd<=upperbound);
		
		averaged=sumd/100.00;
		
		System.out.println("The sum of 1 to 100 is " + sumd);
		System.out.println("The average is " + averaged);
		
	}

}
