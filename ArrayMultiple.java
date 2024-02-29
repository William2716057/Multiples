import java.util.Arrays;

public class ArrayMultiple {
    public static int[] generate(int num, int length) {
        int[] multiples = new int[length];

        for (int i = 0; i < length; i++) {
            multiples[i] = num * (i + 1);
        }

        return multiples;
    }

    public static void main(String[] args) {
        int num = 13;
        int length = 16;

        int[] result = generate(num, length);
        System.out.println("Multiples of " + num + ":");
        System.out.println(Arrays.toString(result));
    }
}
