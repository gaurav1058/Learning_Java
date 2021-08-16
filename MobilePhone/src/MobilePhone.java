import java.util.ArrayList;

public class MobilePhone {
    
    private ArrayList<Contact> myContacts;
    private String myNumber;
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    
    
    
    private boolean addNewContact(Contact contact){
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
    
    private boolean updateContact(Contact oldContact, Contact newContact){
        int k=findContact(oldContact);
        if(k>=0){
            int chk= findContact(newContact.getName());
            if(chk>=0){
                removeContact(oldContact);
                System.out.println("new contact already existed and the old contact is removed");
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
    
    private boolean removeContact(Contact contact){
        int k=findContact(contact);
        if(k>=0){
            System.out.println(contact.getName() +" removed successfully");
            myContacts.remove(k);
            return true;
        }
        else{
            System.out.println("Contact not found in the list");
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
                // System.out.println("Contact found");
                return i;
            }
        }
        // System.out.println("Contact not found");
        return -1;
    }
    
    private Contact queryContact(String contactName){
        int k= findContact(contactName);
        if(k>=0){
            System.out.println(contactName+ " contact found");
            return myContacts.get(k);
        }
        return null;
    }
    
    private void printContact(){
        System.out.println("Printing the existing contact:-");
        for(int i=0;i<this.myContacts.size();i++){
            System.out.println(this.myContacts.get(i).getName() + " -> "+ this.myContacts.get(i).getPhoneNumber());
        }
    }    
}

