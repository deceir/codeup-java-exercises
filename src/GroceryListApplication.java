import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class GroceryListApplication {

    public static void main(String[] args) {

        Input input = new Input();

        ArrayList<Groceries> grocerylist = new ArrayList<>();


        System.out.println("Would you like to create a grocery list?");
        boolean userStart = input.yesNo();
        boolean keepAdding = true;

        if (userStart) {
            System.out.println("Would you like to enter a new item?");
            boolean userNewItem = input.yesNo();
            if (!userNewItem) {
                System.exit(0);
            }

            do {




                System.out.println("Enter the category of the item from the following selection.");
                System.out.println("Fruits, vegetables, or other.");
                String itemCategory = input.getString();


                System.out.println("Enter the name of the item.");
                String itemName = input.getString();

                System.out.println("Enter quantity of the item to add.");
                int itemQuantity = input.getInt();

                Groceries newGrocery = new Groceries(itemCategory, itemName, itemQuantity);

                grocerylist.add(newGrocery);

                for (Groceries grocery : grocerylist) {
                    System.out.print("Item: " + grocery.getName().toLowerCase());
                    System.out.print(" Category: " + grocery.getCategory().toLowerCase());
                    System.out.print(" Quantity: " + grocery.getQuantity());
                    System.out.println();
                }

                System.out.println("Add another item? (y/n)");
                keepAdding = input.yesNo();

            } while (keepAdding);

            System.out.println();



        } else {
            System.out.println("Goodbye.");
        }


    }

}
