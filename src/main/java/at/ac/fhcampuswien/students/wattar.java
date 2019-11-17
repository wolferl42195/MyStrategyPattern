package at.ac.fhcampuswien.students;

import at.ac.fhcampuswien.Student;

public class Wattar extends Student {

    private  string firstName = "Mohammad Bashar";
    private  string lastName = "Wattar";
    private  string favoriteQuote = "Enjoy Today, Don't wait for Tomorrow ";


    @java.lang.Override
    public String getName() {
        return String.format("Full Name: %s %s", firstName, lastName);
    }

    @java.lang.Override
    public String getMyFavoriteQuote() {
        return favoriteQuote;
    }
}
