package at.ac.fhcampuswien.students;

import at.ac.fhcampuswien.Student;

public class EnsorAlice extends Student {

	private String name = "Alice Ensor";
	private String qoute = "The secret of success is sincerity. Once you can fake that you've got it made.";
	private String author = "Jean Giraudoux";
	
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getMyFavoriteQuote() {
		
		return String.format("\"%s\" -%s", this.qoute, this.author);
		
	}
	
	
}