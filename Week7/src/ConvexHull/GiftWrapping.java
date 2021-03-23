package ConvexHull;

import java.util.Stack;
public class GiftWrapping {
	
	//finding the direction of the coordinates
	public int direction(Coordinate p,Coordinate q, Coordinate r) {
		int area=(q.x-p.x)*(r.y-q.y)-(q.y-p.y)*(r.x-q.x);
		return area;
	}
	
	public void ConvexHall(Coordinate point[]) {
		Stack<Coordinate> stack=new Stack<Coordinate>();//stack of type class
		int left=0;//index
		int n=point.length;
		//finding the left most point
		for(int i=1;i<n;i++) {
			if(point[i].x<point[left].x) {
				left=i;
			}
		}
		int p=left;
		
		//finding the convex hall points
		do {
			stack.add(point[p]);
			int q=(p+1)%n;
			for(int r=0;r<n;r++) {
				if(direction(point[p],point[q],point[r])>0) {
					q=r;
				}
			}
			p=q;
		}while(p!=left);
		stack.add(point[p]);
		
		//display
		for(Coordinate i:stack) {
			System.out.println("Convex Hall point ("+i.x+","+i.y+")");
		}
		
	}//convex hall method ends
}
