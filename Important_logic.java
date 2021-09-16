// https://www.youtube.com/watch?v=bCGuSDKJhfc
// https://codeforces.com/problemset/problem/279/B


import java.util.Scanner;
class Important_logic
{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int book = sc.nextInt();
		int time = sc.nextInt();
		int[] arr = new int[book];
		for(int i=0;i<book;i++) {
			arr[i]=sc.nextInt();
		}
		
		int i=0,j=0;
		int Max=0;
		int sum=0;
		
		while(j<book) {
			sum+=arr[j];
			while(sum>time) {
				sum-=arr[i];
				i++;
			}
			Max=Math.max(Max, j-i+1);
			j++;
		}
		System.out.println(Max);
		sc.close();
	}
}