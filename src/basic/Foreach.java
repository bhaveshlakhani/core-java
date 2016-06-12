package basic;

import java.util.ArrayList;

public class Foreach 

{
	public static void main(String[] args) {
		int a[]={12,2,3,333,};
		String s[]={"heloo","hiii","hows u"};
		
		ArrayList<String> arr1=new ArrayList<String>();
		
		arr1.add("helloo");
		arr1.add("hiiiii");
		arr1.add("hous u");
		
		
		//PRINTING STRING ARRAY
		for(String str:arr1)
		{
			System.out.println(str);
		}
		
		//PRINTING INTEGER TYPE ARRAY
		for(int b: a)
		{
			System.out.println(b);
		}
	}

}
