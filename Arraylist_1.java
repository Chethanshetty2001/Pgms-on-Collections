package array_list_in_java;

import java.util.ArrayList;

public class Arraylist_char_int {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add('A');
		l1.add('B');
		l1.add('C');
		l1.add('D');
		int[] arr=new int[l1.size()];
		for(int i=0;i<l1.size();i++)
		{
			arr[i]=(int)(char)l1.get(i);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
