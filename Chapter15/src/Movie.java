/*
 * Rahul Shah
 * represents a movie
 */
public class Movie implements Comparable{
	private String title;
	private int year;
	//constructor
	public Movie(String t, int y){
		title = t;
		year = y;
	}
	//prints movie
	public String toString(){
		return title + " (" + year + ")";
	}
	
	//checks to see if title and year are same
	public boolean equals(Movie m){
		return(this.title.equals(m.title) && this.year == m.year);
		
	}

	
	//compares movies by title
	public int compareTo(Object o) {
		Movie m = (Movie) o;
		return(this.title.compareTo(m.title));
	}

	
	
	
}//end of Movie
