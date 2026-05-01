public class DZ255 {

    public static void main(String[] args) {

        String[][] array = {
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"9","10","11","12"},
                {"13","14","15","16"}
        };

        try {
            int result = processArray(array);
            System.out.println("Сумма: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int processArray(String[][] array)
            throws MyArraySizeException, MyArrayDataException {


        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен быть 4x4");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i].length != 4) {
                throw new MyArraySizeException("Массив должен быть 4x4");
            }

            for (int j = 0; j < array[i].length; j++) {

                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "Ошибка в ячейке [" + i + "][" + j + "]"
                    );
                }
            }
        }

        return sum;
    }
}