package BankAccountBalance;

public class bankBalance {
	int accountNumber;
	String accountHolder;
	double bankBalance;
	public bankBalance(int accountNumber,String accountHolder,double bankBalance){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.bankBalance=bankBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}
	
	
}
