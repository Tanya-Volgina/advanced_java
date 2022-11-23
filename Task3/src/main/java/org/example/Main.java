package org.example;

public class Main {
    public static void main(String[] args) {
        int numbersArray[] = getNumbers();
        showArray(numbersArray);

        int maxNegativeNumber = findMaxNegativeNumber(numbersArray);
        int minPositiveNumber = findMinPositiveNumber(numbersArray);

        if (Validate(maxNegativeNumber, minPositiveNumber)) {
            int[] swappedArray = swapMinAndMax(numbersArray, maxNegativeNumber, minPositiveNumber);
            showArray(swappedArray);
        }
    }

    private static boolean Validate(int maxNegativeNumber, int minPositiveNumber) {
        if (maxNegativeNumber == Integer.MIN_VALUE) {
            System.out.println("Отсутсвует отрицательное число");

            return false;
        } else if (minPositiveNumber == Integer.MAX_VALUE) {
            System.out.println("Отсутствует положительное число");

            return false;
        }

        return true;
    }

    private static int[] getNumbers() {
        int array[] = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomInt();
        }

        return array;
    }

    private static int getRandomInt() {
        return (int) (Math.random() * 21) - 10;
    }

    /**
     * Возвращает минимальное значение Integer, когда в массиве нет отрицательных чисел
     */
    private static int findMaxNegativeNumber(int[] numbersArray) {
        int maxNegative = Integer.MIN_VALUE;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] > maxNegative && numbersArray[i] < 0) {
                maxNegative = numbersArray[i];
            }
        }
        System.out.println("Максимальное отрицательное число: " + maxNegative);

        return maxNegative;
    }

    /**
     * Возвращает максимально значение Integer, когда в массиве нет положительных чисел
     */
    private static int findMinPositiveNumber(int[] numbersArray) {
        int minPositive = Integer.MAX_VALUE;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] < minPositive && numbersArray[i] > 0) {
                minPositive = numbersArray[i];
            }
        }
        System.out.println("Минимальное положительное число: " + minPositive);

        return minPositive;
    }

    private static int[] swapMinAndMax(int[] numbersArray, int maxNumber, int minNumber) {
        if (maxNumber == minNumber) return numbersArray;

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] == maxNumber) {
                numbersArray[i] = minNumber;
            } else if (numbersArray[i] == minNumber) {
                numbersArray[i] = maxNumber;
            }
        }

        return numbersArray;
    }

    private static void showArray(int[] numbersArray) {
        for (int element : numbersArray) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}

