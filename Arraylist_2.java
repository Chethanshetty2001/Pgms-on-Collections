package array_list_in_java;

import java.util.ArrayList;

public class Arraylist_double_integer {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		 l1.add(10);
		 l1.add(20);
		 l1.add(30);
		 l1.add(40);
		 short [] arr=new short[(l1.size())];
		 for(int i=0;i<l1.size();i++)
		 {
			 arr[i]=(short) (int)l1.get(i);
		 }
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
	}

}
