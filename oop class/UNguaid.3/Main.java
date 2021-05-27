import java.util.Scanner;

public class Main {
    static Fish[] item = {
            new Fish("Oxydoras Niger ", 29, "Fresh Water", 1_000_000),
            new Fish("African Lungfish ", 43, "Fresh Water", 1_250_000),
            new Fish("Palmas Orna ", 18, "Fresh Water", 250_000),
            new Fish("Palmas Delhezy ", 19, "Fresh Water", 150_000),
            new Fish("Blacktip Shark ", 50, "Salt Water", 1_500_000),
            new Fish("Clown Fish ", 12, "Salt Water", 230_000),
            new Fish("Lion Fish ", 25, "Salt Water", 350_000),
            new Fish("BumbleBee Grouper ", 20, "Brackish Water", 1_500_000),
    };

    static void showMenu() {
        System.out.println("==> Fish List <==");
        int itemNumber = 1;
        for (Fish product : item) {
            System.out.println(itemNumber + ") " + product.getName() + product.getSize() + " cm " + " - Rp " + product.getPrice());
            itemNumber++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Buyer buyer = new Buyer();

        System.out.println("\n== ABC FISH STORE ==");
        System.out.println("Welcome to ABC Fish Store");
        System.out.println("the biggest fish store in the world");
        boolean isLooping = true;

        do {
            System.out.println("\n==> Main menu <==");
            System.out.println("1) Fish List");
            System.out.println("2) Cart");
            System.out.println("3) Exit");
            System.out.print("> ");

            int nav = input.nextInt();
            System.out.println();

            switch (nav) {
                case 1:
                    showMenu();
                    System.out.print("> ");
                    int choose = input.nextInt() - 1;
                    boolean inputInvalid = (choose < 0 || choose >= item.length);

                    if (inputInvalid) {
                        System.out.println("Error: the choice you entered is wrong!");
                    } else {
                        Fish goods = item[choose];
                        buyer.buy(goods);
                    }
                    System.out.println();
                    break;
                case 2:
                    buyer.showCart();
                    System.out.println("1. pay \n2. back \n3. reset cart");
                    System.out.print("> ");
                    int select = input.nextInt();
                    boolean invalid = (select < 1 || select > 3);

                    if (invalid) {
                        System.out.println("\nError: the choice you entered is wrong!\n");
                    } else if (select == 1) {
                        buyer.pay();
                        isLooping = false;
                        break;
                    }
                else if (select == 2) {
                        isLooping = true;
                    } 
                else 
                {
                        buyer.resetCart();
                        break;
                    }
                    break;
                case 3:
                    System.out.println("Thank you for shopping at ABC Fish Store");
                    isLooping = false;
                    break;
                default:
                    System.out.println("Error: the choice you entered is wrong!");
                    break;
            }
        } while (isLooping);
    }
}
