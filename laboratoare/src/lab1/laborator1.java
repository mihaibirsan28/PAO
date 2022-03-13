package lab1;

import java.util.Scanner;

public class laborator1 {
    public static void main(String[] args) {
        System.out.println("Laborator 1:");

        System.out.println("Exercitiul 1:");
        int n,i;
        System.out.print("n = ");
        n = new Scanner(System.in).nextInt();
        for(i = 0; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Exercitiul 2:");
        int x,y;
        System.out.print("x = ");
        x = new Scanner(System.in).nextInt();
        System.out.print("y = ");
        y = new Scanner(System.in).nextInt();
        if(x > y)
        {
            System.out.println("Numarul mai mare este: " + x);
        }
        else
        {
            if(y > x)
            {
                System.out.println("Numarul mai mare este: " + y);
            }
            else
            {
                System.out.println("Numerele sunt egale = " + x);
            }
        }
        System.out.println("Exercitiul 3:");
        int f, rez = 1;
        System.out.print("f = ");
        f = new Scanner(System.in).nextInt();
        for(i = 1; i<= f ; i++)
        {
            rez = rez * i;
        }
        System.out.println("Factorial din " + f + " este: " + rez);
        System.out.println("Exercitiul 4:");
        int rez1=0, m;
        System.out.print("m = ");
        m = new Scanner(System.in).nextInt();
        for (i = 1; i <= m; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                rez1 += i;
            }
        }
        System.out.println("Suma multiplilor de 3 si 5 pana la n este " + rez1);
        System.out.println("Exercitiul 5:");
        int k=0,j=0;
        int[] vp, vi;
        System.out.print("n = ");
        n = new Scanner(System.in).nextInt();
        vp = new int[n];
        vi = new int[n];
        for(i = 1; i <= n ; i++)
        {
            x = new Scanner(System.in).nextInt();
            if (x % 2 == 0)
            {
                vp[k] = x;
                k++;
            }
            else
            {
                vi[j] = x;
                j++;
            }
        }
        System.out.println("Elementele pare:");
        for (i = 0; i < k; i++)
        {
            System.out.print(vp[i] + " ");
        }
        System.out.println();
        System.out.println("Elementele impare:");
        for (i = 0; i < j; i++)
        {
            System.out.print(vi[i] + " ");
        }
        System.out.println();

        System.out.println("Exercitiul 6:");
        int nr=0,sum=0;
        int[] v;

        System.out.print("n = ");
        n = new Scanner(System.in).nextInt();
        v = new int[n];
        for(i = 0; i < n ; i++)
        {
            v[i] = new Scanner(System.in).nextInt();
            if (v[i] == -1)
            {
                break;
            }
            else
            {
                nr++;
                sum += v[i];
            }

        }
        System.out.println("Media notelor este: " + sum/nr);

        System.out.println("Exercitiul 7:");
        int[] fib;
        System.out.print("n = ");
        n = new Scanner(System.in).nextInt();
        fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for( i = 2; i < n ; i++)
        {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println("Al " + n + "-lea termen din sirul lui Fibonacci este " + fib[n-1]);
    }
}
