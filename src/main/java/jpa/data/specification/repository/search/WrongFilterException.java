package jpa.data.specification.repository.search;

public class WrongFilterException extends RuntimeException {

	public WrongFilterException() {
	}

	public WrongFilterException(String message) {
		super(message);
	}

	public WrongFilterException(Throwable cause) {
		super(cause);
	}

	public WrongFilterException(String message, Throwable cause) {
		super(message, cause);
	}

	public WrongFilterException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
  
  
}
