package com.array;

import java.util.Scanner;

public class MatTransp {
	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int row=sc.nextInt();
		System.out.println("enter number of columns");
		int col=sc.nextInt();
		
		int Mat[][]=new int[row][col];
		int MatT[][]=new int [col][row];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				Mat[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				MatT[i][j]=Mat[j][i];
			}
		}
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(MatT[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	
	

}
