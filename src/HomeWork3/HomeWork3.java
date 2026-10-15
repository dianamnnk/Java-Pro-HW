package HomeWork3;

//Створіть метод printColor() у тілі якого задайте int змінну value та ініціалізуйте її будь-яким значенням.
// Якщо значення менше 0 (0 включно), то в консоль метод повинен вивести повідомлення "Червоний",
//якщо лежить в межах від 0 (0 виключно) до 100 (100 включно), то "Жовтий", якщо більше 100 (100 виключно) - "Зелений";

public class HomeWork3 {

    public static void main(String[] args){ printColor(); }

    public static void printColor(){
        int value = 132;

        if(value <= 0){
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else if (value > 100){
            System.out.println("Green");
        }
    }
}
