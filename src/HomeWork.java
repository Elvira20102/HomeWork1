public class HomeWork {
    static void main() {
        System.out.println("Orange, \nBanana, \nApple");
    }

    static char printThreeWords;


}


    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -3;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }


public static void printColor() {
    int value = 70;

    if (value <= 0) {
        System.out.println("Красный");
    } else if (value <= 100) {
        System.out.println("Желтый");
    } else {
        System.out.println("Зеленый");
    }
}

public static void compareNumbers(String[] args) {
int a = 20;
    int b = 10;
       if (a>=b){
            System.out.println("a>=b");
       }
       if (a<b)
    {
        System.out.println("a < b");
    }

}

public static boolean isSumInRange(int a, int b) {
    int sum = a + b;

    if (sum >= 10 && sum <= 20) {
        return true;
    } else {
        return false;
    }


    public static void (); {

        public static void main(String[] ) {
            System.out.println("isNegative(10)");
            System.out.println("isNegative(-5)"");
            System.out.println("isNegative(0)");
        }

        public static boolean isNegative(int number) {
            return number < 0;
        }


    public static void main(String[] ) {
        printText ("Привет!", 5);
    }

    public static void printText(String "text, int count") {
        for (int i = 0; i < "count"; i++) {
            System.out.println("text");
        }
    }


    {

        public static void main(String[] args) {
            System.out.println(isLeapYear(2024)); // true
            System.out.println(isLeapYear(1900)); // false
            System.out.println(isLeapYear(2000)); // true
            System.out.println(isLeapYear(2023)); // false
        }

        public static boolean isLeapYear(int year) {
            if (year % 400 == 0) {
                return true;
            } else if (year % 100 == 0) {
                return false;
            } else {
                return year % 4 == 0;
            }
        }



        public static void (String[] args) {

            int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    array[i] = 1;
                } else {
                    array[i] = 0;
                }
            }

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

        public static void main(String[] args) {

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

        public static void main(String[] args) {

        int size = 5;
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
        int[] result = createArray(5, 7);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

        public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }