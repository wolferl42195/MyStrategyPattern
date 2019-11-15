package at.ac.fhcampuswien.students;

import at.ac.fhcampuswien.Student;

public class Ganic extends Student {
    private final String NAME = "Armin Ganic";
    private final String QUOTE = "I've buried enough members of the Wayne family.";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getMyFavoriteQuote() {
        return QUOTE;
    }
}
