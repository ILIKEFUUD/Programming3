/*
 * Rahul Shah
 * PD 7
 * 1/12/16
 */
public class AddInOrderTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a bunch of movies in alphabetical order \n");

		System.out.println("This is a list of movies in random order \n");
		MovieList myMovies = new MovieList();
		
		System.out.println("FIRST CASE: LIST IS EMPTY \n");
		
		System.out.println("ADD MOVIE Big Bad Wolf in order, in empty list, add normally \n");
		myMovies.addInOrder(new Movie("Big Bad Wolf", 2000));
		System.out.println(myMovies);
		
		System.out.println("Now add a whole bunch of movies \n");
		
		myMovies.add(new Movie("Big Hero 6", 2014));
		myMovies.add(new Movie("Frozen", 2013));
		myMovies.add(new Movie("Hellboy", 2004));
		myMovies.add(new Movie("Monty Python and the Holy Grail", 1975));
		myMovies.add(new Movie("Pan's Labyrinth", 2006));
		myMovies.add(new Movie("Shaun of the Dead", 2004));
		myMovies.add(new Movie("Star Wars: The Force Awakens", 2015));
		myMovies.add(new Movie("The Avengers", 2012));
		myMovies.add(new Movie("The Bee Movie", 2007));
		System.out.println(myMovies);

		System.out.println("\n \nAdd a movie in order that comes first: ");

		myMovies.addInOrder(new Movie("Airplane!", 1980));
		System.out.println("Airplane! added in order, in the beginning \n \n");
		System.out.println(myMovies);

		System.out.println("\n \nAdd a movie in order, in the middle ");

		myMovies.addInOrder(new Movie("Hateful 8", 2015));
		System.out.println("Hateful 8 added in order, in the middle \n \n");
		System.out.println(myMovies);
		
		System.out.println("\n \nAdd a movie in order, at the end ");
		
		myMovies.addInOrder(new Movie("We Bought a Zoo", 2001));
		System.out.println("Zoolander added in order, at the end \n \n");
		System.out.println(myMovies);

	}

}
