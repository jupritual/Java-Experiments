import java.util.*;
public class BankAccount{
int accountno;
String name;
String accounttype;
double balance;

BankAccount(int acc, String n, String type, double bal) {
	accountno = acc;
	name = n;
	accounttype = type;
	balance = bal;
}

void deposit(double amount) {
	balance += amount;
	System.out.println("Deposited: " + amount);
}

void withdraw(double amount) {
	if (balance < amount) {
	System.out.println("Insufficient Balance");
	}
	else {
		balance -= amount;
		System.out.println("Withdrawn :" + amount);
		System.out.println("New Available Balance: " + balance);
	}
}
 
void display() {
	System.out.println("________Account Details________");
	System.out.println("Account Number: " + accountno);
	System.out.println("Account holder name: " + name);
	System.out.println("Account Type: " + accounttype);
	System.out.println("Balance: " + balance);
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Account Number: ");
	int acc = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter your name: ");
	String n = sc.nextLine();
	System.out.println("Enter account type (savings/current): ");
	String type = sc.nextLine();
	System.out.println("Enter initial balance: ");
	double bal = sc.nextDouble();
	
	BankAccount accdetail = new BankAccount(acc, n, type, bal);
	
	accdetail.display();
	
	System.out.println("Enter amount to deposit: ");
	double dep = sc.nextDouble();
	accdetail.deposit(dep);
	
	System.out.println("Enter amount to withdraw: ");
	double with = sc.nextDouble();
	accdetail.withdraw(with);
	
	System.out.println("Banking System......executed!");
}
}