package a04geeksforgeeks;

public class Point {
    protected int x,y;
    public Point(){

    }
    public Point(int _x,int _y){
        this.x=_x;
        this.y=_y;
    }
}

class Main2{
    public static void main(String[] args) {
        Point obj = new Point();
        System.out.println(obj.x);
    }
}
