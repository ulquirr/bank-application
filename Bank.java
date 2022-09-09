import java.util.ArrayList;
import java.util.HashMap;

public class Bank {

    String bankName;
    int clientsQuantity = clients.size();

    static ArrayList<Client> clients = new ArrayList<Client>();
    static HashMap<Integer, Integer> clientsBalances = new HashMap<Integer, Integer>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addClient(Client client, Bank bank) {
        clients.add(client);
        client.registerNewBank(bank);
    }

    public void getClients() {
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(clients.get(i));
        }
    }

    static boolean verifyClient(int id) {
        int i = 0;
        boolean found = false;

        while (i < clients.size()) {
            if (clients.get(i).id == id) {
                found = true;
                break;
            }

            i++;
        }

        return found;

    }

    public void deposit(int id, int money) {
        if (verifyClient(id)) {
            var currentBalance = clientsBalances.get(id);

            if (currentBalance == null) {
                clientsBalances.put(id, money);
            } else {
                currentBalance += money;
                clientsBalances.put(id, currentBalance);
            }
        } else {
            System.out.println("User is not a client!");
        }

    }

    public void withdraw(int id, int money) {
        if (verifyClient(id)) {
            var currentBalance = clientsBalances.get(id);

            if (money > currentBalance) {
                System.out.println("Not enough money on balance");
            } else {
                currentBalance -= money;
                clientsBalances.put(id, currentBalance);
            }
        } else {
            System.out.println("User is not a client!");
        }
    }

    public void getCurrentBalance(int id) {
        System.out.println("Current balance: " + clientsBalances.get(id));
    }
}
