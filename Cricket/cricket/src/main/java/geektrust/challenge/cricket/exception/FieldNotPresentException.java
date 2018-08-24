/**
 * 
 */
package geektrust.challenge.cricket.exception;

/**
 * @author Padmanabhan M
 *
 */
public class FieldNotPresentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8124358235133573386L;

	/**
	 * 
	 */
	public FieldNotPresentException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public FieldNotPresentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public FieldNotPresentException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public FieldNotPresentException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public FieldNotPresentException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
