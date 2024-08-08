
public class SavingsAccount extends Account {

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void toPrintStatement() {
        System.out.println("*** Savings Account Statement ***");
        super.toPrintCommonInfos();
    }
}
