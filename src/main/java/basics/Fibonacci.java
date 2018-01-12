package basics;

public class Fibonacci {

		public static void main (String [] args){
			// Fibonnanci numbers are like 
			//no.0 = 0
			//no.1 = 1
			//n0.2 = 1 + 0 = 1
			//no.3 = 1 + 1 = 2
			//no.4 = 2 + 1 = 3 .........
			//no.5 = 3 + 2
			
			
			System.out.println(fibo(3));
		}
		
		public static int fibo(int n){
			if (n == 0){
				return 0;
				
			}else if (n == 1){
				return 1;
			}
			return (fibo(n -1) + fibo(n -2));
		}	
}
