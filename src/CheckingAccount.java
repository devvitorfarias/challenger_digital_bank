
public class CheckingAccount extends Account {

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void toPrintStatement() {
        System.out.println("*** Checking Account Statement ***");
        super.toPrintCommonInfos();
    }
}
