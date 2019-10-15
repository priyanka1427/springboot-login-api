package com.factory.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class UsersDTO {

	private Long id;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;

	@NotBlank(message = "User Name cannot be empty")
	@Size(max = 25, message = "User Name maximum  25 characters")
	private String userName;
	@Size(max = 500, message = "Password maximum 500 characters")
	private String password;
	@Pattern(regexp = "[a-z,A-Z]*", message = "First Name should be in Alphabets")
	@NotBlank(message = "First Name cannot be empty")
	@Size(max = 255, message = "First Name maximum 255 characters")
	private String firstName;
	@Pattern(regexp = "[a-z,A-Z]*", message = "Last Name should be in Alphabets")
	@NotBlank(message = "Last Name cannot be empty")
	@Size(max = 255, message = "Last Name maximum 255 characters")
	private String lastName;
	@Pattern(regexp = "[a-z,A-Z]*", message = "Middle Name should be in Alphabets")
	@Size(max = 25, message = "Middle Name maximum 25 characters")
	private String middleName;
	@Size(max = 255, message = "Address1 maximum 255 characters")
	private String address1;
	@Size(max = 255, message = "Address2 maximum 255 characters")
	private String address2;
	@Size(max = 50, message = "City maximum 50 characters")
	private String city;
	@Size(max = 50, message = "State maximum 50 characters")
	private String state;
	@Size(max = 20, message = "Zip maximum 20 characters")
	@Pattern(regexp = "\\d{5}(\\d{4})?", message = "Zip Code must be numeric and either 5 or 9 characters.")
	private String zip;
	@Size(max = 20, message = "Fax maximum 20 characters")
	private String fax;
	@Size(max = 20, message = "Phone maximum 20 characters")
	private String phone;
	@NotBlank(message = "Email cannot be empty")
	@Email(message = "Invalid Email Format")
	@Size(max = 255, message = "Email maximum 255 characters")
	private String email;
	private String loggedOnce;
	@Temporal(value = TemporalType.DATE)
	private Date passwordcreatedDate;
	@Column(columnDefinition = "SMALLINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean enabled;
	@Column(columnDefinition = "SMALLINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean accountNonExpired;
	@Column(columnDefinition = "SMALLINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean accountNonLocked;
	@Column(columnDefinition = "SMALLINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean credentialsNonExpired;

	private String oldPassword;
	private String newPassword;
	private String confirmPassword;


	public UsersDTO() {

	}

	public String getLoggedOnce() {
		if (loggedOnce == null)
			return "No";
		else
			return loggedOnce;
	}

	public void setLoggedOnce(String loggedOnce) {
		this.loggedOnce = loggedOnce;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return this.getUserName();

	}

	public Date getPasswordcreatedDate() {
		return passwordcreatedDate;
	}

	public void setPasswordcreatedDate(Date passwordcreatedDate) {
		this.passwordcreatedDate = passwordcreatedDate;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

		public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
