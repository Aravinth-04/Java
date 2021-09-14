package com.string1;

public class String1 {
    
	
	public static void main(String[] args) {
//------------------------count first character---------------------------------
//		String name="aravinth";   
//    	char search=name.charAt(0);  //charAt
//		int count=1;
//    	for(int i=1;i<name.length();i++)
//		{
//			if(name.charAt(i)==search)
//			{
//				count++;
//			}
//		}
//		System.out.println(count);

//----------------------------count of Total vowels in a String--------------
//		String name="education";
//		int count=0;
//		for(int i=0;i<name.length();i++)
//		{
//		switch(name.charAt(i))
//			{
//				case 'a':
//				case 'e': 
//				case 'i': 
//				case 'o':
//				case 'u': count++;
//			}
//		}
//		System.out.println(count);
		
//----------------------------count of each vowels in a String--------------	
//		String name="education education";
//		int acount=0,ecount=0,icount=0,ocount=0,ucount=0;
//		for(int i=0;i<name.length();i++)
//			{
//			switch(name.charAt(i))
//				{
//					case 'a': acount++;break;
//					case 'e': ecount++;break;
//					case 'i': icount++;break;
//					case 'o': ocount++;break;
//					case 'u': ucount++;break;
//				}
//			}
//			System.out.println(acount);
//			System.out.println(ecount);
//			System.out.println(icount);
//			System.out.println(ocount);
//			System.out.println(ucount);
		
//---------------------------vowels present or not-------------------		
//
//		String name="ddd";
//		int count=0;
//		for(int i=0;i<name.length();i++)
//		{
//		switch(name.charAt(i))
//			{
//				case 'a':
//				case 'e': 
//				case 'i': 
//				case 'o':
//				case 'u': count++;
//			}
//		}
//		if(count==0){
//			System.out.println("vowels is not present");}
//		else {
//		System.out.println("vowels is present");}
		
//-------------------------print vowels in a string----------
		String name="aravinth";
		for(int i=0;i<name.length();i++)
			{
			switch(name.charAt(i))
				{
					case 'a':
					case 'e': 
					case 'i': 
					case 'o':
					case 'u': 
						System.out.println(name.charAt(i));
				}
			}
	}

}
