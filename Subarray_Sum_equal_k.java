/*
 * https://leetcode.com/problems/subarray-sum-equals-k/submissions/
 * 
 * */

import java.util.HashMap;
import java.util.Scanner;

public class Subarray_Sum_equal_k {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int b = sc.nextInt();
		System.out.println(Target(arr,b));
		sc.close();
	}
	static int Target(int[] nums, int k) {
	  int ans=0;
		HashMap<Integer,Integer> freq = new HashMap<>();
		int sum=0;
		for(int i:nums) {
			sum+=i;
			if(sum==k) ans++;
			if(freq.containsKey(sum-k)) {
				ans+=freq.get(sum-k);
			}
			if(freq.containsKey(sum)) freq.put(sum, freq.get(sum)+1);
			else freq.put(sum, 1);
		}
		return ans;
    }
}
