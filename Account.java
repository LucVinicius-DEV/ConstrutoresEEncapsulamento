public class Account {

    private int numberAccount;
    private String name;
    private double balance;
    
    public Account() {
    }
    
    public Account(int numberAccount, String name, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.name = name;
        deposit(initialDeposit);
    }

    public Account(int numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
    }

	public int getNumberAccount() {
        return numberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

    public void deposit(double amount) {
        balance += amount;
        
    }
    public void withDraw(double amount) {
        balance -= amount + 5.0;
         }
    

    public String toString()  {
        return "Account "
                + numberAccount
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}
