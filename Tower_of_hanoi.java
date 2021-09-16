//https://www.geeksforgeeks.org/c-program-for-tower-of-hanoi/
//https://www.youtube.com/watch?v=fGBV3GlqrqQ

import java.util.Scanner;
public class Tower_of_hanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		solve(a,1,2,3);
		sc.close();
	}
	
	static void solve(int a,int source,int auxilary,int destination) {
		if(a>0) {
			solve(a-1,source,destination,auxilary);
			System.out.println(source+" "+destination);
			solve(a-1,auxilary,source,destination);
		}
	}
}