public class Main {
 static Item[] menu = {
 new Item("Mendoan", 1000, "Food"),
 new Item("Es Teh", 2500, "Drink"),
 new Item("Aneka Sayur", 5000, "Food"),
 new Item("Ayam Goreng", 10000, "Food"),
 new Item("Milk Tea", 10000, "Drink"),
 new Item("Sate Ayam", 15000, "Drink")
 };
  static void showMenu() {
 System.out.println("==> Menu <===");
 for (int i = 0; i < menu.length; i++)
 System.out.println((i + 1) + ") " + 
menu[i].getName() + " - Rp " + menu[i].getPrice());
 System.out.println();
 // int noItem = 1;
 // for (Item item : menu) {
 // System.out.println(noItem + ") " + 
item.getName() + " - Rp " + item.getPrice());
 // noItem++;
 // }
 // System.out.println();
 }
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter your name: ");
 String buyerName = input.nextLine();
 Buyer buyer = new Buyer(buyerName);
 System.out.println("Welcome, " + buyer.getName() + 
"!");
 System.out.println();
 boolean isLooping = true;
 do {
 System.out.println("==> Main Menu <==");
 System.out.println("1) Order your food and drink");
 System.out.println("2) Show order history");
 System.out.println("3) Clear order history");
 System.out.println("4) Exit");
 System.out.print("> ");
 int nav = input.nextInt();
 System.out.println();
 switch (nav) {
 case 1: // Order
 showMenu();
System.out.print("> ");
int choose = input.nextInt() -1;
 boolean inputInvalid = (choose < 0 || 
choose >= menu.length);
 if (inputInvalid)
 System.out.println("Error: Please enter 
correctly!");
 else {
 Item item = menu[choose];
 buyer.order(item);
   }
 System.out.println();
break;
 case 2: // show history
 buyer.showHistory();
 break;
 case 3: // clear history
 buyer.clearHistory();
 break;
 case 4: // Exit
 System.out.println("Thanks for shopping!");
isLooping = false;
break;
 default: // Input invalid
 System.out.println("Error: Please input 
correctly!");
 System.out.println();
break;
 }
 } while (isLooping);
 }
}
