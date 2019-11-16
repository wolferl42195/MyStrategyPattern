package at.ac.fhcampuswien.students;

import at.ac.fhcampuswien.Student;

public class Predrag extends Student {

    private final String name = "Falcic Predrag";
    private final String quote = "Work smart, not hard.";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getMyFavoriteQuote() {
        return this.quote;
    }
}
