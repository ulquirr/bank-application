public class Main {

    public static void main(String[] args) {
        Client client = new Client(0, "Vladislav", "Yaromiy", 100);
        Bank bank = new Bank("Paris Bank");

        bank.addClient(client, bank);

        bank.deposit(client.id, 200);
        bank.deposit(client.id, 200);
        bank.withdraw(client.id, 300);
        bank.getCurrentBalance(client.id);
    }
}