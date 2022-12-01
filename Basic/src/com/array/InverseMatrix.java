package com.array;

import java.util.Scanner;

public class InverseMatrix {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter rows of matrix");
		int row=sc.nextInt();
System.out.println("enter colomn number");
int col=sc.nextInt();
float Mat[][]=new float [row][col];
float AdjC[][]=new float[row][col];
float AdjM[][]=new float [row][col];
 float MatI[][]=new float[row][col];
 float MatR[][]=new float [row][col];
float temp;
float det=0;
System.out.println("enter matrix elements");
for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
		Mat[i][j]=sc.nextInt();
	}
}
temp=(Mat[0][0]*(Mat[1][1]*Mat[2][2]-Mat[2][1]*Mat[1][2]))-(Mat[0][1]*(Mat[1][0]*Mat[2][2]-Mat[1][2]*Mat[2][0]))+(Mat[0][2]*(Mat[1][0]*Mat[2][1]-Mat[2][0]*Mat[1][1]));

det=temp;
System.out.println(det);
AdjM[0][0]=(Mat[2][2]*Mat[1][1]-Mat[2][1]*Mat[1][2]);

AdjC[0][1]=-(Mat[2][2]*Mat[1][0]-Mat[2][0]*Mat[1][2]);
AdjC[0][2]=(Mat[2][1]*Mat[1][0]-Mat[1][1]*Mat[0][2]);
AdjC[1][0]=(Mat[2][2]*Mat[0][1]-Mat[2][1]*Mat[0][2]);
AdjC[1][1]=(Mat[0][0]*Mat[2][2]-Mat[2][0]*Mat[0][2]);
AdjC[1][2]=-(Mat[1][0]*Mat[2][1]-Mat[2][0]*Mat[1][1]);
AdjC[2][0]=(Mat[0][1]*Mat[2][2]-Mat[2][1]*Mat[0][2]);
AdjC[2][1]=-(Mat[0][0]*Mat[1][2]-Mat[1][0]*Mat[0][2]);
AdjC[2][2]=(Mat[0][0]*Mat[1][1]-Mat[1][0]*Mat[0][1]);
for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
		
		
			MatI[i][j]=(1/det)*AdjC[j][i];
			
			
		}
		
	}
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(MatI[i][j]);
	}
		System.out.println(" ");
}
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			for(int k=0;k<row;k++)
			{
				MatR[i][j]=Mat[i][k]*MatI[k][j];
			}
			
		}
	}
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(MatR[i][j]);
		}
		System.out.println(" ");
	}



	}

}
