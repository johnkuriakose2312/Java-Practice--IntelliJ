import java.util.Scanner;
public class Tester {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalCost = 0;
        char wantToAddFoodItem = 'Y';
        int unitPrice = 10;
        int quantity = 1;

        while (wantToAddFoodItem == 'Y') {
            totalCost = totalCost + (quantity * unitPrice);
            System.out.println("Order placed successfully");
            System.out.println("Total cost: " + totalCost);
            System.out.println("Do you want to add one more food item to the order?");
            String input=sc.next();
            wantToAddFoodItem=input.charAt(0);
        }
        System.out.println("Thank you for ordering the food! It will reach you shortly...");
    }
}