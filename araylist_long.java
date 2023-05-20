package array_list_in_java;

import java.util.ArrayList;

public class aaraylist_long {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10L);
		l1.add(20L);
		l1.add(30L);
		l1.add(40L);
		int[] arr=new int[(l1.size())];
		for(int i=0; i<l1.size();i++)
		{
			arr[i]=  (int) (long) (l1.get(i));
		}
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
