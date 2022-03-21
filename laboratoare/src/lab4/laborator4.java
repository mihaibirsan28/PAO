package lab4;

import java.util.Scanner;

public class laborator4 {

    public static void palimdrom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String = ");
        String s = scanner.next();
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        if (s1.toString().equals(s))
            System.out.println("Cuvantul " + s + " este palimdrom");
        else
            System.out.println("Cuvantul " + s + " nu este palimdrom");

    }

    public static void anagrame() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("String 1 = ");
        String s1 = scanner.next();
        System.out.println("String 2 = ");
        String s2 = scanner.next();
        if (s1.length() != s2.length())
        {
            System.out.println("Cele 2 siruri nu sunt anagrame");
        }
        int[] vecf = new int[32];
        for (int i = 0; i < s1.length(); i++)
        {
            vecf[s1.charAt(i) - 97] ++;
        }
        for (int i = 0; i < s2.length(); i++)
        {
            vecf[s2.charAt(i) - 97] --;
        }
        for (int i = 0; i < 30; i++)
        {
            if (vecf[i] != 0)
            {
                System.out.println("Cele 2 siruri nu sunt anagrame");
                return;
            }
        }
        System.out.println("Cele 2 siruri sunt anagrame");
    }

    public static void main(String[] args) {
        palimdrom();
        anagrame();
    }
}
