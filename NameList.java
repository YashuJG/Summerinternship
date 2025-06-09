import java.util.ArrayList;
import java.util.Scanner;

public class NameList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.print("Enter the number of names you want to store: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = sc.nextLine();
            names.add(name);
        }
        System.out.println("\nStored Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
