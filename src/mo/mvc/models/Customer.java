package mo.mvc.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	@NotNull(message="is requied")
	private String firstName;

	@NotNull(message="is requied")
	@Size(min = 2,message = "length of the name should be 2 charceter at least")
	private String lastName;
	
	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
	}

	public Customer(@NotNull(message = "is requied") String firstName,
			@Size(min = 2, message = "length of the name should be 2 charceter at least") String lastName) {
		super();
		this.lastName = lastName;
	}
	
	
}
