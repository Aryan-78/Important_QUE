/*
 * 
 * One of the most important question for DEQUE for interview point of view
 * 
 * https://www.youtube.com/watch?v=fg98vG0durM
 * 
 * 
 * */

import java.util.Scanner; 
import java.util.Deque;
import java.util.LinkedList;
public class Sliding_Window_Minimum {

	public static void main(String[] args) {
		System.out.println("Enter the length of the array:-");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter The element for the arrays: ");
		for(int i =0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Window Size:- ");

		int k =sc.nextInt();
		
		int[] ans = slideWindowMinunimum(arr,k); 
		
		System.out.println("Your Minimun window Array is :-");
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		sc.close();
	}
	
	static int[] slideWindowMinunimum(int[] arr, int k) {		
		
		int n = arr.length;
		int[] ans = new int[n-k+1];
		Deque<Integer> dq =new LinkedList<>();
		
		for(int i=0;i<k;i++) {
			while(!dq.isEmpty() && dq.peekLast()>arr[i]) {
				dq.pollLast();
			}
			dq.offerLast(arr[i]);
		}
		
		ans[0]=dq.peekFirst();
		
		for(int i=k;i<n;i++) {
			if(dq.peekFirst()==arr[i-k]) dq.pollFirst();
			while(!dq.isEmpty() && dq.getLast()>arr[i]) {
				dq.pollLast();
			}
			dq.offerLast(arr[i]);
			System.out.println(dq.getFirst());
			ans[i-k+1] = dq.getFirst();
		}

		return ans;
	}

}
