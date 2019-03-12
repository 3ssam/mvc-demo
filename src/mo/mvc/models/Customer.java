package mo.mvc.models;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	@NotNull(message="is requied")
	private String firstName;

	@NotNull(message="is requied")
	@Size(min = 2,message = "length of the name should be 2 charceter at least")
	private String lastName;
	
	private String country;
	
	private String favoriteLanguage;
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	private LinkedHashMap<String,String> countryOptions;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String fristName) {
		this.firstName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Customer() {
		super();
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("Bra", "Brazil");
		countryOptions.put("Fra", "France");
		countryOptions.put("Ger", "Germany");
		countryOptions.put("Ind", "India");
		countryOptions.put("USA", "Unit stats");
	}

	public Customer(@NotNull(message = "is requied") String firstName,
			@Size(min = 2, message = "length of the name should be 2 charceter at least") String lastName) {
		super();
		this.lastName = lastName;
	}
	
	
}
