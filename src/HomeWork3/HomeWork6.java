package HomeWork3;
//Написати метод, якому як параметр передається ціле число, метод повинен надрукувати в консоль,
//чи додатнє число передали або від’ємне. Примітка: нуль вважаємо позитивним числом.

public class HomeWork6 {
    public static void main(String[] args){
        checkInteger(-1);
        checkInteger(5);
        checkInteger(0);
    }

    public static void checkInteger(int value){
        if(value >= 0){
            System.out.println("Integer is positive");
        } else {
            System.out.println("Integer is negative");
        }
    }
}
