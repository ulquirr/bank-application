import java.util.ArrayList;

public class Client {
    int id;
    String firstName;
    String lastName;
    double balance;   
    static ArrayList<Bank> banks = new ArrayList<Bank>();

    

    public Client(int id, String firstName, String lastName, double balance) {
        this.id = id;
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void registerNewBank (Bank bank) {
        banks.add(bank);
    }

    public String toString() {
        String result = "Client id: " + this.id + " first name: " + this.firstName + " last name: "
                + this.lastName + " balance: " + this.balance;
        return result;
    }

}
