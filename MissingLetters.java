import java.util.*;

public class MissingLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine().toLowerCase();
        boolean[] p = new boolean[26];
        for (char ch : input.toCharArray()) 
        {
            if (ch >= 'a' && ch <= 'z') 
            {
                p[ch - 'a'] = true;
            }
        }
        System.out.print("Missing letters: ");
        boolean m=false;
        for (int i = 0; i < 26; i++) {
            if (!p[i]) {
                System.out.print((char)(i + 'a') + " ");
                m=true;
            }
        }

        if (!m)
 {
            System.out.print("None. All letters are present.");
        }
    }
}
