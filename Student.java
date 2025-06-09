import java.util.*;

public class Student {
    public static void main(String[] args) {
        HashMap<Integer,String> hs = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            hs.put(id,name);
        }
        
        System.out.println("\nStudent Details:");
        for (Map.Entry<Integer, String> entry : hs.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
