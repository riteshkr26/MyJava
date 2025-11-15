

class Account
{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    
    public Account(String acc, String n, String add, String phno, String dob)
    {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }
    
    public String getAccNo() { return accNo; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhno() { return phno; }
    public String getDOB() { return dob; }
    public long getBalance() { return balance; }
    
    public void setAddress(String add) { address = add; }
    public void setPhno(String phno) { this.phno = phno; }
}

class SavingsAccount extends Account
{
    public SavingsAccount(String acc, String n, String add, String phno, String dob)
    {
        super(acc, n, add, phno, dob);
    }

    public void deposit(long amt)
    {
        balance += amt;
    }

    public void withdraw(long amt)
    {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class LoanAccount extends Account
{
    public LoanAccount(String acc, String n, String add, String phno, String dob)
    {
        super(acc, n, add, phno, dob);
    }

    public void payEMI(long amt)
    {
        balance -= amt;
    }

    public void repay(long amt)
    {
        if (balance == amt) {
            balance = 0;
        } else {
            System.out.println("Amount does not match the outstanding loan balance.");
        }
    }
}

public class SCInherit 
{
    public static void main(String[] args) 
    {
        SavingsAccount savings = new SavingsAccount("SA123", "Alice", "123 Maple St", "555-1234", "1990-01-01");
        LoanAccount loan = new LoanAccount("LA123", "Bob", "456 Oak St", "555-5678", "1985-05-05");

        // Perform operations on SavingsAccount
        savings.deposit(1000);
        System.out.println("Savings Account Balance after deposit: " + savings.getBalance());
        savings.withdraw(500);
        System.out.println("Savings Account Balance after withdrawal: " + savings.getBalance());
        savings.withdraw(600); // Attempt to withdraw more than balance

        // Perform operations on LoanAccount
        loan.payEMI(200);
        System.out.println("Loan Account Balance after EMI payment: " + loan.getBalance());
        loan.repay(0); // No loan amount to repay initially

        // Set and get account details
        savings.setAddress("789 Birch St");
        System.out.println("Savings Account New Address: " + savings.getAddress());

        loan.setPhno("555-9876");
        System.out.println("Loan Account New Phone Number: " + loan.getPhno());
    }   
}
