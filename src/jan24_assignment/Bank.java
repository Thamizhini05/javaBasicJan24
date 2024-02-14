package jan24_assignment;
import java.util.ArrayList;
import java.util.List;
public class Bank {
    public List<Account> accounts;
    public Bank() {
        accounts = new ArrayList<>();
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    }
