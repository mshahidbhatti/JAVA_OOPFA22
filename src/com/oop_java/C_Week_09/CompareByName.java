package com.oop_java.C_Week_09;

import java.util.Comparator;

public class CompareByName implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.name.compareTo(o2.name);
    }
}
