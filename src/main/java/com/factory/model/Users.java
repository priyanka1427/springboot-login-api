package com.factory.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "users")
@NamedQueries({
		@NamedQuery(name = "Users.findByUserName", query = "SELECT usr FROM Users as usr WHERE usr.userName = :userName"),
		})
public class Users {
	@Id
	private Long id;
	@NotBlank(message = "User Name cannot be empty")
	private String userName;
	@NotBlank(message = "Password cannot be empty")
	private String password;
	@NotBlank(message = "First Name cannot be empty")
	private String firstName;
	@NotBlank(message = "Last Name cannot be empty")
	private String lastName;
	private String middleName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	@Pattern(regexp = "\\d{5}(\\d{4})?", message = "Zip Code must be numeric and either 5 or 9 characters.")
	private String zip;
	private String fax;
	private String phone;
	@NotBlank(message = "Email cannot be empty")
	private String email;
	private String loggedOnce;
	private Integer accessAll;
	private Integer timeoutConter;
	private String userPreferences;
	private String authPass;
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
	
	public Integer getAccessAll() {
		if (accessAll == null)
			return 0;
		else
			return accessAll;
	}

	public void setAccessAll(Integer accessAll) {
		this.accessAll = accessAll;
	}

	public String getLoggedOnce() {
		if (StringUtils.isBlank(loggedOnce)) {
			return "No";
		} else {
			return loggedOnce;
		}
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
		if (StringUtils.isBlank(zip)) {
			return null;
		}
		return zip;
	}

	public void setZip(String zip) {
		if (StringUtils.isBlank(zip)) {
			this.zip = null;
		}
		this.zip = zip.replaceAll("[^\\d]", "");
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

	public String getEventDesc() {
		return userName;
	}

	public String toString() {
		return (userName != null ? "User Name : " + userName + ", " : "") + (firstName != null ? "First Name : " + firstName + ", " : "")
				+ (lastName != null ? "Last Name : " + lastName + ", " : "");
	}

	public void setTimeoutConter(Integer timeoutConter) {
		this.timeoutConter = timeoutConter;
	}

	public Integer getTimeoutConter() {
		if (timeoutConter == null) {
			return 60;
		}
		return timeoutConter;
	}

	public Integer getTimeoutNo() {
		if (timeoutConter == null) {
			return 0;
		}
		return timeoutConter * 60000;
	}

	public String getUserPreferences() {
		return userPreferences;
	}

	public void setUserPreferences(String userPreferences) {
		this.userPreferences = userPreferences;
	}

	public String getAuthPass() {
		return authPass;
	}

	public void setAuthPass(String authPass) {
		this.authPass = authPass;
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

}
