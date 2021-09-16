// https://www.hackerrank.com/contests/algorithms-practice-match-2/challenges/missing-numbers
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Missing_No {

    static void solve(int a[],int b[],ArrayList<Integer> ans)
    {
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;int j=0;
        while(i<a.length&&j<b.length)
        {
            while(j<b.length&&a[i]>b[j])
            {
                if(ans.size()>0)
                {
                    if(ans.get(ans.size()-1)!=b[j])
                    {
                        ans.add(b[j]);
                    }
                }
                else
                {
                    ans.add(b[j]);
                }
                j++;
            }
            while(i<a.length&&j<b.length&&a[i]==b[j])
            {
                i++;j++;
            }
            while(i<a.length&&a[i]<b[j])
            {
                i++;
            }
        }

        while(j<b.length)
        {
            if(ans.size()>0)
            {
                if(ans.get(ans.size()-1)!=b[j])
                {
                    ans.add(b[j]);
                }
            }
            else
            {
                ans.add(b[j]);
            }
            j++;
        }
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int m=s.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=s.nextInt();
        }

        ArrayList<Integer> ans=new ArrayList<Integer>();

        solve(a,b,ans);

        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
        s.close();
    }

}