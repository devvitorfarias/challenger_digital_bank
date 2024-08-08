
public abstract class Account implements IAccount {

    protected static final int DEFAULT_AGENCY = 0001;
    private static int SEQUENTIAL = 0334561;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.agency = Account.DEFAULT_AGENCY;
        this.number = SEQUENTIAL++;
        this.client = client;
    }

    @Override
    public void toWithdraw(double value) {
        balance -= value;
    }

    @Override
    public void toDeposit(double value) {
        balance += value;
    }

    @Override
    public void toTransfer(double value, IAccount destinationAccount) {
        this.toWithdraw(value);
        destinationAccount.toDeposit(value);
    }

    protected void toPrintCommonInfos() {
        System.out.println(String.format("Holder: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Account Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
        System.out.println("");
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
}
