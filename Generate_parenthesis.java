//    https://practice.geeksforgeeks.org/problems/generate-all-possible-parentheses/1


import java.util.Scanner;
import java.util.ArrayList;
public class Generate_parenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<String> ans = new ArrayList<>();
		solve(a,a,ans,"");
		for(int i =0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
		sc.close();
	}
	
	static void solve(int start, int end, ArrayList<String> ans, String a) {    
											// start and end are the no of parenthesis to be added
		if(start<0||end<0) {                // If the value of start and end is negative
			return;
		}
		if(start>end) {                     // If The close Parenthesis is more than opening ))(
			return;
		}
		if(start==0 && end==0) {           // add only when both start and end == 0
			ans.add(a);
		}
		solve(start-1,end,ans,a+"(");		// compiling the answer in string a
		solve(start,end-1,ans,a+")");
	}
}