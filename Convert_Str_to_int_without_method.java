import java.util.Scanner;
public class Convert_Str_to_int_without_method {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element for digit: ");
		String a = sc.nextLine();
		sc.close();
		
		//Here If we add directly it will add the ascci value
		
		int wrong = 0;
		for(int i=0;i<a.length();i++) {
			wrong+=wrong*10+a.charAt(i);
		}
		System.out.println(wrong);
		
		// As if we print the value of character it will be in a state of char but if we add them
		// It turns into ascii
		
		int nu=0;
		for(int i =0;i<a.length();i++) {
			nu=nu*10+(a.charAt(i)-'0');
		}
		System.out.println(nu);
	}
}