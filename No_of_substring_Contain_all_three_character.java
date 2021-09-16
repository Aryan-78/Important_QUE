/*
 * https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
 * 
 * */

import java.util.Scanner;
public class No_of_substring_Contain_all_three_character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The string whose you want to find no of \nsubstring containing 'a','b','c' :");
		String a = sc.nextLine();
		System.out.println(solution(a));
		sc.close();
	}
	static int solution(String a) {
		int ans=0;
		int ptr1=0,ptr2=0;
		int[] freq = new int[3];
		int length = a.length();
		freq[a.charAt(0)-'a']++;
		while(ptr2<length) {
			if(freq[0]>0 && freq[1]>0 && freq[2]>0) {
				ans+=length-ptr2;
				freq[a.charAt(ptr1)-'a']--;
				ptr1++;
			}else {
				ptr2++;
				if(ptr2==length) break;
				freq[a.charAt(ptr2)-'a']++;
			}
		}
		return ans;
	}
}
