public class HomeWorkApp {
    public static void main(String[] args) {
        check(10, 5);
        positiveOrNegative(10);
        checkingTheNumber(50);
        writingLine("Line", 10);
        leapYear(400);
    }


    public static boolean check(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное.");
        }
        if (a < 0) {
            System.out.println("Число отрицательное.");
        }
    }

    public static boolean checkingTheNumber(int a) {
        if (a >= 0) {
            return false;
        }
        else {
            return true;
        }

    }

    public static void writingLine (String line, int number){
        for (int i =0; i < number; i++){
            System.out.println(line);
        }

    }

    public static boolean leapYear (int years) {
        return years % 4 == 0 & years % 100 != 0 || years % 400 == 0;
    }
}
