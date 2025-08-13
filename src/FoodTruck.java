import java.util.Scanner;

public class FoodTruck {
    public static void main(String[]args ) {
        System.out.println("WELCOME TO MY FOOD TRUCK");
        int total=0;
        String order;
        do {
            System.out.println("Menu:\\n1.Tacos\\n2.Nachos\\n3.Enchilladas");
            System.out.println("What would you love:");
            Scanner f=new Scanner(System.in);
            String food=f.nextLine();

            switch(food) {
                case "Tacos":
                    total += 10;
                    break;
                case "Nachos":
                    total += 15;
                    break;
                case "Enchilladas":
                    total += 20;
                    break;
                default:
                    System.out.println("This is not available in the menu");
            }
            System.out.println("Would you like anything else:");
             order=f.nextLine();





        }while(!order.equalsIgnoreCase("no"));
        System.out.println("Thank You");
        System.out.println("Your Total Will Be"+total);
    }
}