package at.ac.fhcampuswien.students;

import at.ac.fhcampuswien.Student;

public class HartmannBernhard extends Student {

    private String firstName = "Bernhard";
    private String lastName = "Hartmann";
    private String quote = "There is no shortcuts to any place worth going!";

    @Override
    public String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public String getMyFavoriteQuote() {
        return quote;
    }

}
