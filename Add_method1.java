package array_list_in_java;
import java.util.ArrayList;

public class Add_index_method {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(40.56);
		l1.add('A');
		l1.add(null);
		l1.add(true);
		l1.add("Keerthi");
		System.out.println(l1);
		l1.add(2, 'B');
		System.out.println("====================================");
		System.out.println(l1);
	}

}
