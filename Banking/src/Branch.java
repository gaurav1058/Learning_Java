import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customer;

    public Branch(String name) {
        this.name=name;
        this.customer= new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }

    public boolean newCostumer(String name, Double initialAmount){
        if(findCustomer(name)== null){
            this.customer.add(new Customer(name,initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransactions(String name, Double amount){
        Customer customer = findCustomer(name);
        if(customer != null){
            customer.addTransactions(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name){
        for(int i=0;i<this.customer.size();i++){
            if(this.customer.get(i).getName().equals(name)){
                return this.customer.get(i);
            }
        }
        return null;
    }
}
