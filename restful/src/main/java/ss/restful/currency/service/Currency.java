package ss.restful.currency.service;

public enum Currency {
	
	ALL("Albanian lek"),DKK("Denmark"),EUR("Italy"),INR("Indian Rupee");
	
	private String country;
	
	 Currency(final String country){
		 this.country=country;
	}
	 
	 
	 public String getCountry(){
		 return country;
	 }

}
