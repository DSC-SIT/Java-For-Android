class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point other) {
        this.x=other.x;
	this.y=other.y;
    }
    public void show(){
        System.out.println(x+","+y);
    }
}

public class PointOn{
    public static void main(String args[]){
        Point a = new Point();
        Point b = new Point(2,3);
        Point c = new Point(b);
        a.show();
        b.show();
        c.show();
    }
}
