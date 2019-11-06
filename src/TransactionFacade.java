
public class TransactionFacade {

	private NewBankAccountAdapter newBankAccount = new NewBankAccountAdapter();
	private AtmStatus atmStatus = new AtmStatus();
	private AtmUserLog atmUserLog = new AtmUserLog();
	private AtmAds atmAds = new AtmAds();

	public void Debit() {
		newBankAccount.debit(100);
		System.out.println("Debit "+newBankAccount.balance());
		atmStatus.SaveAtmStatus();
		atmUserLog.SaveUserLog();
		atmAds.showAds();

	}

	public void Credit() {
		newBankAccount.credit(100);
		System.out.println("Credit "+newBankAccount.balance());
		atmStatus.SaveAtmStatus();
		atmUserLog.SaveUserLog();
		atmAds.showAds();

	}

}
