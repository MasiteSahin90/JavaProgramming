package Oscar.week14;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList;


    public GroceryList() {
        this.groceryList = new ArrayList<>();
    }

    public void addAnItem(String item){
        groceryList.add(item);
    }

    public void removeAnItem(int position){
        groceryList.remove(position-1);
    }

    public void searchAnItem(String item){
        groceryList.add(item);
    }

    public void modifyAnItem(int position , String newItem){
        groceryList.set((position-1),newItem );
        System.out.println("Grocery item " + (position) + " has been modified");
    }

    @Override
    public String toString() {
        String list = "You have "+ groceryList.size() + " items in your shopping list";
        for (int i=0; i< groceryList.size();i++){
            list+="\n" +(i+1) + "." + groceryList.get(i);
        }
        return list;
    }
}
