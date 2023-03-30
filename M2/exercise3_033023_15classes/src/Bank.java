public class Bank {
    private String name;
    private String[] accounts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAccounts() {
        return accounts;
    }

    public void setAccounts(String[] accounts) {
        this.accounts = accounts;
    }

    public String[] deleteAccount(String[] accounts, String accountToDelete){
        String[] newArray = new String[accounts.length-1];
        for (int i = 0; i<accounts.length; i++){
            if (accounts[i] != accountToDelete){
                accounts[i] = newArray[i];
            }
        }
        return newArray;
    }

    public String[] addAccount(String[] accounts, String accountToAdd){
        String[] newArray = new String[accounts.length+1];
        for (int i = 0; i<accounts.length; i++){
            accounts[i]=newArray[i];
            newArray[accounts.length+1] = accountToAdd;
        }
        return newArray;
    }

    public int calculateBalance(String[])
}
