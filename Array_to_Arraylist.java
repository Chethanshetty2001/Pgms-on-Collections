package array_list_in_java;

import java.util.ArrayList;

public class Array_to_Arraylist {
	public static void main(String[] args) {
		
		int [] arr={ 10,20,30,40};
		ArrayList l1=new ArrayList();
		for(int i=0;i<arr.length;i++)
		{
			l1.add(arr[i]);
		}
		System.out.println(l1);
	}
}
