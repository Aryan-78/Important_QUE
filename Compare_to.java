//https://open.kattis.com/problems/lineup

import java.util.Scanner;
public class Compare_to {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String arr[] = new String[a];
		for(int i =0;i<a;i++) {
			arr[i]=sc.next();
		}
		System.out.println(method(arr));
		sc.close();
	}
	
	static String method(String arr[]) {
		boolean done = true;
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i].compareTo(arr[i+1])>0) {
				done=false;
				break;
			}
		}
		if(done) return "INCREASING";
		else {
			done = true;
			for(int i =0;i<arr.length-1;i++) {
				if(arr[i].compareTo(arr[i+1])<0) {
					done=false;
					break;
				}
			}
			if(done) return "DECREASING";
			else return "NEITHER";
		}
	}
}