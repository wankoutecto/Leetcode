
public class BankAccount {
	private int balance = 0;
	public int getBalance() {
		return balance;
	}
	public synchronized void spend(int amount, String name) {
		if(balance >= amount) {
			balance -= amount;
			if(balance < 0) {
				System.out.println("Overdrawn!");
			}
		}else {
			System.out.println("Sorry, not enough for " + name);
		}
	}
	public void increment() {
		 balance++;
	}
}
