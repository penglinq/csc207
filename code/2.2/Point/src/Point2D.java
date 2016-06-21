public class Point2D {
	int x, y;
	
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point2D(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	public Point2D add(int dx, int dy) {
		Point2D point = new Point2D(this.x + dx, this.y + dy);
		return point;
	}
	
	public void translate(Point2D point) {
		this.x += point.x;
		this.y += point.y;
	}
	
	public double distance(int a, int b) {
		return Math.sqrt(Math.pow(a - this.x,2) + Math.pow(b-this.y, 2));
	}
	
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";	
	}
}
