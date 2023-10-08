package com.arisweb.dto;

import com.arisweb.model.Company;
import com.arisweb.model.Role;
import com.arisweb.security.ApplicationUserRole;
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
public class UserDto {
	private Long id;
	@NotEmpty
	private String userName;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@NotEmpty(message = "Email should not be empty")
	@Email
	private String email;

	@NotNull(message = "Company can not be empty")
	private Long companyId;

	private Company userCompany;
	//@NotEmpty(message = "Password should not be empty")
	private String password;

	@NotEmpty
	private String phoneNumber;
	@NotEmpty
	private String idNumber;
	@NotEmpty
	private String address;
	private String zipCode;
	@NotEmpty
	private String town;
	private byte status;
	private int addedOrEditedFrom;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date modifiedDate;
	private String role;

}
