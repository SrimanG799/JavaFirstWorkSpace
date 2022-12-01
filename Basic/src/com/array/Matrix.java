package com.array;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter number of rows");
	 int row=sc.nextInt();
	 System.out.println("enter number of coloms");
	 int col=sc.nextInt();
	 int mat1[][]=new int[row][col];
	 System.out.println("enter the values in matrix");
	 for(int i=0;i<row;i++)
	 {
		 for(int j=0;j<col;j++)//filling matrix
		 {
			mat1[i][j]=sc.nextInt(); 
		 }
	 }
	 //printing matrix
	 
	 for(int i=0;i<row;i++)
	 {
		 for(int j=0;j<col;j++)
		 {
			 System.out.print(mat1[i][j]+" ");
		 }
		 System.out.println(" ");
	 }
	}

}
