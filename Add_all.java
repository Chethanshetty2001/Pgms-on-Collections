package array_list_in_java;
import java.util.ArrayList;

public class Add_all_index_method {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(40.56);
		l1.add('A');
		l1.add(null);
		l1.add(true);
		l1.add("Keerthi");
		ArrayList l2=new ArrayList();
		l2.add(50);
		l2.add(60);
		l2.add(70);
		l2.add(80);
		l2.add(90);
		System.out.println("*****Before*****");
		System.out.println(l1);
		System.out.println(l2);
		l1.addAll(3, l2);
		System.out.println("*****After*****");
		System.out.println(l1);
		System.out.println(l2);
	}

}
