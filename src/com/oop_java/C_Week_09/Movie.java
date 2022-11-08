package com.oop_java.C_Week_09;



import java.util.Comparator;

public class Movie implements Comparable<Movie>, Comparator<Movie> {
    String name;
    double rating;
    double duration;
    Date dateOfRelease;

    public Movie(String name, double rating, double duration, Date dateOfRelease) {
        this.name = name;
        this.rating = rating;
        this.duration = duration;
        this.dateOfRelease = dateOfRelease;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", duration=" + duration +
                ", dateOfRelease=" + dateOfRelease +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        int flag=-1;
        if (this.rating>o.rating)
            flag=1;
        if (this.rating<o.rating)
            flag=-1;
        if (this.rating==o.rating)
            flag=0;
        return flag;
    }

    public int compare(Movie m1, Movie m2){
        int flag=-1;
        if(m1.dateOfRelease.year>m2.dateOfRelease.year)
            flag=1;
        if(m1.dateOfRelease.year<m2.dateOfRelease.year)
            flag=-1;
        if(m1.dateOfRelease.year==m2.dateOfRelease.year)
            flag=0;

        return flag;
    }
}
