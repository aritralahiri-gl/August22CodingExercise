package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private int custId;
	private String custName;
	private int custPhn;
	private String custAddress;
	private String custLogin;
	private String custPass;

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custPhn=" + custPhn + ", custAddress="
				+ custAddress + ", custLogin=" + custLogin + ", custPass=" + custPass + "]";
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustPhn() {
		return custPhn;
	}

	public void setCustPhn(int custPhn) {
		this.custPhn = custPhn;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCustLogin() {
		return custLogin;
	}

	public void setCustLogin(String custLogin) {
		this.custLogin = custLogin;
	}

	public String getCustPass() {
		return custPass;
	}

	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}

}
