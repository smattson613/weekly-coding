package dev.mattson;

import static java.lang.Integer.valueOf;

public class Harshad {
    //I realize this is not a perfect example of recursion but I learned a lot about recursion along the way and will be able to make a better one next time.

    public static Integer sum = 0;


    static boolean willItHarsh(Integer number) {
        String str = number.toString();
        String divisor = str.substring(str.length()-1, str.length());
        String recursion = str.substring(0,str.length()-1);
        sum += Integer.parseInt(divisor);

        if (Integer.parseInt(recursion) > 9) {
            Integer A = valueOf(recursion);
            willItHarsh(A);
        } else {
            sum += Integer.parseInt(recursion);
        }

        if (number % sum == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(willItHarsh(75));
        sum = 0;
        System.out.println(willItHarsh(171));
        sum = 0;
        System.out.println(willItHarsh(481));
        sum = 0;
        System.out.println(willItHarsh(89));
        sum = 0;
        System.out.println(willItHarsh(516));
        sum = 0;
        System.out.println(willItHarsh(200));
    }
}

