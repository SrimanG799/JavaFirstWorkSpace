package com.array;

import java.util.Scanner;

public class DetOF3 {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr rows");
		int row=sc.nextInt();
		System.out.println("enter coloumn");
		int col =sc.nextInt();
		System.out.println("enter matrix values");
		int Mat[][]=new int[row][col];
		int MatT[][]=new int[col][row];
		float MatI[][]=new float[col][row];
		float Res[][]=new float[col][row];
		float temp=0;
		float det=0;
		float sum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				Mat[i][j]=sc.nextInt();
			}
		}
		//determination of 3*3 matrix
		 temp=(Mat[0][0]*(Mat[1][1]*Mat[2][2]-Mat[2][1]*Mat[1][2]))-(Mat[0][1]*(Mat[1][0]*Mat[2][2]-Mat[1][2]*Mat[2][0]))+(Mat[0][2]*(Mat[1][0]*Mat[2][1]-Mat[2][0]*Mat[1][1]));
		 det=Math.abs(temp);
		System.out.println(det);
		System.out.println(" ");
	

	for(int i=0;i<col;i++)
	{
		for(int j=0;j<row;j++)
		{
			MatT[i][j]=Mat[j][i];
		}
			
		}
	System.out.println("Transport matrix");
	for(int i=0;i<col;i++)
	{
		for(int j=0;j<row;j++)
		{
		
			System.out.print(MatT[i][j]+" ");
		}
		System.out.println(" ");
	}
	//MatI=1/det*MatT
	for(int i=0;i<col;i++)
	{
		for(int j=0;j<row;j++)
		{
			MatI[i][j]= (MatT[i][j]/det);
		}
	}
	System.out.println("inverse Matrix");
	for(int i=0;i<col;i++)
	{
		for(int j=0;j<row;j++)
			
		{
		
			System.out.print(MatI[i][j]+" ");
		}
		System.out.println(" ");
	}
	//multiplication of Mat and MatI
	System.out.println("resulant Matrix");
	for(int i=0;i<col;i++)
	{
		for(int j=0;j<col;j++)
		{
			for(int k=0;k<col;k++)
			{
				sum=sum+Mat[i][k]+MatI[k][j];
				
			}
			Res[i][j]=sum;
			sum=0;
		}
	}//printing the result matrix
	for(int i=0;i<col;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(Res[i][j]+" ");
			
		}
		System.out.println(" ");
	}
	
	}

}
