import java.io.*;
import java.util.*;

public class StudentFile {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }

        FileWriter fw = new FileWriter("students.txt");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            fw.write(entry.getKey() + "," + entry.getValue() + "\n");
        }
        fw.close();

        System.out.println("\nReading from file:");
        BufferedReader br = new BufferedReader(new FileReader("students.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            System.out.println("ID: " + id + ", Name: " + name);
        }
        br.close();
    }
}
