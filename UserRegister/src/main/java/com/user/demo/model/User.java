package com.user.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
//	@Column(name = "id")
	private int id;

	@Column(name = "username")
	private String username;

	@Column(name = "contactno")
	private Long contactno;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	


	public User() {
		
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", contactno=" + contactno + ", email=" + email + "]";
	}

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Long getContactno() {
		return contactno;
	}


	public void setContactno(Long contactno) {
		this.contactno = contactno;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	
	
}
