package MyTasks;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Checkout {
    public static void invoice(String phoneNumber, String CashierName, String CustomerName, List<String> items, List<Double> amounts, List<Integer> pieces, double total) {
        System.out.println();
        System.out.print("""
                OLAMIDE STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                """);

            System.out.println("TEL :" + phoneNumber);
            System.out.println("DATE :" + LocalDateTime.now());
            System.out.println("Cashier's Name: " + CashierName);
            System.out.println("Customer's Name: " + CustomerName);
            System.out.println("==============================================================================================");
            System.out.println("\n" + "\tITEM\t\t\tQTY\t\t\tPRICE\t\t\tTOTAL(NGN)\n\n----------------------------------------------------------------------");

            double totalPrice =0;
            double overAllPrice =0;
            for(int count = 0; count < items.size(); count++) {
                totalPrice = amounts.get(count) * pieces.get(count);
                overAllPrice += totalPrice;
                System.out.println("\t" + items.get(count) + "\t\t\t" + pieces.get(count) + "\t\t\t" + amounts.get(count) + "\t\t\t" + totalPrice );
            }
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("\t\t\t\t\t\t\t\t\t\t SUB TOTAL:" + overAllPrice  );

        }



        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            List <String> itemsList = new ArrayList<>();
            List<Integer> itemPieces = new ArrayList<>();
            List<Double> prices = new ArrayList<>();
            double total = 0;


            String response = "no";
            System.out.println("What is the customer's name: ");
            String name = input.nextLine();

            do {

                System.out.print(" ");
                String blank = input.nextLine();

                System.out.println("What did the customer buy: ");
                String product = input.nextLine();

                itemsList.add(product);

                System.out.println("How many pieces: ");
                int pieces = input.nextInt();

                itemPieces.add(pieces);

                System.out.println("How much per unit: ");
                double price = input.nextDouble();

                prices.add(price);

                System.out.println("Add more items? (Yes/No): ");
                response = input.next();

            } while (response.equalsIgnoreCase("Yes"));

            for(int count = 0; count < prices.size(); count++){
                total += prices.get(count);
            }

            System.out.println("What is the cashier's name: ");
            String cashier = input.next();

            invoice("09138146912", cashier, name, itemsList, prices, itemPieces, total);




        }
    }



