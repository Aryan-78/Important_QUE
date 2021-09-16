import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	LS str = new LS();
    	for(int i=0;i<a;i++) {
    		str.add(sc.nextInt());
    	}
    	str.swap();
    	str.print();
    	sc.close();
    }
}
class LS{
	Nodes head;
	LS(){
		head=null;
	}
	
	void add(int a){
		if(head==null) {
			head = new Nodes(a,null);
			return;
		}
		Nodes temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=new Nodes(a,null);
	}
	
	void print() {
		Nodes temp = head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
	}
	
	void swap() {
		Nodes a = head;
		Nodes b = head.next;
		Nodes c = head.next.next;
		while(b!=null || c!=null) {
			swapval(a,b);
			a=a.next.next;
			if(a==null) break;
			b=b.next.next;
			if(b==null) break;
			c=c.next.next;
		}
	}
	
	void swapval(Nodes a, Nodes b) {
		int x = a.val;
		a.val = b.val;
		b.val = x;
	}
}

class Nodes{
	int val;
	Nodes next;
	Nodes(int val,Nodes next){
		this.val=val;
		this.next=next;
	}
}