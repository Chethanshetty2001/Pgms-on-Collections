package array_list_in_java;
import java.util.ArrayList;
public class Get_method {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20.56);
		l1.add('A');
		l1.add(15);
		for(int i=0;i<l1.size();i++)
		{
			Object o1=l1.get(i);
			System.out.println(o1);
		}
		
	}

}
