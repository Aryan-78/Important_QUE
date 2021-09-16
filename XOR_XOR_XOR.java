/*
 * 2
 * 3
 * 1 2 3
 * 4
 * 4 5 7 5
 * 
 * https://www.hackerrank.com/contests/w9/challenges/sansa-and-xor
 * 
 * Here we have to xor 
 * 1^2^3^(1^2)^(2^3)^(1^2^3)
 * 
 * As we look 
 * 
 * freq of 1 = 3 
 * freq of 2 = 4 
 * freq of 3 = 3
 * 
 *  Therefore we take odd no's 
 *  
 *  and in 4 5 7 5
 *  
 *  4^(4^5)^(4^5^7)^(4^5^7^5)^5^(5^7)^(5^7^5)^7^(7^5)^5
 *  
 *  freq of 4 = 4
 *  freq of 5 = 6
 *  freq of 4 = 6
 *  freq of 5 = 4
 *  
 *  Therefore ans is 0
 *  
 * */
import java.util.Scanner;
public class XOR_XOR_XOR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i =0;i<a;i++) {
			int b = sc.nextInt();
			int[] arr= new int[b];
			for(int j =0;j<b;j++) {
				arr[j]=sc.nextInt();
			}
			ans(arr);
		}
		sc.close();
	}
	static void ans(int[] arr) {
		int a = arr.length;
		if(a%2==0) System.out.println(0);
		else {
			int ans=0;
			for(int i=0;i<a;i+=2) {
				ans^=arr[i];
			}
			System.out.println(ans);
		}
	}
}
