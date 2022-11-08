package com.oop_java.C_Week_09;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MoviesDemo {
    public static void main(String[] args) {
        // Iteratable, Collection, List
        // ArrayList
        int x=10;
        //Integer i =new Integer(10);
        //Float f=new Float(0);

        //raw type
        //ArrayList<Object>  movies=new ArrayList<Object>();
        //movies.add(x);
        //collection of Movie type
        ArrayList<Movie>  movies=new ArrayList<Movie>();
        movies.add(new Movie("Movie 1",9,10,new Date(1,1,2000)));
        movies.add(new Movie("Movie 3",4,90,new Date(1,1,1998)));
        movies.add(new Movie("Movie 4",1,320,new Date(1,1,1999)));
        movies.add(new Movie("Movie 5",6,20,new Date(1,1,1999)));
        movies.add(new Movie("Movie 2",2,120,new Date(1,1,1999)));


        System.out.println("Inintial array");
        displayList(movies);
        System.out.println("Sorted list");
        Collections.sort(movies);
        Collections.reverse(movies);
        displayList(movies);

        //movies.s

        System.out.println("Sorted by name list");
        //movies.sort(movies.get(0));
        //movies.sort(new Movie("Movie 2",2,120,new Date(1,1,1999)));
        movies.sort(new CompareByName());
        displayList(movies);

        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.duration> o2.duration?1:-1;
            }
        });

        System.out.println("Sorted by duration");
        displayList(movies);

    }

    public static void displayList(ArrayList<Movie> list){
        for(Movie m:list)
            System.out.println(m);
    }

}
