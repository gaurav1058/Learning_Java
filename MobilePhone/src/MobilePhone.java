import java.util.ArrayList;

public class MobilePhone {
    
    private ArrayList<Contact> myContacts;
    private String myNumber;
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    
    
    
    public boolean addNewContact(Contact contact){
        int chk= findContact(contact.getName());
        if(chk>=0){
            System.out.println("contact already exists");
            return false;
        }
        else{
            System.out.println("New contact added");
            myContacts.add(contact);
            return true;
        }
    }
    
    public boolean updateContact(Contact oldContact, Contact newContact){
        int k=findContact(oldContact);
        if(k>=0){
            int chk= findContact(newContact);
            if(chk>=0){
                removeContact(oldContact);
                System.out.println("new contact already existed and the old contact is removed successfully");
                return true;
            }
            this.myContacts.set(k,newContact);
            System.out.println(oldContact.getName() +" replaced by "+ newContact.getName());
            return true;
        }
        else{
            System.out.println("Old contact is not in the list");
            return false;            
        } 
    }
    
    public boolean removeContact(Contact contact){
        int k=findContact(contact);
        if(k>=0){
            System.out.println(contact.getName() +" removed successfully");
            myContacts.remove(k);
            return true;
        }
        else{
            System.out.println(contact.getName()+" not found in the list");
                return false;
        }
    }
    
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    
    private int findContact(String contactName){
        for(int i=0;i<this.myContacts.size();i++){
            Contact contact=this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    
    public String queryContact(Contact contact){
        int k= findContact(contact);
        if(k>=0){
            return contact.getName();
        }
        return null;
    }
    
    public Contact queryContact(String name){
        int k= findContact(name);
        if(k>=0){
            return this.myContacts.get(k);
        }
        return null;
    }
    public void printContact(){
        if(this.myContacts.size()==0){
            System.out.println("No contacts found");
        }
        else{
            System.out.println("Printing the existing contact:-");
            for(int i=0;i<this.myContacts.size();i++){
                System.out.println(i+1+". "+this.myContacts.get(i).getName() + " -> "+ this.myContacts.get(i).getPhoneNumber());
            }
        }
    }    
}

