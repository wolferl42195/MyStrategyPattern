package at.ac.fhcampuswien.students;

import at.ac.fhcampuswien.Student;

public class Velibor extends Student {

    private String name = "Velibor";
    private String favoriteQuote = "Live as if you were to die tomorrow. Learn as if you were to live forever.";

    @Override
    public String getName() {
        return String.format("%s", name);
    }

    @Override
    public String getMyFavoriteQuote() {
        return favoriteQuote;
    }
}
