package com.deloitte;

public class UserMainCode {

	
	public static boolean checkTripplets(int[] a) {
		
		int k;
		for(int i=0;i<a.length;i++)
		{
			k=0;
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j])
					k++;
			}
			if(k==3)
				return true;
				
				
		}
		return false;
		
	}
}
