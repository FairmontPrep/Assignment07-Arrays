/* INSTRUCTIONS
 * The class 'Mountain' has four methods that will test an array to see if it 
 * is a mountain and/or contains a peak.
 * For the method 'getPeakIndex' you will return the index of the firsrt peak 
 * that is found in the parameter array, if one exists. A peak is defined as 
 * an element whose value is greater than the value of the element immediately 
 * before it and is also greater than the value of the element immediately after 
 * it. For example an array of {10, 20, 15} would have a peak at index 1. If no 
 * peak is found the method should return -1.
 * 
 * EXAMPLE CODE:
 *      arr              getPeakIndex(arr)
 * {1, 2, 3, 2, 1}             2
 * {1, 2, 1, 2, 1}             1
 * {1, 2, 3, 5, 7}            -1
 * {9, 3, 5, 7, 12}           -1
 * {9, 3, 5, 7, 5}             3
 * {3, 2, 1}                  -1
 * 
 * For the method 'isMountain' you will return true if the values in the given 
 * array are ordered as a mountain; otherwise, it returns false. An array is 
 * considered a mountain if all three of the following conditions are met:
 *   -There must be a peak (use getPeakIndex)
 *   -The array elements with an index smaller than the peak's index must 
 *    appear in increasing order (use isIncreasing)
 *   -The array elements with an index larger than the peak's index must 
 *    appear in decreasing order (use isDecreasing)
 * 
 * EXAMPLE CODE:
 *      arr             isMountain(arr)
 * {1, 2, 3, 2, 1}          true
 * {1, 2, 1, 2, 1}          false
 * {1, 2, 3, 1, 5}          false
 * {1, 4, 2, 1, 0}          true
 * {9, 3, 5, 7, 5}          false
 * {3, 2, 1}                false
 */

public class Mountain {
    /* @param array an array of positive integer values
     * @param stop the last index to check
     *          Precondition: 0 <= stop < array.length
     * @return true if for each j such that 0 <= j < stop, 
     *      array[j] < array[j + 1]; false otherwise
     */
    public static boolean isIncreasing(int[] array, int stop) {
        if (stop < 0)
            return false;

        for (int j = 0; j < stop; j++){
            if (array[j] >= array[j + 1])
                return false;
        }
        return true;
    }

    /* @param array an array of positive integer values
     * @param start the first index to check
     *          Precondition: 0 <= start < array.length - 1
     * @return true if for each j such that start <= j < array.length - 1, 
     *      array[j] > array[j + 1]; false otherwise
     */
    public static boolean isDecreasing(int[] array, int start) {
        if (start < 0)
            return false;

        int end = array.length - 1;
        for (int j = start; j < end; j++){
            if (array[j] <= array[j + 1])
                return false;
        }
        return true;
    }

    /* COMPLETE THIS METHOD
     * @param array an array of positive integer values
     *          Precondition: array.length > 0
     * @return the index of the first peak (local maximum) in the array, 
     *      if it exists; -1 otherwise
     */
    public static int getPeakIndex(int[] array) {
        // Insert your code below

        return 0;
    }

    /* COMPLETE THIS METHOD
     * @param array an array of positive integer values
     *          Precondition: array.length > 0
     * @return true if array contains values ordered as a mountain; 
     *      false otherwise
     */
    public static boolean isMountain(int[] array) {
        // Insert your code below
        

        return false;
    }
}