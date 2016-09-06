import java.util.Scanner;
import java.io.*;

public class FizzBuzz {
	
	static void fizzbuzz(int X, int Y, int i) {
		
		if ((i+1)%X == 0 && (i+1)%Y == 0) {
			System.out.print("FB ");
		} else if ((i+1)%X == 0 && (i+1)%Y != 0) {
			System.out.print("F ");
		} else if ((i+1)%X != 0 && (i+1)%Y == 0) {
			System.out.print("B ");
		} else {
			System.out.print(i+1 + " ");
		}	
	}
	
	static boolean validTest(int X, int Y, int N) {
		
		if (X > 20)
			return false;
		if (Y > 20)
			return false;
		if (N  > 100 || N < 21)
			return false;
		
		return true;
	}

	public static void main(String[] args) throws IOException{

		File inFile = new File (args[0]);
		
		Scanner sc = new Scanner (inFile);
		
		int line = 1;
		while (sc.hasNextInt() && 20 > line) {
			
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int N = sc.nextInt();
			
			if(validTest(X, Y, N)) {
			
				for (int i=0; i<N; i++) {
				
					fizzbuzz(X, Y, i);	
				
				}
				System.out.print("\n");
				
			} else
				
				System.out.println("Invalid set of values on line" + line +".");
			
			line++;
		}
		sc.close();
	}
}
