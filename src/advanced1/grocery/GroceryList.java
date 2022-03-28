package advanced1.grocery;

// TODO:
//1.addGroceryItem
//2.printGroceryList
//3.removeGroceryItem
//4.modifyGroceryItem

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have: " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            groceryList.remove(position);
        }
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public void modifyGroceryItem (int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }





}
