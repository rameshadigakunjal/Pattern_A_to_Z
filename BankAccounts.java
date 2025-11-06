
class Accountent{
	private String name;
	private double balance;
	
	// setter methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(double balance) {
		if(balance >= 0) {
			this.balance=balance;
		}
		else {
			System.out.println("Balance cannot be Negetive");
		}
	}
	
	//Getter method
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
}


public class BankAccounts {

	public static void main(String[] args) {
		
		Accountent acc = new Accountent();
		
		acc.setName("XYZ");
		acc.setBalance(5000);
		
		System.out.println("Account holder: " + acc.getName());
		System.out.println("Account Balance: " + acc.getBalance());

	}

}
