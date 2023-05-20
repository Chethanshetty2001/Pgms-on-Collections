package array_list_in_java;
import java.util.ArrayList;

public class Remove_method {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add("Goa");
		l1.add("Mava");
		l1.add("Mandya");
		l1.add("Benglore");
		l1.add("Keerthi");
		System.out.println("*****Before*****");
		System.out.println(l1);
		l1.remove(2);
		System.out.println("*****After*****");
		System.out.println(l1);
	}

}
