/**
 * 
 */
package ss.restful.currency.service;

/**
 * @author satsa05
 *
 */
public class UnknownCurrencyException extends RuntimeException{

	/**
	 * 
	 */
	public UnknownCurrencyException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public UnknownCurrencyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public UnknownCurrencyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public UnknownCurrencyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public UnknownCurrencyException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
