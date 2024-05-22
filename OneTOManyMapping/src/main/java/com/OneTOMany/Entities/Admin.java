package com.OneTOMany.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	@Id
	@Column(name="UserName",length = 30)
	private String userName;
	
	@Column(name="PassWord",length = 30)
	private String password;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Supplier> sup;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
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

	public List<Supplier> getSup() {
		return sup;
	}

	public void setSup(List<Supplier> sup) {
		this.sup = sup;
	}
	
	
}
