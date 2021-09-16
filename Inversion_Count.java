//import java.util.Scanner;
public class Inversion_Count {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the length of the array: ");
//		int a = sc.nextInt();
//		System.out.println("Enter the element for the array: ");
//		int arr[]=new int[a];
//		for(int i =0;i<a;i++) {
//			arr[i]=sc.nextInt();
//		}
		int arr[]= {1,4,2,4,7,1,6}; // Inversion Count for respective places are {0,2,1,1,2,0,0}
		Sort so = new Sort(arr);
		so.mergeSort(0, 6);
		System.out.println(so.count);
	}
}

class Sort{
	int arr[];
	int count=0;
		
	Sort(int NEWARR[]){
		arr=NEWARR;
	}
	
	int merge(int ls,int le,int rs,int re) {
		int array[] = new int[re-ls+1];
		int pointer = 0;
		int st = ls;
		int st_r = rs;
		int counter=0;
		while(rs<=re && ls<=le) {
			if(arr[ls]<=arr[rs]) {
				counter+=(rs-st_r);
				array[pointer++]=arr[ls++];
			}else {
				array[pointer++]=arr[rs++];
			}
		}
		while(ls<=le) {
			array[pointer++]=arr[ls++];
		}
		while(rs<=re) {
			array[pointer++]=arr[rs++];
		}
		
		for(int i=0;i<pointer;i++) {
			arr[i+st]=array[i];
		}
		print();
		return counter;
	}
	
	int mergeSort(int start,int end) {
		
		if(start==end) {
			return 0;
		}
		
		int mid=(start+end)/2;
		
		count+=mergeSort(start, mid);
		count+=mergeSort(mid+1,end);
		count+=merge(start,mid,mid+1,end);
		return count;
	}
	
	void print() {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}