package random1;

import static util.Util.generateRandomArray;

public class TestRandom {
    /*
    Задача:
        Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
        Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
     */

    public void findRandomNumber() {
        int amountNumber = 100;
        double[] numberArray = new double[amountNumber];
        numberArray = generateRandomArray(numberArray);

        double maxNumber = numberArray[0];
        double minNumber = numberArray[0];
        double middleNumber = 0;

        //ur code ->
        //....
        for (int i = 0; i < numberArray.length; i++) {

            if (maxNumber < numberArray[i]) {
                maxNumber = numberArray[i];
            }

            if (minNumber > numberArray[i]) {
                minNumber = numberArray[i];
            }

            if (middleNumber != 0.5) {
                middleNumber = (maxNumber + minNumber) / 2;
            }else {
                middleNumber = 0.5;
            }

        }

        System.out.println("Max num = " + maxNumber);
        System.out.println("Min num = " + minNumber);
        System.out.println("Middle num = " + middleNumber);

    }
}
