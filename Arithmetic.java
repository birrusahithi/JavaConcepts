import java.text.spi.DateFormatProvider;
import java.util.Date;

public class Arithmetic {
    public static void main(String args[]) {
        int m = 8;
        int n = 5;
        // m = n, n = n+1, for m = n++ so output = m=5; n = 6;
        // m = ++n , output is m = 6, n = 6;
        int w = m + n; // output = 13
        int x = m - n; // 3
        int y = m * n; // 40
        double z = (double) m / n; // 1 ( the quotient is giving only 1 and ignoring all decimals after point so to retrieve the decimals include double
        int z1 = m % n;
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(z1);

        //if-else statement

        int a = 8;
        if (a == 0) {
            System.out.println("nothing");
        } else if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        //Ternary operator
        int s = 6;
        int t = 8;
        if (s > 3)
            t = 12;
        else
            t = 10;
        System.out.println(t);
        t = s > 3 ? 12 : 10; // using ternator
        //writing this using ternary operator ?: = condition?exp1:exp2
       int s1 = 8;
       switch(s1) //
       // using switch for shortcut, instead of using if and else
               // int, char and string can be used in switch and string supports 1.7 and above compiler level.
        {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;//if there is no break it will give the result of two and three, if you give the break then it will print only 2
            case 3:
                System.out.print("three");
                break;
            default: // if u give the number which is not here then it will take the nothing instead of not giving any result
                System.out.print("Nothing");
        }
//loop: while, do while, for, for each
    }
}
