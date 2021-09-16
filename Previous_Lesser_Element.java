//  https://www.youtube.com/watch?v=8cDy8CAfNNw

/*
 * let arr = [2,3,1,4,5,2,1,4]
 * 
 * Then next greater element are : - 
 * 
 * ans = [-1,2,-1,1,4,1,-1,1]
 * 
 */

import java.util.Stack;
public class Previous_Lesser_Element {
	public static void main(String[] args) {
		Stack<Integer> s =new Stack<>();
		int[] arr = {2,3,1,4,5,2,1,4};
		int length = arr.length;
		int[] ans = new int[length];
		
		for(int i = length-1;i>=0;i--) {
			while(!s.isEmpty() && arr[s.peek()]>arr[i]) {
				ans[s.pop()]=arr[i];
			}
			s.push(i);
		}
		while(!s.isEmpty()) {
			ans[s.pop()]=-1;
		}
		
		for(int i=0;i<length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
