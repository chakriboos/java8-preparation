package java8.bitset;

import java.util.BitSet;

public class BitSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitSet bs = new BitSet(5);
		for(int i = 0; i < 5; i++) {
			System.out.println(bs.get(i));
		}
		for (int i = 0; i < 3; i++)
			bs.set(i);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(bs.get(i));
		}
	}

}
