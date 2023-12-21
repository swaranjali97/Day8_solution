import java.util.Scanner;

public class CompareLineLength {

	@SuppressWarnings("deprecation")
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
		double lengthOfLine1=Math.sqrt((x*x)+(y*y));
		
		System.out.println("enter second line details");
		System.out.println("enter first point co-ordinates as x3 and y3 respectively");
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		System.out.println("enter second point co-ordinates as x4 and y4 respectively");
		int x4=sc.nextInt();
		int y4=sc.nextInt();
		int a=x4-x3;
		int b=y4-y3;
		double lengthOfLine2=Math.sqrt((a*a)+(b*b));
		

		Double l1=new Double(lengthOfLine1);
		Double l2=new Double(lengthOfLine2);
		
		if(l1.equals(l2))
			System.out.println("Both lines are same in length");
		else
			System.out.println("Lines are not same in length");
		

	}

}
