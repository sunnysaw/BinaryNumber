import java.util.Scanner;

/*
In this section we will see how we can find binary or octal number.
____________________________________________________________________
Question : for a given number find the binary and decimal digits.
___________________________________________________________________
Approach : First we take input form user and then calculate that input then we convert it into given format.
 */
public class Main {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        int A = SC.nextInt();
        int ans = 0; // condition for starting the loop.
        int multiple = 1; // for putting the value into binary.
        while (A > 0){
            int binary = A % 10;
            ans += (binary * multiple);
            A /= 10;
            multiple *= 2;
        }

        System.out.println(ans);
    }
}