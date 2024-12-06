package assignmentone;

/**
 * Create class Album.
 */
public class Album {
  // Attributes
  String name = "Led Zeppelin II";
  int releaseYear = 1969;
  String artist = "Led Zeppelin";  
  
  /**
 * Constructor method.
 */
  public Album(String name, int releaseYear, String artist) {
    // Call the setters and getters
    setName(name);
    setYear(releaseYear);
    setArtist(artist);
  }

  // Set and Get methods

  /**
 * Set name.
 */
  public void setName(String name) {
    if (name != null && name.length() > 4) {
      this.name = name;
    } else {
      this.name = "No name";
    }
  }

  /**
 * Get name.
 */
  public String getName() {
    return this.name;
  }

  /**
 * Set year.
 */
  public void setYear(int releaseYear) {
    if (releaseYear >= 1801 && releaseYear <= 2029) {
      this.releaseYear = releaseYear;
    } else {
      this.releaseYear = -1;
    }
  }

  /**
 * Get year.
 */
  public int getYear() {
    return this.releaseYear;
  }

  /**
 * Set artist.
 */
  public void setArtist(String artist) {
    if (artist != null && artist.length() > 2) {
      this.artist = artist;
    } else {
      this.artist = "No artist";
    }
  }

  /**
 * Get artist.
 */
  public String getArtist() {
    return this.artist;
  }
}
