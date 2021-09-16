/*
 * First Missing Positive 
 * 
 * https://leetcode.com/problems/first-missing-positive/
 * 
 * https://www.youtube.com/watch?v=lS_nYAdGokw
 * 
 * Here You have given an unsorted integer array nums, return the smallest missing positive integer.
 * 
 * You must implement an algorithm that runs in O(n) time and uses constant extra space.
 * 
 * There are two ways which can be affective
 * 
 *  
 * 
 * */
import java.util.Scanner;

public class First_Missing_Positive {

	public static void main(String[] args) {
		System.out.println("Enter The No of value you want to add in the array :");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] nums = new int[a];
		System.out.println("Enter the elements for the array :");
		for(int i=0;i<a;i++) {
			nums[i]=sc.nextInt();					
		}
		
		System.out.print(Solution(nums));
		
		sc.close();
	}
	
	static int Solution(int[] nums) {
		int n = nums.length;
        
        for(int i=0;i<n;i++){
            if(nums[i]<0 || nums[i]>n) nums[i]=0;
        }
        
        for(int i=0;i<n;i++){
            int j = nums[i]%(n+1);
            if(j!=0) nums[j-1]+=(n+1);
        }

        for(int i=0;i<n;i++){
            if(nums[i]/(n+1)==0) return i+1;
        }
        
        return n+1;
	}
}

/*
 * Here you first limits the data to the length of the array
 * 
 * then you add (n+1) to the no whose value is not zero
 * 
 * and if nums[i]/n+1> 0 then return
 * 
 *  Here %(n+1) will give the value and /(n+1) will be used as a freq
*/
