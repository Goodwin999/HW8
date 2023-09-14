import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Home task!");

        System.out.println("Task №1");
        int[] time = new int[]{1, 2, 3};
        float[] month = new float[]{1.57f, 7.654f, 9.986f};
        long[] year = {120_000L, 450L, 580_000L};


        System.out.println("Task №2");
        System.out.println(Arrays.toString(time));
        System.out.println(Arrays.toString(month));
        System.out.println(Arrays.toString(year));


        System.out.println("Task №3");
        for (int index = time.length - 1; index >= 0; index--) {
            System.out.print(time[index]);
            if (index > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int index = month.length - 1; index >= 0; index--) {
            System.out.print(month[index]);
            if (index > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int index = year.length - 1; index >=0; index--) {
            System.out.print(year[index]);
            if (index > 0) {
                System.out.print(", ");
            }
        }



    }
}

