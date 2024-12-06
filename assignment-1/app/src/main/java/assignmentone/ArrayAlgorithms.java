package assignmentone;

import java.util.Random;

/**
 * Create class ArrayAlgorithms.
 */
public class ArrayAlgorithms {
  /**
 * Calculate average.
 */
  public double average(int[] array) { //Double instead of float, can take higher numbers
    double sum = 0;
    //Create variable value and loop through array
    for (int value : array) {
      sum += value;
    }
    return sum / array.length;
  }
  
  /**
 * Calculate max value.
 */
  public int maxValue(int[] array) {
    int max = array[0];

    //Go through array and set max to value if value is more than current max
    for (int value : array) {
      if (value > max) {
        max = value;
      }
    }
    return max;
  }
  
  /**
 * Calculate position for min int in array.
 */
  public int minIndex(int[] array) {
    int minIndex = 0;
    //Calculating the place where smallest int is at
    for (int i = 1; i < array.length; i++) {
      if (array[i] < array[minIndex]) {
        minIndex = i + 1;
      }
    }
    return minIndex;
  }
  
  /**
 * Shift list by one to the left.
 */
  public int[] shift(int[] array) {
    int temp = array[0];
    for (int i = 1; i < array.length; i++) {
      array[i - 1] = array[i];
    }
    array[array.length - 1] = temp;
    return array; // Return the shifted array
  }

  
  /**
 * Shuffle array and return it.
 */
  public int[] shuffle(int[] array) {
    Random random = new Random();
    for (int i = array.length - 1; i > 0; i--) {
      int indexToSwap = random.nextInt(i + 1); // Random index from 0 to i
      int temp = array[indexToSwap]; // Swap elements

      array[indexToSwap] = array[i];
      array[i] = temp;
    }
    return array; // Return the shuffled array
  }
}