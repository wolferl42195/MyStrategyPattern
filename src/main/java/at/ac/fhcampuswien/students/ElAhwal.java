package at.ac.fhcampuswien.students;

import at.ac.fhcampuswien.Student;

public class ElAhwal extends Student {
    private final String NAME = "Tayel Oliver El Ahwal";
    private final String QUOTE = "You know studies show that keeping a ladder in the house is more dangerous than a loaded gun. That's why I own 10 guns. In case some maniac tries to sneak in with a ladder!";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getMyFavoriteQuote() {
        return QUOTE;
    }
}
