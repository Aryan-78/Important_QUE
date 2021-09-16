/*
 * https://leetcode.com/problems/largest-rectangle-in-histogram/
 * 
 * find maximum no of width the rectangle form with the specific height 
 * 
 */

public class largest_rectangle_in_histogram {

	public static void main(String[] args) {
		int[] arr = {2,1,5,6,2,3};
		int length = arr.length;
		int max = 0;
		for(int i =0;i<length;i++) {
			
			int counter=i-1;
			int width=1;
			while(counter>=0){
				if(arr[counter]>=arr[i]) {
					width+=1;
					counter--;
				}
				else break;
			}
			
			counter=i+1;
			while(counter<length) {
				if(arr[counter]>=arr[i]) {
					width+=1;
					counter++;
				}
				else break;
			}
			int ans = width*arr[i];
			max = Math.max(max, ans);
		}
		System.out.println(max);
	}

}
