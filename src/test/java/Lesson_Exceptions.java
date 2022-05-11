public class Lesson_Exceptions {
    public static void main(String[] args) {
    chekAge(18);
        //try {
        //   int [] myNumbers = {1, 2, 3};
        // System.out.println(myNumbers[1]);
        // блок кода мы тестим
        //  }
        // catch (Exception e){
        //   System.out.println("Мы вылезли из границ массива");
        // блок кода для обработки исключения

        // } finally {
        //    System.out.println("Работает всегда");
        // }
    }
    static void chekAge(int age){
        if (age < 18){
            throw new ArithmeticException("Меньше 18 лет - доступ закрыт");
        }
        else {
            System.out.println("Старше 18 лет - доступ открыт");
        }
    }
}
