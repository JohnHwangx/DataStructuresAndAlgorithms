package searching;

import java.util.Iterator;
import java.util.TreeMap;

public class SymbolTable<Key extends Comparable<Key>, Value> implements Iterable<Key> {
	private TreeMap<Key, Value> st;

	public SymbolTable() {
		// TODO create a symbol table
		st = new TreeMap<Key, Value>();
	}

	public void put(Key key, Value value) {
		// TODO put key-value pair into the table
		// TODO (remove key from table if value is null)
		if (key == null)
			throw new IllegalArgumentException("called put() with null key");
		if (value == null)
			st.remove(key);
		else
			st.put(key, value);

	}

	public Value get(Key key) {
		// TODO value paired with key
		// TODO (null if key is absent)
		if (key == null)
			throw new IllegalArgumentException("called get() with null key");
		return st.get(key);
	}

	public void delete(Key key) {
		// TODO remove key (and its value) from table
		put(key, null);
	}

	public boolean contains(Key key) {
		// TODO is there a value paired with key?
		return get(key) != null;
	}

	public boolean isEmpty() {
		// TODO is the table empty?
		return size() == 0;
	}

	public int size() {
		// TODO number of key-value pairs in the table
		return 0;
	}

	public Iterable<Key> keys() {
		// TODO all the keys in the table
		return st.keySet();
	}

	@Override
	public Iterator<Key> iterator() {
		// TODO Auto-generated method stub
		return st.keySet().iterator();
	}
}
