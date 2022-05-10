package dom_zadanie;

public class Lesson13 {
    public static void main(String[] args) {

// Задача №1

        int i = 0;
        while (i < 16) {

            System.out.println(i);
            i++;
        }

//         Задача №2

        int a2 = 5;
        int b2 = 2;
        do {
            System.out.println(Math.pow(a2, b2));
            b2 = b2 + 2;
        }
        while (Math.pow(a2, b2) < 10000);

// Задача №3

        int x = 40;
        for (; x <= 60; x = x + 4) {
            {
                System.out.println(x);
            }

        }
    }
    int y = 40;

    {
        while (y <= 60)
        {
            if (y % 4 == 0) ;
            System.out.println(y);
            y = y + 1;

        }
    }
}


