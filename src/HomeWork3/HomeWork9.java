package HomeWork3;

// * Написати метод, який визначає, чи є рік високосним, і повертає boolean
//(високосний – true, не високосний – false).
// Кожен 4-й рік є високосним, крім кожного 100-го, причому кожен 400-й – високосний.


//він ділиться на 4, крім років, які діляться на 100,
//але якщо рік ділиться на 400, він знову високосний.
public class HomeWork9 {
    public static void main(String[] args){
        boolean result = isLeapYear(2024);
        boolean result2 = isLeapYear(2023);

        System.out.println(result);
        System.out.println(result2);
    }

    public static boolean isLeapYear(int year){
        if(year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}