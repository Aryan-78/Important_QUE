import java.util.TreeSet;
import java.util.Scanner;
public class Find_median_from_data_stream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The length of the array whose meadian data Stream you want to find");
		System.out.println("Make Sure the data is distinct ");
		int a = sc.nextInt();
		System.out.println("Enter The Element");
		int[] arr = new int[a];
		for(int i=0;i<a;i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println("Your median data stream is:- ");
		Solve(arr);
		sc.close();
	}
	static void Solve(int[] arr) {
		TreeSet<Integer> A = new TreeSet<>();
		TreeSet<Integer> B = new TreeSet<>();
		int counter =0;
		for(int i:arr) {
			if(A.size()==0) {
				A.add(i);
				if(A.size()>B.size()){
					System.out.print(A+" =================> ");
					System.out.print(B+" =================> ");
					System.out.println((double)(A.last()));
				}else {
					System.out.print(A+" =================> ");
					System.out.print(B+" =================> ");
					System.out.println((A.last()+B.first())/2);
				}
				continue;
			}
			else if(B.size()==0) {
				if(A.last()>i) {
					B.add(A.last());
					A.remove(A.last());
					A.add(i);
				}else {
					B.add(i);
				}
				if(A.size()>B.size()){
					System.out.print(A+" =================> ");
					System.out.print(B+" =================> ");
					System.out.println((double)(A.last()));
				}else {
					System.out.print(A+" =================> ");
					System.out.print(B+" =================> ");
					System.out.println((double)(A.last()+B.first())/2);
				}
				continue;
			}
			else if(A.size()==B.size()) {
				if(B.first()<i) {
					A.add(B.first());
					B.remove(B.first());
					B.add(i);
				}else {
					A.add(i);
				}
			}else if(A.size()>B.size()){
				if(A.last()>i) {
					B.add(A.last());
					A.remove(A.last());
					A.add(i);
				}else {
					B.add(i);
				}
			}
			
			if(A.size()>B.size()){
				System.out.print(A+" =================> ");
				System.out.print(B+" =================> ");
				System.out.println((double)(A.last()));
			}else if(A.size()==B.size()){
				System.out.print(A+" =================> ");
				System.out.print(B+" =================> ");
				System.out.println((double)(A.last()+B.first())/2);
			}
			counter++;
		}
	}
}