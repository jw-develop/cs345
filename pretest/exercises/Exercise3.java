package exercises;

public class Exercise3 {
    /**
     * Uses selection sort to sort a generic array of objects. 
     * 
     * NOTE: the tests for this exercise assume you the selection sort. If you use any other sorting algorithm
     * or any variation on selection sort that does not make the same number of comparisons as selection sort,
     * the tests will fail.
     * 
     * array - An array objects that implement Comparable to sort
     * 
     * PRECONDITION: 
     *  -array contains comparable objects. Array is non-null.
     * 
     * POSTCONDITION: 
     *  - array is sort in decreasing order. More formally, for all n <= m, array[n].compareTo(array[m]) >= 0.
     */
    public static <T extends Comparable<? super T>> void selectionSort(T[] array) {
         for (int i = 0; i < array.length - 1; i++) {
        	 int min = i;
        	 for (int j = i; j < array.length; j++) {
        		 if (array[j].compareTo(array[min]) < 0)
        			 min = j;
        	 T temp = array[min];
        	 array[min] = array[i];
        	 array[i] = temp;
        	 }
         }
    }
}