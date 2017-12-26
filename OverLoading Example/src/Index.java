
public class Index {
	public static void main(String args[]){
		System.out.println(area(5)); //square
		System.out.println(area(5,4)); //rectangle
		System.out.println(area(5.0f)); //circle
	}
	//Area of a square
	public static int area(int side){
		return side*side;
	}
	//Area of a rectangle
	public static int area(int l,int b){
		return l*b;
	}
	//Area of a circle
	public static double area(float radius){
		return Math.PI*radius*radius;
	}
}
