
import java.util.Scanner;
public class demo5th
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("==> Edit Profile <==");
        System.out.println();

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your nickname: ");
        char nickname = input.nextLine().charAt(0);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your height: ");
        float height = input.nextFloat();

        System.out.println();
        System.out.println("==> My Profile <==");
        System.out.println();
        System.out.println("name    : " + name);
        System.out.println("Inisial : " + nickname);
        System.out.println("age    : " + age + " year");
        System.out.println("height  : " + height + " cm");
    }
}

