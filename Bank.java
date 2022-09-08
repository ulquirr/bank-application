import java.util.ArrayList;
import java.util.HashMap;

public class Bank {

    static ArrayList<Client> clients = new ArrayList<Client>();
    static HashMap<Integer, Integer> clientsBalances = new HashMap<Integer, Integer>();

    public Bank(Client client) {
        clients.add(client);
    }

    public void getClients() {
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(clients.get(i));
        }
    }

    public void deposit(int id, int money) {
        var currentBalance = clientsBalances.get(id);

        if (currentBalance == null) {
            clientsBalances.put(id, money);
        } else {
            currentBalance += money;
            clientsBalances.put(id, currentBalance);
        }
    }

    public void getCurrentBalance(int id) {
        System.out.println("Current balance: " + clientsBalances.get(id));
    }

    public static void withdraw() {

    }
}
