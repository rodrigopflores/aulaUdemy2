package application;

import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Travelling to New Zealand","I'm going to visit this wonderful country!",12);
        post1.addComment("Have a nice trip");
        post1.addComment("Wow that's awesome!");

        Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys","See you tomorrow",5);
        post2.addComment("Good night");
        post2.addComment("May the force be with you");

        System.out.println(post1.toString());
        System.out.println(post2.toString());

    }
}

