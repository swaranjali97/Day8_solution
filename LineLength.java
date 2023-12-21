package uc;

import java.util.Scanner;

public class LineLength {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first point co-ordinates as x1 and y1 respectively");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		System.out.println("enter second point co-ordinates as x2 and y2 respectively");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int x=x2-x1;
		int y=y2-y1;
		double lengthOfLine=Math.sqrt((x*x)+(y*y));
		System.out.println("length of line is : "+lengthOfLine);
		

	}
}
