/*
 * Let there be a running stream of data 
 * 
 * [3,2,3,1,2,4,5,5,6]
 * 
 * and you have to find the kth maximum value for that stream 
 * k=4
 * 
 * -1 -1 -1 1 2 2 3 3 4 
 * */

import java.util.PriorityQueue;
public class kth_largest_element_in_an_array {

	public static void main(String[] args) {
		int[] arr = {3,2,3,1,2,4,5,5,6};
		int k = 4;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(i>=k) {
				if(pq.peek()<arr[i]) {
					pq.poll();
					pq.add(arr[i]);
					System.out.println(pq.peek());
				}else {
					pq.peek();
				}
			}else {
				pq.add(arr[i]);
				if(i==k-1) {
					pq.peek();
				}else {
					System.out.println(-1);
				}
			}
		}
	}

}
