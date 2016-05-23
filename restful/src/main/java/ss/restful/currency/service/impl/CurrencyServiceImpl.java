package ss.restful.currency.service.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import ss.restful.currency.service.Currency;
import ss.restful.currency.service.CurrencyService;
import ss.restful.currency.service.UnknownCurrencyException;

@Path("exchange")
public class CurrencyServiceImpl implements CurrencyService {

	/* (non-Javadoc)
	 * @see ss.restful.currency.service.CurrencyService#getCurrency(java.lang.String)
	 */
	@GET
	@Path("/{currency}")
	public String getCurrency(@PathParam("currency") final String currency) {
		if (null != currency) {
			Currency[] denom = Currency.values();
			for (Currency currencyDenomObj : denom) {
				if (currencyDenomObj.name().equals(currency))
					return currencyDenomObj.getCountry();
			}

			throw new UnknownCurrencyException("Unknow currency - " + currency);
		}

		return null;
	}

	/**
	 * Gets the country by currency code.
	 *
	 * @param currency the currency
	 * @return the country by currency code
	 */
	@GET
	@Path("/code/{currencycode}")
	public String getCountryByCurrencyCode(@PathParam("currencycode") final Currency currency) {
		return currency.getCountry();
	}

}
