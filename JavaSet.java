package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;


public class JavaSet {
	
	


		public class UniqueChars{
		
		}
		
		public static void main(String[] args) {
			String CName="google";
			char[] charArray=CName.toCharArray();
			
			Set<Character> unique=new LinkedHashSet();
			for(int i=0;i<charArray.length;i++) {
				unique.add(charArray[i]);
				
			}
		
		System.out.println(unique);
		
		
		

	}

}
