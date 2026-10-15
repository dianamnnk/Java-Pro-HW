package HomeWork3;

//Створіть метод compareNumbers(), у тілі якого оголосіть дві int змінні a і b,
// та ініціалізуйте їх будь-якими значеннями, якими захочете.
//Якщо a більше або одно b, необхідно вивести в консоль повідомлення “a >= b”, інакше “a < b”;

public class HomeWork4 {

    public static void main(String[] args){ compareNumbers(); }
    public static void compareNumbers(){
        int a = 0;
        int b = 20;

        if(a > b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
