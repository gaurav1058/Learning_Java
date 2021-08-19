import java.util.ArrayList;

public class Bank {
    private String name;
    public ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches= new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }
  
    public boolean addBranch(String name){
        Branch branch = findBranch(name);
        if(branch== null){
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.newCostumer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addTransactions(String branchName, String customerName,double amount){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.addCustomerTransactions(customerName, amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean transactions){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            System.out.println("list of customer of branch:- "+ branch.getName());
            ArrayList<Customer> customers= branch.getCustomer();
            for(int i=0;i<customers.size();i++){
                System.out.println("Customer Name: "+ customers.get(i).getName());
                if(transactions){
                    System.out.println("Transactions: ");
                    ArrayList<Double> transaction= customers.get(i).getTransactions();
                    for(int j=0;j<transaction.size();j++){
                        System.out.println(transaction.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    } 

    private Branch findBranch(String name){
        for(int i=0;i<this.branches.size();i++){
            if(this.branches.get(i).getName().equals(name)){
                return this.branches.get(i);
            }
        }
        return null;
    }
}
