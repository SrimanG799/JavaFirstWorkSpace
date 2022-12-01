package com.kumar;

public class SerialArray {
	public static void main(String[] args) 
	{
		int[] Arr= {2,3,4,2,5,3,6,2,8,9,10,9,20,21,22,5,9,7,8,9,10,11,12,13,14};
		for(int i=0;i<Arr.length-2;i++)
		{
			if(Arr[i]+1==Arr[i+1]&&Arr[i+1]+1==Arr[i+2])
				
			{
				System.out.println(Arr[i]+" "+Arr[i+1]+ " " +Arr[i+2] +" are serial ");
				
			}
		}
	}

}
