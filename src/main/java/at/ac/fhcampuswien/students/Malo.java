package at.ac.fhcampuswien.students;

import at.ac.fhcampuswien.Student;

public class Malo extends Student {

	private final String FIRST_NAME = "Pavol";
	private final String LAST_NAME = "Malo";
	private final String QUOTE = "Count your cookies, not your problems.";
	private final String QUOTE_AUTHOR = "The Cookie Monster";
	
	@Override
	public String getName() {
		final String FULL_NAME = this.FIRST_NAME + " " + this.LAST_NAME;
		return FULL_NAME;
	}
	
	@Override
	public String getMyFavoriteQuote() {
		final String QUOTE_WITH_AUTHOR = this.QUOTE + "By: " + this.QUOTE_AUTHOR;
		return QUOTE_WITH_AUTHOR;
	}	
}
