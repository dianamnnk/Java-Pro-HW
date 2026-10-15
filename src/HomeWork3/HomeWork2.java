package HomeWork3;

//Створіть метод checkSumSign(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте їх будь-якими значеннями, якими захочете. Далі метод повинен підсумувати ці змінні, і якщо їх сума більша або дорівнює 0,
// то вивести в консоль повідомлення "Сума позитивна", інакше - "Сума негативна";

public class HomeWork2 {

    public static void main(String[] args){ checkSumSign(); }

    public static void checkSumSign() {

        int a = 5;
        int b = 10;

        int result = a + b;
         if(result >= 0){
             System.out.println("The sum is positive");
         } else {
             System.out.println("The sum is negative");
         }
    }

}
