package bloomfilter;

import java.util.*;

/*
	Custom hash object to hash a string 
*/
public class StringHash implements Hashable<String> {
	// the method used is to multiply each character with a prime number and then take
	// the module
	private int prime;

	public StringHash(int prime) {
		this.prime = prime;
	}

	public int hash(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); ++i) {
			sum  = sum * 31 + str.charAt(i);
		}
		return sum;
	}
}