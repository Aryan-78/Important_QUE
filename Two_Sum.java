/*
 * https://leetcode.com/problems/two-sum/submissions/
 * */

import java.util.Scanner;
import java.util.TreeMap;

public class Two_Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of element you want to add in an array :");
		int a=sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter the elements :");
		for(int i=0;i<a;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter the target");
		int target = sc.nextInt();
		int[] ans = solution(arr,target);
		System.out.println("Your Output: ");
		for(int i:ans) {
			System.out.print(i+" ");
		}
		sc.close();
	}
	
	static int[] solution(int[] arr, int target) {
		TreeMap<Integer,Integer> arrset = new TreeMap<>();
		int[] ans=new int[2]; 
		int len = arr.length;
		for(int i=0;i<len;i++) {
			if(arrset.containsKey(target-arr[i])) {
				ans[0]=arrset.get(target-arr[i]);
				ans[1]=i;
				break;
			}else {
				arrset.put(arr[i], i);
			}
		}
		return ans;
	}
}
