package ProjectBag;

import java.util.ArrayList;
import java.util.Iterator;


public class Bag<T> implements Container<T>{

	ArrayList<T> MyArray = new ArrayList<T>();
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		ArrayList<T> Array = new ArrayList<T>();
		Array = MyArray;
		return Array.iterator();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (MyArray.size()==0)
			return true;
		else
			return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return MyArray.size();
	}

	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
		MyArray.add(item);
	}
	
}
