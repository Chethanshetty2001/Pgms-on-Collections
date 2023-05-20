package array_list_in_java;
import java.util.ArrayList;
public class Contains_method {
	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("Goa");
		l1.add("Mava");
		l1.add("Mandya");
		l1.add("Benglore");
		l1.add("Keerthi");
		if(l1.contains("Mava"))
		{
			System.out.println("It's Present");
		}
		else
		{
			System.out.println("It's Not Present");
		}
		
	}

}
