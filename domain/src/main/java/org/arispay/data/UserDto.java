package org.arispay.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {
	private Long id;
	@NotEmpty
	private String username;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;

//	@NotEmpty(message = "Email should not be empty")
	@Email
	private String email;

	@NotNull(message = "User Companies can not be empty")
	private List<UserCompanyDto> userCompanies = new ArrayList<>();
	//@NotEmpty(message = "Password should not be empty")
	private String password;

	@NotEmpty
	private String phoneNumber;

	@NotEmpty
	private String address;

	private String zipCode;

	@NotEmpty
	private String town;

	@NotEmpty
	private String role;

	@NotEmpty
	private String status;

	private String currentPlan;

	private String avatar;
}
