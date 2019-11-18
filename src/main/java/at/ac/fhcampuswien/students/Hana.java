package at.ac.fhcampuswien.students;

import at.ac.fhcampuswien.Student;

public class Hana extends Student {
    private String name = "Manal Hanna";
    private String myFavoriteQuote = "Just smile, and the life will gonna smile back to you";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMyFavoriteQuote() {
        return myFavoriteQuote;
    }
}
