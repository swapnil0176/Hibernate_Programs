package com.OneTOMany.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Supplier")
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Supplier_Id", length = 10)
	private int supplierId;

	@Column(name = "Supplier_Name", length = 30)
	private String sName;

	@Column(name = "Supplier_Email", length = 30)
	private String sEmail;

	@Column(name = "Supplier_Address", length = 30)
	private String address;

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", sName=" + sName + ", sEmail=" + sEmail + ", address=" + address
				+ "]";
	}

	public int getSupplierId() {
		return supplierId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
