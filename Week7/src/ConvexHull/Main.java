package ConvexHull;

import java.util.Scanner;
public class Main {
	//allocating points
	public static void main(String[] args) {

		//Points generated by random function
		System.out.println("Enter the number of points you want to generate:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Coordinate point[]=new Coordinate[size];
		for(int i=0;i<size;i++) {
			int x=(int)( Math.random()*100+1);
			int y=(int)( Math.random()*100+1);
			point[i]= new Coordinate(x,y);
		}
		
		
		GiftWrapping gfw=new GiftWrapping();
		gfw.ConvexHall(point);
		
	}

}
