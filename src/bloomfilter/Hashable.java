package bloomfilter;

import java.util.*;

/*
	Interface to be implemented by all custom hash class
*/
public interface Hashable<T> {
	// return a integer by applying some method on the object
	public int hash(T t);
}