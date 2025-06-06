import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string: ");
        String s = sc.next();
        boolean o=false;
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1')
            {
                o=true;
            }
            else if (ch == '0'&& o)
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
