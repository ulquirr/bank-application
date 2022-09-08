public class Client {
    int id;
    String firstName;
    String lastName;
    double balance;
    

    public Client(int id, String firstName, String lastName, double balance) {
        this.id = id;
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        String result = "Client id: " + this.id + " first name: " + this.firstName + " last name: "
                + this.lastName + " balance: " + this.balance;
        return result;
    }

}
