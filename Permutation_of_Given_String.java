// https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1
// https://www.youtube.com/watch?v=1jj8OW1Po6A

import java.util.Scanner;
import java.util.ArrayList;


public class Permutation_of_Given_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int[] Letter = new int[26];
		for(int i=0;i<a.length();i++) {
			Letter[a.charAt(i)-'A']=1;
		}
		ArrayList<String> ans = new ArrayList<>();
		solve(ans,"",Letter,a.length());
		sc.close();
		for(String j:ans) {
			System.out.println(j);
		}
	}
	
	static void solve(ArrayList<String> ans, String string, int[] letter, int length) {
		if(string.length()==length) {
			ans.add(string);
			return;
		}
		for(int i=0;i<26;i++)
		{
			if(letter[i]>0) 
			{
				char a=(char)(i+'A');
				letter[i]=0;
				solve(ans,string+a,letter,length);
				letter[i]=1;
			}
		}
	}
}