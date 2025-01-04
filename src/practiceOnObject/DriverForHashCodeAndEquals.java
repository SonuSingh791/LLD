package practiceOnObject;

import java.util.HashMap;

public class DriverForHashCodeAndEquals {

	public static void main(String[] args) {
		Points[] points = new Points[10];
		points[0] = new Points(0, 0);
		points[1] = new Points(1, 5);
		points[2] = new Points(2, 3);
		points[3] = new Points(5, 4);
		points[4] = new Points(2, 3);
		points[5] = new Points(1, 5);
		points[6] = new Points(0, 0);
		points[7] = new Points(2, 3);
		points[8] = new Points(5, 4);
		points[9] = new Points(0, 0);
		
		System.out.println(points[0].hashCode());
		System.out.println(points[6].hashCode());
		System.out.println(points[9].hashCode());
		
		System.out.println(points[0].equals(points[6]));
		System.out.println(points[6].equals(points[9]));
		System.out.println(points[0].equals(points[9]));
		
		

		
		
		
		HashMap<Points, Integer> map = new HashMap<>();
		for(Points p: points) {
			if(map.containsKey(p)) {
				map.put(p, map.get(p) + 1);
			} else {
				map.put(p,  1);
			}
		}
		
		System.out.println(map);
	}

}
