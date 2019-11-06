
public class Account {
	private int balance;

	public Account(int i) {
		balance = i;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int i) {
		balance += i;
	}

	public void withdraw(int i) {
		balance -= i;
	}
}