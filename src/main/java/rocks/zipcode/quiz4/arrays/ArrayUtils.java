package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int middle = values.length / 2;
        return values[middle];
    }

    public static String[] removeMiddleElement(String[] values) {
        int middle = values.length / 2;
        String[] output = new String[values.length - 1];
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (i != middle) {
                output[index] = values[i];
                index++;
            }
        }
        return output;
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] output = new String[values.length - 1];
        for (int i = 0; i < output.length; i++) {
            output[i] = values[i];
        }
        return output;
    }
}