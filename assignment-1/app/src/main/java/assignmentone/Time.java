package assignmentone;

//import org.checkerframework.checker.units.qual.min;

/**
 * Create class Time.
 */
public class Time {
  /**
   * Method to calculate h, m, and s to seconds.
   */
  public int toSeconds(int hours, int minutes, int seconds) {
    int totalSeconds = 0;
    hours = hours * 3600;
    minutes = minutes * 60;
    totalSeconds = hours + minutes + seconds;

    return totalSeconds;
  }
}