package ss.restful.exceptionmapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import ss.restful.currency.service.UnknownCurrencyException;

 
/**
 * The Class ExceptionMapper.
 */
@Provider
public class UnknownCurrencyMapper extends UnknownCurrencyException implements ExceptionMapper<UnknownCurrencyException> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new unknown currency mapper.
	 */
	public UnknownCurrencyMapper() {
		 
	}

	/* (non-Javadoc)
	 * @see javax.ws.rs.ext.ExceptionMapper#toResponse(java.lang.Throwable)
	 */
	public Response toResponse(UnknownCurrencyException exception) {
		 
		return Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build();
	}

}
