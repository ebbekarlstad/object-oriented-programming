package assignmentone;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create class App.
 */
public class App {
  private Scanner input;

  /**
 * Constructor.
 */
  private App(Scanner scannerInput) {
    this.input = scannerInput; // Set the instance variable
  }

  /**
 * Create method helloThere.
 */
  public void helloThere() {
    System.out.print("What is your name? ");
    String name = input.nextLine(); //Take user input

    HelloThere helloThere = new HelloThere(); // Create an instance of HelloThere
    String greeting = helloThere.hello(name); // Call the hello method

    System.out.println(greeting); // Print the greeting
    System. out. println();
  }

  /**
   * Solution for the second task.
   */
  public void seconds() {
    System.out.println("Enter hours, minutes, and seconds: ");
    int hours = input.nextInt();
    int minutes = input.nextInt();
    int seconds = input.nextInt();

    Time time = new Time();
    int totalSeconds = time.toSeconds(hours, minutes, seconds); 
    System.out.println("Total seconds: " + totalSeconds);
  
    System.out.println();
  }

  /**
   * Solution for the third task.
   */
  public void imInaBand() {
    Album newAlbum = new Album("Led Zeppelin II", 1969, "Led Zeppelin");
    System.out.println(newAlbum.getName() + " was released in " + newAlbum.getYear() + " by " + newAlbum.getArtist());
    System. out. println();
  }


  /**
   * Solution for the fourth task.
   */
  public void bestAlbumsEver() {
    AlbumGenerator generator = new AlbumGenerator();
    Album[] albums = generator.generateAlbums();

    for (Album album : albums) {
      System.out.println(album.getName() + " was released in " + album.getYear() + " by " + album.getArtist());
    }
    System. out. println();
  }

  /**
   * Solution for the fifth task.
   */
  public void workingWithArrays() {
    ArrayAlgorithms arrayMethods = new ArrayAlgorithms();
    int[] array = {5, 2, 6, 4, 9, 3, 7, 1, 8};
    System.out.println(Arrays.toString(array));

    System.out.println("Average is: " + arrayMethods.average(array));
    System.out.println("Largest value is: " + arrayMethods.maxValue(array));
    System.out.println("Smallest value is at place number: " + arrayMethods.minIndex(array));
    System.out.println();

    //Here the code differs a bit from the other methods since we have to print the array as a string
    arrayMethods.shift(array);
    System.out.println("Shifted array: " + Arrays.toString(array));

    arrayMethods.shuffle(array);
    System.out.println("Shuffled array: " + Arrays.toString(array));
  }
  /**
   * Starting point of the first assignment.
   *
   * @param args is not used.
   */
  
  public static void main(String[] args) {
    

    // we create a scanner object to work with
    // it is advised to create one and only one scanner for a specific stream in the whole 
    // application scanners should be closed when you are done anewAlbum also closes 
    // the underlying stream
    Scanner consoleInput = new Scanner(System.in, "UTF-8");

    App app = new App(consoleInput);

    // Task 1
    app.helloThere();

    // Task 2
    app.seconds();

    // Task 3
    app.imInaBand();

    // Task 4 
    app.bestAlbumsEver();

    // Task 5
    app.workingWithArrays();


    // If you are going for the higher grades you can uncomment the following lines
    // and implement the methods in the GradeC class.
    // GradeC gradeC = new GradeC();
    // gradeC.calculator(consoleInput);
    // gradeC.arrays2D();
    // gradeC.band();


    // now we are exiting the application so time to close the scanner.
    consoleInput.close();
  }
}
