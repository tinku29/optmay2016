package com.chapter2.assignment1;

public class Sort {
	
	public static void main(String[] args) {
		int[] array = {19,34,15,11,9,6,90};
		int n = 7;
		bubbleSort(array,n);
	}
	
	public static void bubbleSort(int[] A, int n)
	{
		int swapPos=n-1, lastSwapPosition=n-1;
		for(int i=0; i<n-1 ; i++)
		{			
			swapPos=lastSwapPosition;
			for(int j=0;j<swapPos;j++)
			{				
				if(A[j]>A[j+1])
				{
					int swap = A[j];
					A[j]=A[j+1];
					A[j+1]=swap;
					lastSwapPosition=j;
				}
				
			}
			//System.out.println("last swap was at"+ (lastSwapPosition+1) +"for pass"+(i+1));
		}
		System.out.println("After sorting");
		for(int k=0; k<n; k++)
		{
			System.out.println(A[k]);
		}
	 }

}
