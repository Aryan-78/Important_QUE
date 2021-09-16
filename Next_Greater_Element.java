// https://www.youtube.com/watch?v=8cDy8CAfNNw

/*
 * let arr = [3,4,2,5,8,4,7,3,8,2,1]
 * 
 * Then next greater element are : - 
 * 
 * ans = [4,5,5,8,-1,7,8,8,-1,-1,-1]
 * 
 */

import java.util.Stack;
public class Next_Greater_Element {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		int [] arr= {3,4,2,5,8,4,7,3,8,2,1};
		int length = arr.length;
		int[] ans=new int[length];
		
		for(int i=0;i<length;i++) {
			while(!s.isEmpty() && arr[s.peek()]<arr[i] ) {
				ans[s.pop()]=arr[i];
			}
			s.push(i);
		}
		while(!s.isEmpty()) {
			ans[s.pop()] = -1;
		}
		
		
		for(int i=0;i<length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
