import java.util.ArrayList;

class Bank{
	
	/*
	 * Bank class
	 * static final variable for not changing in future
	 * static variable for the account number series
	 * display method for displaying all the bank details 
	 * */
	
	// ArrayList for bank accounts
	static ArrayList<Account> bankAccounts = new ArrayList<>();
	
	// Bank Name
	final static String BANK_NAME = "State Bank of India";
	
	// Bank IFSC_CODE
	final static String IFSC_CODE = "SBIN000123";
	
	// Bank Address
	static String address = "Deccan, Pune";
	
	// Bank account number series
	static long accountNumberSeries = 1234_1234_1234l;
	
	// Bank details display method
	public void displayBank() {
		System.out.println();
		System.out.println("Bank details");
		System.out.println("Name : "+ BANK_NAME);
		System.out.println("IFSC Code : "+IFSC_CODE);
		System.out.println("Address : "+address);
	}
	
}

class Account extends Bank{

	/*
	 * The variables are made private because of security purpose
	 * and to achieve the encapsulation
	 * Non static is used for account number creation in sequence 
	 * using the account number series
	 * Non static block gets executed after every account object creation
	 * */
	
	// Bank account holder name
	private String accountHolderName;
	
	// Bank account pin
	private String pin;
	
	// Bank account balance 
	private double bal;

	// Bank account holder contact
	private long contact;
	
	// Bank account number
	private long accountNumber;
	
	// Non static block for generating sequence wise bank account number
	// Gets executed for every account object creation
	{
		this.accountNumber = accountNumberSeries++;
	}

	// Account constructor for initializing the non static members
	public Account(String accountHolderName, String pin, double bal, long contact) {
		super();
		this.accountHolderName = accountHolderName;
		this.pin = pin;
		this.bal = bal;
		this.contact = contact;
		// Adding every account object into the Bank class ArrayList
		bankAccounts.add(this);
	}
	
	// Display method of the Account Holder
	public void displayAccount() {
		displayBank();
		System.out.println();
		System.out.println("Account Details");
		System.out.println("Account holder name : "+accountHolderName);
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Pin : "+pin);
		System.out.println("Bal : "+bal);
		System.out.println("Contact : "+contact);
		System.out.println();
	}
	
}

public class BankExample {

	public static void main(String[] args) {
		
		// Account creation
		new Account("Ramesh Kumar","1234",5000,987654321l);
		new Account("Suresh Kumar","4567",5000,987654322l);
		new Account("Ganesh Kumar","2345",5000,987654323l);
		new Account("Mukesh Kumar","7890",5000,987654324l);
		new Account("Rakesh Kumar","6789",5000,987654325l);
		
		// Looping through each and every account
		for (Account ele : Bank.bankAccounts) {
			ele.displayAccount();
			System.out.println("____________________________________");
		}
	}
	
}
