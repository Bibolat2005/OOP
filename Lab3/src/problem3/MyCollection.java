package problem3;

import java.util.Iterator;
import java.util.stream.Stream;

public interface MyCollection {
	void push(Object o);
	void remove(int i);
	void pop_back();
	boolean isEmpty();
	void clear();
	void print();
	int getSize();
	Stream<Object> stream();
	Iterator<Object> iterator();
	boolean contains (Object o);
	Object[] toArray();
}
