package com.array;
import java.util.Scanner;

public class MatAdd {



		public static void main(String[] args)
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
		 int mat3[][]=new int[row1][col1];
		 //addition of matrix
		 for(int i=0;i<row1;i++)
		 {
			 for(int j=0;j<col1;j++)
			 {
				 
				 mat3[i][j]=mat1[i][j]+mat2[i][j];
			 }
		 }
		 //printing result matrix(mat3)
		 if(row1==row2&&col1==col2)
		 {
		 for(int i=0;i<row1;i++)
		 {
			 for(int j=0;j<col1;j++)
			 {
				 System.out.print(mat3[i][j]+" ");
				 
			 }
			 System.out.println(" ");
		 }
	
}
		 else
		 {
			 System.out.println("matrix addition is not possible");
		 }
}
		}
