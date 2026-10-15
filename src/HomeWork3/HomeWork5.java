package HomeWork3;

//Написати метод, який приймає на вхід два цілих числа і перевіряє,
//що їхня сума лежить в межах від 10 до 20 (включно), якщо так – повернути true, інакше – false.

public class HomeWork5 {

    public static void main(String[] args) {
        boolean check = isTrue(5, 5);
        boolean check2 = isTrue(20, 30);
        System.out.println(check);
        System.out.println(check2);
    }

    public static boolean isTrue(int a, int b){
        int result = a + b;
        if(result >= 10 && result <= 20){
            return true;
        }else {
            return false;
        }
    }
}

