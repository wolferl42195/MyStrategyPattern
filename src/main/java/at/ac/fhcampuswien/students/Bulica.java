package at.ac.fhcampuswien.students;

import at.ac.fhcampuswien.Student;

public class Bulica extends Student {

    private String Fullname = "Indrit Bulica";
    private String Quote = "Action is all that matters.";

    @java.lang.Override
    public String getName() {
        return this.Fullname;
    }

    @java.lang.Override
    public String getMyFavoriteQuote() {
        return this.Quote;
    }
}
