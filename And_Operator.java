/*
 * Important Question
 * 
 * https://www.hackerrank.com/challenges/and-product/problem
 * 
 * https://www.youtube.com/watch?v=s05rWI1jNl4
 * 
 * */

import java.util.Scanner;
public class And_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			long b = sc.nextInt();
			long c = sc.nextInt();
			System.out.println(ans(b,c));
		}
		sc.close();
	}
	static long ans(long b, long c) {
		long ans=0;
		int bit_no=0;
		while(b>0&&c>0) {
			long x=b&1;
			long y=c&1;
			if(x==1&&y==1) {
				ans+=(long)Math.pow(2, bit_no);
			}else if(x!=y) {
				ans=0;
			}
			bit_no+=1;
			b=b>>1;
			c=c>>1;
		}
		return ans;
	}
}