import java.util.Scanner;

public class Chef_And_Happy_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            int count = 0;
            for(int i =0;i<s.length();i++)
            {
                if((s.charAt(i)=='a')||(s.charAt(i)=='o')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='u')){
                    count++;
                    if (count == 3 )
                        break;
                }
                else 
                count = 0;
            }
            System.out.println(count>2?"Happy":"Sad");
        }
    }
}
