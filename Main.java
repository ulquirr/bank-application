public class Main {

    public static void main(String[] args) {
        Client client = new Client(0, "Vladislav", "Yaromiy", 100);
        Bank parisBank = new Bank(client);

        parisBank.deposit(client.id, 100);
        parisBank.deposit(client.id, 200);
        parisBank.getCurrentBalance(client.id);
    }
}