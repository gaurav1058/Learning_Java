import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String name;
    public Customer(String name, double initialAmount) {
        this.name = name;

        this.transactions = new ArrayList<Double>();
        this.transactions.add(initialAmount);
    }
    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    
    public String getName() {
        return name;
    }

    public void addTransactions(double amount){
        this.transactions.add(amount);
    }
}
