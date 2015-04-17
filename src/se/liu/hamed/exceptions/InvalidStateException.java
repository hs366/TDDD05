package se.liu.hamed.exceptions;

public class InvalidStateException extends Exception {

	public InvalidStateException(String string) {
		/*
		 * invoking constructor belonging to parent.
		 */
		super(string);
	}

}
