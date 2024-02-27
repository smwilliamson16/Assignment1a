import java.util.ArrayList;
import java.util.Scanner;

public class listMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listMaker = new ArrayList<>();

        /*Allows user to name their list */
        System.out.println("Name your list:");
        String listName = scanner.nextLine();
        
        /*Main menu */
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1: Add an item your list");
            System.out.println("2: Delete an item from your list");
            System.out.println("3: See your list");
            System.out.println("4: Exit");

            int userOption = scanner.nextInt();
            scanner.nextLine();

            switch (userOption) {
                case 1:
                /* adds item to list. if y to priority, it
                will add item to the top of the list */
                System.out.println("What do you want to add:");
                String newItem = scanner.nextLine();
                
                    System.out.println("Does this have priority?(y/n)");
                    String priority = scanner.nextLine();
                    if (priority.equalsIgnoreCase("y")) {
                       listMaker.add(0, newItem);
                    } else {
                listMaker.add(newItem);}
                System.out.println("You added " + newItem + " to your list.");
                break;
                
                case 2:
                /*allows user to delete an item off their list using the index number. 
                if list is empty it will tell user there is nothing to delete.
                if item selected is not in the list, it will go back to the main menu*/
                if (listMaker.isEmpty()) {
                    System.out.println(listName + " is empty. There is nothing to delete!");
                } else {
                System.out.println("What would you like to delete?(enter item number)");
                int itemNumber = scanner.nextInt();
                scanner.nextLine();
                    if (itemNumber >= 1 && itemNumber <= listMaker.size()) {
                    String deletedItem = listMaker.remove(itemNumber - 1);
                    System.out.println(deletedItem + " was deleted from " + listName + ".");
                } else {
                    System.out.println(itemNumber + " is not a valid option.");}
                    }
                break;

                case 3:
                /*prints out list. if list is empty it will tell user there is nothing to see */
                 if (listMaker.isEmpty()){
                    System.out.println("Nothing to see. " + listName + " is empty!");
                 } else {
                    System.out.println(listName +":");
                    for (int i = 0; i < listMaker.size(); i++) {
                        System.out.println((i + 1) + ": " + listMaker.get(i));
                    }
                 }
                break;

                case 4:
                /*exits the listMaker */
                System.out.println("Exiting " + listName);
                System.exit(0);
                default:
                    System.out.println(userOption + " is not a valid option. Please choose again.");
            }
        }}
    }
        