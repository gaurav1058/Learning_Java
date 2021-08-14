import java.util.ArrayList;

public class GroceryList{
    private ArrayList<String> groceryList = new ArrayList<String>();
    // to add an item in the list
    public void addGroceryItems(String item){
        groceryList.add(item);
    }
    // to print the grocery list
    public void printGroceryList(){
        for(int i=0;i<groceryList.size();i++){
            System.out.println(groceryList.get(i));
        }
    }
    // to modify the grocery list
    public void modifyGroceryList(int position, String newItem){
        groceryList.set(position, newItem);
    }
    // to remove an element from the list
    public void removeGroceryList(int position){
        // String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    // to search a string in the array list
    public String findItem(String item){
        // boolean exist = groceryList.contains(item);
        // return true if it contains the item.
        int position= groceryList.indexOf(item);
        // if position ==-1 then the item will not exist in the list
        if(position>=0){
            return item;
        }
        return null;
    }
}