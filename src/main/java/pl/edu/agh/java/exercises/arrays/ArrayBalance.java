package pl.edu.agh.java.exercises.arrays;

/**
 * Given an array, return true if there is a place to split the array so that
 * the sum of the numbers on one side is equal to the sum of the numbers on the
 * other side.
 * <p>
 * Dla zadanej tablicy zwróć true, jeśli da się tak rozmieścić jej elementy, że
 * suma jej elementów w lewej i w prawej połowie będzie równa.
 *
 * @see http://codingbat.com/prob/p158767
 */
public class ArrayBalance {
    public boolean canBalance(int[] array) {
        if (array.length < 2) {
            return false;
        }

        int start = 0;
        int end = array.length - 1;
        int leftSum = array[start];
        int rightSum = array[end];

        while (start < end - 1) {
            if (leftSum < rightSum) {
                start++;
                leftSum += array[start];
            } else if (leftSum > rightSum) {
                end--;
                rightSum += array[end];
            } else {
                start++;
                leftSum += array[start];
                if (start < end - 1) {
                    end--;
                    rightSum += array[end];
                }
            }
        }

        return leftSum == rightSum;
    }
}
