public class Bk2 {
    
    private double balance;
    private boolean isOpen = true;

    public void open() {
        isOpen = true;
        setBalance(0);
    }

    public synchronized void deposit(double deposit) throws BankAccountActionInvalidException {
        if (isOpen) {
            setBalance(deposit);
        } else {
            throw new BankAccountActionInvalidException("Account closed");
        } 
    }

    public synchronized void withdraw(double withdraw) throws BankAccountActionInvalidException {
        if (isOpen) {
            if(balance >= withdraw && withdraw > 0){
                setBalance(balance-withdraw);
            }
            else if (balance == 0){
                throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
            } 
            else if (withdraw < 0){
                throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
            }
        }  else {
            throw new BankAccountActionInvalidException("Account closed");
        }
 
    }

    public void close() {
        isOpen = false;
    }

    public double getBalance() throws BankAccountActionInvalidException {
        if (isOpen) {
            return balance;
        } else {
            throw new BankAccountActionInvalidException("Account closed");
        }
    }


    private synchronized void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) throws BankAccountActionInvalidException {
        Bk2 bankAccount = new Bk2();
        bankAccount.open();
        bankAccount.deposit(500);
        //bankAccount.close();
        System.out.println(bankAccount.getBalance());
    }
}