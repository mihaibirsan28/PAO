package lab4;

import java.util.Random;
import java.util.SplittableRandom;

public class PasswordMaker {
    static final int MAGIC_NUMBER = 49;
    static final String MAGIC_STRING = PasswordMaker.setRandomPassword(20,11);
    private static PasswordMaker passwordMaker;
    private final String name;

    public PasswordMaker(String name) {
        this.name = name;
    }

    private static String setRandomPassword(int st, int dr) {
        Random random = new Random();
        int lungime = random.nextInt(dr) + st;
        String s = "";
        for (int i = 0; i < lungime; i++)
        {
            int x = random.nextInt(94) + 33;
            s= s.concat(String.valueOf((char)x));
        }
        return s;
    }

    public static PasswordMaker getPasswordObject(String name) {
        if (passwordMaker == null)
        {
            passwordMaker = new PasswordMaker(name);
        }
        return passwordMaker;
    }

    public String getPassword() {
        String s = "";
        Random random = new Random();
        s = s.concat(PasswordMaker.setRandomPassword(MAGIC_NUMBER, 1));
        for (int i = 0; i < 10; i++)
        {
            s = s.concat(String.valueOf(s.charAt(random.nextInt(MAGIC_STRING.length()))));
        }
        s.concat(String.valueOf(this.name.length()));
        s.concat(String.valueOf(random.nextInt()));

        return s;
    }
}

class Test {
    public static void main(String[] args) {
        PasswordMaker p = PasswordMaker.getPasswordObject("laborator4");
        System.out.println(p.getPassword());
    }
}


