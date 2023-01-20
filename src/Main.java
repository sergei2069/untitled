import java.util.Random;
import java.util.Arrays ;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000) + 100000;
            System.out.print(array[i] + " ");

            // задание 2
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
            }
        }
        System.out.print("MIN:" + min);


        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
        }
        System.out.print("MAX:" + max);


        //задание 3
        float average = 0;
        for (int i = 0; i < array.length; i++) {
            average = array[i] / array.length;
        }
        System.out.print("Average is:" + average);


        //задание 1

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.print(" SUM:" + sum);

    }


    }


























































































































