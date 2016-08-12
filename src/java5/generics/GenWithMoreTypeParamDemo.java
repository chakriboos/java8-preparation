package java5.generics;

public class GenWithMoreTypeParamDemo {

	public static void main(String[] args) {
		Integer[] iArray = {1,2,3};
		Double[] dArray = {1.1,2.2,3.3};
		
		GenWithMoreTypeParam<Integer> intArray =  new GenWithMoreTypeParam<Integer>(iArray);
		GenWithMoreTypeParam<Double> doubleArray =  new GenWithMoreTypeParam<Double>(dArray);
		
		//System.out.println(intArray.calcAvg());
		//System.out.println(doubleArray.calcAvg());
		
		System.out.println(intArray.sameAvg(doubleArray));
	}

}
