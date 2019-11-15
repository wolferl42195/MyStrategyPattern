package at.ac.fhcampuswien.students;

import at.ac.fhcampuswien.Student;

public class Rubak extends Student {
    private String vorname = "Mario";
    private String nachname = "Rubak";
    private String favoriteQuote = "Never give up, never surrender!";

    @Override
    public String getName() {
        return String.format("%s %s", vorname, nachname);
    }

    @Override
    public String getMyFavoriteQuote() {
        return favoriteQuote;
    }
}