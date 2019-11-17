package at.ac.fhcampuswien.students;

import at.ac.fhcampuswien.Student;

import java.util.Objects;

public class SchunkerPhilipp extends Student {

    private String firstname = "Philipp";
    private String surname = "Schunker";
    private String favoriteQuote = "The ones who are crazy enough to think that they can change the world, are the ones who do.";

    @Override
    public String getName() {
        return String.format("%s %s",this.firstname, this.surname);
    }

    @Override
    public String getMyFavoriteQuote() {
        return this.favoriteQuote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SchunkerPhilipp)) return false;
        SchunkerPhilipp that = (SchunkerPhilipp) o;
        return firstname.equals(that.firstname) &&
                surname.equals(that.surname) &&
                favoriteQuote.equals(that.favoriteQuote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, surname, favoriteQuote);
    }
}
