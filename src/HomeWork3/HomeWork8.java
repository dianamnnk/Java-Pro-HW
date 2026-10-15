package HomeWork3;

//Написати метод, якому як аргументи передається рядок і число,
//метод повинен надрукувати в консоль зазначений рядок, вказану кількість разів;

public class HomeWork8 {
    public static void main(String[] args){
        writeCommand("Hello, world", 2);
        writeCommand("Hello, Diana", 3);
    }

    public static void writeCommand(String user, int times){
        for(int i = 0; i < times; i++){
            System.out.println(user);
        }
    }
}
