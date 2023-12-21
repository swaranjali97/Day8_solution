package uc4;

import java.util.Scanner;

public class TestLine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first point coordinates as x1, y1");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		
		System.out.println("enter second point coordinates as x2, y2");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		Line l1=new Line(x1,y1,x2,y2);
		
		System.out.println("enter first point coordinates as a1, b1");
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		
		System.out.println("enter second point coordinates as a2, b2");
		int a2=sc.nextInt();
		int b2=sc.nextInt();
		
		Line l2=new Line(a1,b1,a2,b2);
		
		double Length_l1=l1.calLength(x1, y1, x2, y2);
		double Length_l2=l2.calLength(a1, b1, a2, b2);
		
		if(Length_l1==Length_l2) {
			System.out.println("Both lines are same in length");
		}
		else 
			System.out.println("Lines are not same");
		
		
		
	}

}
