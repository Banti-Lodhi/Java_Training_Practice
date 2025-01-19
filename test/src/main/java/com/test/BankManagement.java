package com.test;
//Super Class
class Bank {
	public String BankName; 
	protected String BranchLocation;
	private double totalFunds;
	int establishedYear;
	
	public Bank(String bankName, String branchLocation, double totalFunds, int establishedYear) {
		this.BankName = bankName;
		this.BranchLocation = branchLocation;
		this.totalFunds = totalFunds;
		this.establishedYear = establishedYear;
	}

	public void printBankInfo() {
		System.out.println("BankName: "+BankName+", Branch: "+BranchLocation);
	}

	protected void updateTotalFunds(double Amount) {
		this.totalFunds+=Amount;
		System.out.println("Total Funds Manage Bank: "+ totalFunds);
	}

	private void displayTotalFunds() {
		System.out.println("Total Funds: "+totalFunds);
	}

	//Default Method
	void EstablishedYear() {
		System.out.println("Estalblished Year: "+establishedYear);
	}
}
class Customer extends Bank {
	private String CustomerName;
	private int CustomerAge;
	public Customer(String bankName, String branchLocation, double totalFunds, int establishedYear, String customerName,
			int customerAge) {
		super(bankName, branchLocation, totalFunds, establishedYear);
		this.CustomerName = customerName;
		this.CustomerAge = customerAge;
	}
	
	public void depositAmount(double Amount) {
		System.out.println(CustomerName+" deposited "+Amount+" to the Bank");
		updateTotalFunds(Amount);
	}
	
	private void displayCustomerDetails() {
		System.out.println("Customer name: "+CustomerName+", Age "+CustomerAge);
	}
	public void showBankDetails() {
		super.printBankInfo();
	
}
}
public class BankManagement{
	public static void main(String[] args) {
		Bank bank = new Bank("Global Bank", "New York", 9700000.45, 1995);
		bank.printBankInfo();
		bank.EstablishedYear();			
		
		Customer cust = new Customer("Global Bank", "New York", 9700000.45, 1995, "Reyansh Shina", 20);
		cust.depositAmount(60000);
//		cust.showBankDetails();
		
	}
	
}
