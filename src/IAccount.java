
public interface IAccount {
    void toWithdraw(double value);
    void toDeposit(double value);
    void toTransfer(double value, IAccount destinationAccount);
    void toPrintStatement();
}
