package com.yaseen.floor.main;

import java.util.Scanner;

import com.yaseen.floor.service.Floor;


public class Driver {

	public static void main(String[] args)
	{
		//creating object for Floor class
		Floor fc = new Floor();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of floor in the building");
		int size = sc.nextInt();
		int[] floor= new int[size+1];

		for(int i =1;i < size+1; i++)
		{
			System.out.println("Enter the floor size given on day :" + i);
			int day = sc.nextInt();
			floor[day]=i;
		}

		//calling method of Floor class
		fc.floorStack(size,floor);

		//close connection of Scanner class otherwise it gives warning
		sc.close();
	}
}
