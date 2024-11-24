import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.time.format.FormatStyle;
import java.util.concurrent.*;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.time.LocalDateTime.now;
import static java.time.format.DateTimeFormatter.ofLocalizedTime;

public class Test {

	public static void main(String[] args) throws InterruptedException {
	/*
		BankAccount account = new BankAccount();
		RyanAndMonicaJob ryan = new RyanAndMonicaJob("Ryan", account, 50);
		RyanAndMonicaJob monica = new RyanAndMonicaJob("Monica", account, 100);		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(ryan);
		executor.execute(monica);
		executor.shutdown();
	*/
	
		ExecutorService pool = Executors.newFixedThreadPool(6);
		 Balance balance = new Balance();
		 for (int i = 0; i < 1000; i++) {
		 pool.execute(() -> balance.increment());
		 }
		 pool.shutdown();
		 if (pool.awaitTermination(1, TimeUnit.MINUTES)) {
		 System.out.println("balance = " + balance.balance);
		 }
	}//end main
}//end test


class Balance {
	 int balance = 0;
	 public void increment() {
	 balance++;
	 }
}
