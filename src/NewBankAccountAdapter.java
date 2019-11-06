
public class NewBankAccountAdapter implements IBankAccount {

	private Account account = new Account(100);

	public void debit(int i) {
		account.withdraw(100);

	}

	public void credit(int i) {
		account.deposit(0);

	}

	public int balance() {
		return account.getBalance();
	}

}
