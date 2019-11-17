package at.ac.fhcampuswien.students;

import at.ac.fhcampuswien.Student;

public class Goldschmid extends Student {

    String firstName = "Rene";
    String lastName = "Goldschmid";
    String favoriteQuote = "Always.";

    @Override
    public String getName() {
        return String.format("%s %s", this.firstName, this.lastName);
    }

    @Override
    public String getMyFavoriteQuote() {
        return this.favoriteQuote;
    }
}
