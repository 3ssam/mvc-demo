package mo.mvc.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	@NotNull(message="is requied")
	private String fristName;

	@Size(min = 2,message = "length of the name should be 2 charceter at least")
	private String lastName;
}
