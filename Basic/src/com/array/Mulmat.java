package com.array;

import java.util.Scanner;

public class Mulmat {
	public static void main(String[] args)
	{
		{
			 Scanner sc=new Scanner(System.in);
			 System.out.println("first matrix");
			 System.out.println("enter number of rows");
			 int row1=sc.nextInt();
			 System.out.println("enter number of coloms");
			 int col1=sc.nextInt();
			 int mat1[][]=new int[row1][col1];
			 System.out.println("enter the values in matrix");
			 for(int i=0;i<row1;i++)
			 {
				 for(int j=0;j<col1;j++)//filling matrix1
				 {
					mat1[i][j]=sc.nextInt(); 
				 }
			 }
			 System.out.println("second matrix");
			 System.out.println("enter number of rows");
			 int row2=sc.nextInt();
			 System.out.println("enter number of coloms");
			 int col2=sc.nextInt();
			 int mat2[][]=new int[row2][col2];
			 System.out.println("enter the values in matrix");
			 for(int i=0;i<row2;i++)
			 {
				 for(int j=0;j<col2;j++)//filling matrix2
				 {
					mat2[i][j]=sc.nextInt(); 
				 }
			 }
			 int sum=0;
			int[][] mat3 =new int[row1][col2];
			 /*
			 int mat3[][]=new int[row1][col1];
			 //addition of matrix
			 for(int i=0;i<row1;i++)
			 {
				 foint j=0;j<col1;j++)
				 {
					 
					 mat3[i][j]=mat1[i][j]+mat2[i][j];
				 }
			 }*/
			 //printing result matrix(mat3)
			 if(col1==row2)//from matrix rule first column==second row
			 {
			 for(int i=0;i<row1;i++)//i represents rows 
			 {
				 for(int j=0;j<col2;j++)//j value represents columns
					 
				 {
					 for(int k=0;k<col1;k++)//k for iterations for matrix multiplication equals to col1 or row2
					 {
						 sum=sum+mat1[i][k]*mat2[k][j];//after* result is saved in sum
						 
					
					 
				 }
				 mat3[i][j]=sum;//sum is inserted in mat3 with use of i,j
				 sum=0;
			 }
		
			 }
			 
			 for(int i=0;i<row1;i++)
			 {
				 for(int j=0;j<col2;j++)
				 {
					 System.out.print(mat3[i][j]+" ");
				 }
				 System.out.println(" ");
			 }
			
			 }
	}
			}

	}


