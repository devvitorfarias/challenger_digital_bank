//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Alexandre");

        CheckingAccount checkingAccount = new CheckingAccount(client);
        SavingsAccount savingsAccount = new SavingsAccount(client);

        checkingAccount.toDeposit(100);
        checkingAccount.toTransfer(100, savingsAccount);

        checkingAccount.toPrintStatement();
        savingsAccount.toPrintStatement();
    }
}
