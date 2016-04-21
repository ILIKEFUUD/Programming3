public class MovieTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieList myMovies = new MovieList();// empty list
		System.out.println("Adding Big Hero 6, \n"
				+ "Shaun of the Dead, Frozen, The Avengers, \n"
				+ "Pan's Labyrinth, Hellboy, Monty Python and the Holy Grail, \n"
				+ "Star Wars: The Force Awakens, 2012");
		
		System.out.println("\n \n \n");
		
		
		myMovies.add(new Movie("Big Hero 6", 2014));
		myMovies.add(new Movie("Shaun of the Dead", 2004));
		myMovies.add(new Movie("Frozen", 2013));
		myMovies.add(new Movie("The Avengers", 2012));
		myMovies.add(new Movie("Pan's Labyrinth", 2006));
		myMovies.add(new Movie("Hellboy", 2004));
		myMovies.add(new Movie("Monty Python and the Holy Grail", 1975));
		myMovies.add(new Movie("Star Wars: The Force Awakens", 2015));
		myMovies.add(new Movie("2012", 2009));
		
		System.out.println("Print movielist");
		System.out.println(myMovies);
		

		Movie m1 = new Movie("Big Hero 6", 2014);
		myMovies.delete(m1);
		System.out.println("Deleted Big Hero 6 at the beginning of the list");
		System.out.println(myMovies);

		Movie m2 = new Movie("Pan's Labyrinth", 2006);
		myMovies.delete(m2);
		System.out.println("Deleted Pan's Labyrinth in the middle of the list");
		System.out.println(myMovies);

		Movie m3 = new Movie("2012", 2009);
		myMovies.delete(m3);
		System.out.println("Deleted 2012 at the end of the list");
		System.out.println(myMovies);
		
		System.out.println("Add Bee movie in order");
		myMovies.addInOrder(new Movie("The Bee Movie", 2008));
		System.out.println(myMovies);
		
		System.out.println("Expected: The Bee Movie has been placed after Shuan of the Dead");

	}

}
