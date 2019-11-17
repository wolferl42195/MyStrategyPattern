package at.ac.fhcampuswien.students;

import at.ac.fhcampuswien.Student;

public class Divkovic extends Student {

    private final String name = "Robert Divkovic";
    private final String quote = "Quality over Quantity.";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getMyFavoriteQuote() {
        return this.quote;
    }
}