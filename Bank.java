import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    static ArrayList<Client> clients = new ArrayList<Client>();

    public Bank(Client client) {
        clients.add(client);
    }

    public void getClients() {
       for (int i = 0; i < clients.size(); i++) {
        System.out.println(clients.get(i));
       }
    }

    public static void deposit() {

    }

    public static void withdraw() {

    }
}


