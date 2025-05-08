package com.GitHubProject2;

public class Atm {
	private double balance;
	private double depositAmount;
	private double withdrawAmount;
	
	//default constructor
	public Atm() {
		super();
	}
	//getter setter
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	@Override
	public String toString() {
		return "Atm [balance=" + balance + ", depositAmount=" + depositAmount + ", withdrawAmount=" + withdrawAmount
				+ "]";
	}
}
