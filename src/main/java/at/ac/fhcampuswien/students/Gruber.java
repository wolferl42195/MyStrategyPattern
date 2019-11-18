package at.ac.fhcampuswien.students;

import at.ac.fhcampuswien.Student;

public class Gruber extends Student {

    private String name = "Franz Gruber";
    private String myFavoriteQuote = "Just do it!";


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMyFavoriteQuote() {
        return myFavoriteQuote;
    }
}
