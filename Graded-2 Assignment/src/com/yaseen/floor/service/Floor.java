package com.yaseen.floor.service;

public class Floor 
{
	
	public void floorStack(int n,int x[]) 
	{

		int max=n;

		boolean flag;

		System.out.println("The order of construction is as follows");

		for (int i = 1; i <= n; i++) 
		{
			flag = false; 
			System.out.println();
			System.out.print("Day:"+i);
			System.out.println();

			//if flag is true it will execute this while loop
			while(max>=1 &&x[max]<= i)
			{
				flag=true;
				System.out.print(max+" "+ " ");
				max--;
			}

			if(flag==true)
			{
				System.out.println();
			}
		}

	}

}
