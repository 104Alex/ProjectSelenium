package dom_zadanie;

import java.util.Scanner;



public class Lesson11_1 {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение: ");
    int num = in.nextInt();

    switch(num) {

        case 1:
            System.out.println("Сложение");
            break;
        case 2:
            System.out.println("Вычитание");
            break;
        case 3:
            System.out.println("Умножение");
            break;
        default:
            System.out.println("Операция не определена");


            in.close();
    }
}
}


