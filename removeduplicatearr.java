package Array;

public class removeduplicatearr {

	public static void main (String args[])
	
	{
		int[] a = {1,1,2,2,3,3,2,2,4};
		
		int n= a.length;
		int j = 0;
		
		 for (int i = 0; i < n - 1; i++) {
	            if (a[i] != a[i + 1]) {
	            	
	                a[j] = a[i];
	                j=j+1;
	            }
	        }
	 
		 a[j++] = a[n - 1];
		 
		 
		 for (int i = 0; i < j; i++)
	            System.out.print(a[i] + " ");
	
}}