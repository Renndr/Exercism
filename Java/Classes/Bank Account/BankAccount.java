public class BankAccount {

    private int balance;
    private boolean closed = true;

    public void open() {
        setBalance(0);
        this.closed = false;
    }

    public int getBalance() throws BankAccountActionInvalidException {

        if (closed) {
            throw new BankAccountActionInvalidException("Account closed");
        }
        return balance;
    }

    public synchronized void deposit(int value) throws BankAccountActionInvalidException {

        if (value < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }

        if (closed) {
            throw new BankAccountActionInvalidException("Account closed");
        }
        setBalance(balance + value);
    }

    public synchronized void withdraw(int value) throws BankAccountActionInvalidException {

        if (value < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }

        if (closed) {
            throw new BankAccountActionInvalidException("Account closed");
        }

        if (balance == 0) {
            throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        }

        if (value > balance) {
            throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        }

        setBalance(balance - value);
    }

    public void close() {
        this.closed = true;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}