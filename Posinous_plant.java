//https://www.hackerrank.com/challenges/poisonous-plants/problem

import java.util.*;

class Result {
    public static int poisonousPlants(int[] p) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> ar = new Stack<>();
        
        for(int i:p){
            s1.push(i);
        }
        int counter = 0;
        while(true) {
        	int j = s1.size();
        	for(int i=0;i<j-1;i++){
		        int val = s1.pop();
		        if(s1.peek()>=val) {
		        	ar.push(val);
		        }
		    }
		    ar.push(s1.pop());
		    
		    int x = ar.size();
		    if(j==x) {
		    	break;
		    }
		    
		    for(int i =0 ;i<x;i++) {
		    	s1.push(ar.pop());
		    }
		    counter++;
        }
        return counter;
    }
}

public class Posinous_plant {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr =new int[a] ;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println(Result.poisonousPlants(arr));
        
        sc.close();
    }
}
