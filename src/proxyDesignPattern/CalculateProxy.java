package proxyDesignPattern;
import java.util.HashMap;// what proxy does? it used to caching, protecting something(like we protect route), remote
// proxy class add something smartness to existing real work function.

public class CalculateProxy implements ICalculate {
	// proxy class contains everything as it is as real work class, only difference is it add something extra to existing fucs like caching or if user is logged in then only give user details
	RealWork rw = new RealWork();
	HashMap<Integer, Integer> hm = new HashMap<>();
	public int calculate(int r) {
		if(hm.containsKey(r)) {
			System.out.println("Result was cached");
			return hm.get(r);
		}
		int res = rw.calculate(r);
		hm.put(r, res);
		return res;
	}
}
