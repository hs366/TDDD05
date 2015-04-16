package se.liu.hamed;
class Storage<T> {
	T x;

	public void setValue(T value) {
		x = value;
	}

	public T getValue() {
		return x;
	}
}

