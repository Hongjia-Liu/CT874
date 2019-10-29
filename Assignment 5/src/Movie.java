/**
 * Movie.java - CT874 Assignment 5 Question 2 - a
 * @author Hongjia Liu 19234417
 */

public class Movie {
    private String title;
    private String genre;
    int rating;
    /**
     * Constructor
     */
    public Movie() {
        this("unassigned","unassigned",0);
    }
    /**
     * Constructor
     * @param title movie title
     * @param genre movie genre
     * @param rating movie rating
     */
    public Movie(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }
    /**
     * Get movie title
     * @return movie title
     */
    public String getTitle() {
        return title;
    }
    /**
     * set movie title
     * @param title new movie title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Get movie genre
     * @return movie genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Set movie genre
     * @param genre new movie genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    /**
     * Get movie rating
     * @return movie rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * Set movie rating
     * @param rating new movie rating
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * Indicates which movie is playing
     */
    public void playIt() {
        System.out.println(getTitle() + " - Now playing");
    }
}