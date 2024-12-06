package assignmentone;

/**
 * Create class AlbumGenerator.
 */
public class AlbumGenerator {
  /**
   * Create method generateAlbums.
   */
  public Album[] generateAlbums() {
    //Create new array with 4 objects in it
    Album[] albums = new Album[4];
    //Hardcode my four favorite albums
    albums[0] = new Album("Moving Pictures", 1981, "Rush");
    albums[1] = new Album("Dark Side of the Moon", 1973, "Pink FLoyd");
    albums[2] = new Album("Rust in Peace", 1990, "Megadeth");
    albums[3] = new Album("Master of Puppets", 1986, "Metallica");
    
    return albums;
  }
}
