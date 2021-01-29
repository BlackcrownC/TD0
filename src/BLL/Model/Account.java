package BLL.Model;

public class Account {
    public char Type; // S[avings] , C[ecking]
    public float Balance;

    public Account(char type, float balance) {
        Type = type;
        Balance = balance;
    }
}
