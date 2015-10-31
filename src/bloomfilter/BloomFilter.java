package bloomfilter;

import java.util.*;

/**
	Implements of bloom filter, use strategy design pattern, 
	we hold a list of hashable object to apply hash functions. 
*/
public class BloomFilter<T> {
	
	private BitSet bits;
	private List<Hashable<T>> hashFunctions;
	private int size;

	// constructor that take a list of Hashable and a size
	public BloomFilter(List<Hashable<T>> functions, int size) 
		throws IllegalArgumentException {
		
		if (size <= 0) {
			throw new IllegalArgumentException("The size of bloomfilter must larger than 0");
		}

		bits = new BitSet(size);
		this.size = size;
		this.hashFunctions = functions;
	}

	// constructor that take a size, the list of Hashable is intitalized to empty list 
	public BloomFilter(int size) throws IllegalArgumentException {
		this(new ArrayList<Hashable<T>>(), size);
	}

	// add a new Hashable to the hashFunctions
	// apply this function would clear the bloomfilter
	// only use this function at the intital stage
	public int addFunction(Hashable<T> function) {
		this.bits.clear();
		this.hashFunctions.add(function);
		return this.hashFunctions.size();
	}

	// remove a Hashable from the hashFunctions
	// apply this function would clear the bloomfilter
	// only use this funtion at the intital stage
	public int removeFunction(int index) throws ArrayIndexOutOfBoundsException {
		if (index >= this.hashFunctions.size()) {
			throw new ArrayIndexOutOfBoundsException(
				"Index out of boundary. " + 
				"Length :" + this.hashFunctions.size() + 
				"Index: " + index);
		}

		this.bits.clear();
		this.hashFunctions.remove(index);
		return this.hashFunctions.size();
	}

	public int getSize() {
		return this.size;
	}

	// add a new object T to bloom filter
	public void add(T t) throws IllegalArgumentException {
		if (this.hashFunctions.size() <= 0) {
			throw new IllegalArgumentException("No hash functions available.");
		}

		for (Hashable<T> function : this.hashFunctions) {
			int index = function.hash(t) % this.size;
			index = (index < 0) ? index + this.size : index;
			bits.set(index);
		}
	}

	// check if an object is in bloom filter or not
	public boolean contain(T t) throws IllegalArgumentException {
		if (this.hashFunctions.size() <= 0) {
			throw new IllegalArgumentException("No hash functions available.");
		}

		boolean result = true;
		for (Hashable<T> function : this.hashFunctions) {
			int index = function.hash(t) % this.size;
			index = (index < 0) ? index + this.size : index;
			if (bits.get(index) == false)
				return false;
		}
		return result;	
	}

	public static void main(String[] args) {
		List<Hashable<String>> functions = new ArrayList<Hashable<String>>();
		functions.add(new StringHash(17));
		functions.add(new StringHash(23));
		functions.add(new StringHash(31));

		BloomFilter<String> bf = new BloomFilter<String>(functions, 10000);
		bf.add("apple");
		bf.add("banana");
		System.out.println("Bloom Filter contains apple: " + bf.contain("apple"));
		System.out.println("Bloom Filter contains pineapple: " + bf.contain("pineapple"));
	}
}