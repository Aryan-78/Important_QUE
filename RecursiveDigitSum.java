//    https://www.hackerrank.com/challenges/recursive-digit-sum/problem 
// Find the sum of all the digit when added if it repeated b time


import java.util.Scanner;
public class RecursiveDigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = sc.nextInt();
		int c = superDigit(a)*b;
		if (c%9==0) System.out.println(9);
		else System.out.println(c%9);
		sc.close();
	}
	
	private static int superDigit(String a) {
		int ans=0;
		if (a.length()==1){
			return Integer.parseInt(a);
		}
		for(int i = 0;i<a.length();i++) {
			ans+=Integer.parseInt(""+a.charAt(i));
		}
		return superDigit(String.valueOf(ans));
	}
}