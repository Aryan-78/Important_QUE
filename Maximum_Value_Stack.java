// https://www.hackerrank.com/challenges/maximum-element/problem
/*
 * 
 * Here we create a Node that is been stacking up which has a max value and its value 
 * 
 * */
import java.io.*;
import java.util.*;

class node{
    int ele;
    int currmax;
    node(int a, int b){
        ele = a;
        currmax = b;
    }
}
class Results {

    /*
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

public static List<Integer> getMax(List<String> q) {
    // Write your code here
        Stack<node> st=new Stack<node>();
        List <Integer> ans = new ArrayList<>();
        int max=0;
        for(int i=0;i<q.size();i++)
        {
            String temp=q.get(i);
            int x=temp.charAt(0)-'0';
            if(x==1)
            {
                int num=Integer.parseInt(temp.substring(2));
                max=Math.max(max,num);
                node newnode=new node(num,max);
                st.add(newnode);
            }
            else if(x==2)
            {
                st.pop();
                if(st.size()>0)
                {
                    max=st.peek().currmax;
                }
                else
                {
                    max=0;
                }
            }
            else
            {
                ans.add(st.peek().currmax);
            }
        }

        return ans;


    }

}

public class Maximum_Value_Stack {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	sc.nextLine();
    	List<String>ops = new ArrayList<String>();
    	for(int i=0;i<a;i++) {
    		ops.add(sc.nextLine());
    	}
        List<Integer> res = Results.getMax(ops);
        for(int i:res) {
        	System.out.println(i);
        }
        sc.close();
    }
}
