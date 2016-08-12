package java5.generics;

public class GenWithMoreTypeParam<T extends Number> {
	T[] nums;
	
	GenWithMoreTypeParam(T[] obj) {
		this.nums = obj;
	}
	
	double calcAvg() {
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i].doubleValue();
		}
		System.out.println("AVG: " + sum/nums.length);
		return sum/nums.length;
	}
	
	boolean sameAvg(GenWithMoreTypeParam<?> obj) {
		if(calcAvg() == obj.calcAvg()) 
			return true;
		return false;
	}
}
