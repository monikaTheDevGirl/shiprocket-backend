package in.rakuten.shiprocket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import in.rakuten.shiprocket.enums.Role;
import lombok.Data;

@Entity

public class User {
	
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String mobile;
	private Role role;

}
