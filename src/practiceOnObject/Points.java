package practiceOnObject;

public class Points {
	private int x;
	private int y;
	
	Points(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + this.x + ", " + this.y + "]";
	}
	
	// we have to override hashCode bcs actual implementation of hashCode may give the different hashCode for same points or may be same.
	// that's why we have to override so that it gives the same hashCode for same points.
	
	// HashMap call hashCode
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.x + this.y; // we can return anything to generate hashCode e.g(x - y), (x * y).
		// for point (1,2) hc = 3 % bucketSize (say 4) = 3, point(3,4) hc = 7 % 4 = 3.
		// these point will be in the same bucket, if we put another (1,3) hc = 3, it will check in bucket 3 whether (1,3) present or not by calling equals() function.
		// if it is equal then return true, and increase the count.
	}
	
	// HashMap will call equals
	@Override
	public boolean equals(Object obj) {
		Points other = (Points)obj;
		
		if(this.x == other.x && this.y == other.y) {
			return true;
		} else {
			return false;
		}
	}
}
