
public class RyanAndMonicaJob implements Runnable{
	private final BankAccount account;
	private final String name;
	private final int amountToSpend;
	
	public RyanAndMonicaJob(String name, BankAccount account, int amount) {
		this.name = name;
		this.account = account;
		this.amountToSpend = amount;
	}
	
	public void run() {
		goShopping(amountToSpend);
	}
	private void goShopping(int amount) {
		
		System.out.println(name + " is about to spend");
		account.spend(amount, name);
		System.out.println(name + " finishes spending");
	}
}
