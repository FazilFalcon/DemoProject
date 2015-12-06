package com.strings;

public class StringSplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Name = "FAZIL,BASHA,S,N";	
		String Delimiter ="\\,";
		String [] resArray=null;

		 resArray=Name.split(Delimiter);
		 
		 for(int i=0;i<resArray.length;i++)
		 {
			System.out.println(resArray[i]);
		 }
	}

}
