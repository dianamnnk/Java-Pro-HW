package HomeWork3;
//Написати метод, якому як параметр передається ціле число.
//Метод повинен повернути true, якщо число є негативним, і повернути false якщо позитивне.
public class HomeWork7 {
    public static void main(String[] args){
        boolean result = checkInt(1);
        boolean result2 = checkInt(-1);
        System.out.println(result);
        System.out.println(result2);
    }

    public static boolean checkInt(int value){
        if(value > 0){
            return false;
        } else{
            return true;
        }
    }
}
