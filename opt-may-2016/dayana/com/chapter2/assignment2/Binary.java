package com.chapter2.assignment2;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		int X[] = new int[100];
		int Y[] = new int[100];
		int Z[] = new int[100];
		int large;
		int a,i, carry =0, p,q;
		int j;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter  a number");
		a=s.nextInt();
		p =a;
		for( i=0;a>0;i++){
			X[i]=a%2;
			a=a/2;
		}		
		System.out.println("Enter second number");
		int b = s.nextInt();
		q=b;
		for( j=0;b>0;j++){
			Y[j]=b%2;
			b=b/2;
		}
		if(p>q)
			large = i;
		else
			large = j;
		for(int k=0; k<=large-1; k++)
		{
			if((X[k]==1) & (Y[k]==1))
			{
				Z[k] = X[k]^Y[k];
				Z[k] = Z[k]^carry;				
				carry =1;				
			}
			else if((X[k]==0) & (Y[k]==0))	
			{
				Z[k] = X[k]^Y[k];
				Z[k] = Z[k]^carry;
				carry =0;
			}
			else if((X[k]==1) & (Y[k]==0))
			{
				Z[k] = X[k]^Y[k];
				if((Z[k]==1) & (carry==1))
				{
					Z[k] = Z[k]^carry;
					carry =1;
				}
				else if(carry ==0)
				{
					Z[k] = Z[k]^carry;
					carry =0;
				}
			}
			else
			{
				Z[k] = X[k]^Y[k];
				if((Z[k]==1) & (carry==1))
				{
					Z[k] = Z[k]^carry;
					carry =1;
				}
				else if(carry ==0)
				{
					Z[k] = Z[k]^carry;
					carry =0;
				}
			}
		}
		//System.out.println("Carry is"+ carry);
		if (carry==1)
		{		
			Z[large] = carry;
		}

		for( i=large;i>=0;i--){
			System.out.print(Z[i]);
		}
		int num =0;
		System.out.println('\n');
		for( int r=0;r<=large;r++){
			num = (int) (num + Z[r]*(Math.pow(2,r)));
		}
		System.out.println("Result :" + num);
		s.close();

	}

}
