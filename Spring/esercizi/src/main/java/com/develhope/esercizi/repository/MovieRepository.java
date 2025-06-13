package com.develhope.esercizi.repository;

import com.develhope.esercizi.model.Movie;

import java.util.*;

public class MovieRepository {

    private Map<Integer, Movie> movies = Map.ofEntries(
            Map.entry(1, new Movie(1, "The Matrix", 1999)),
            Map.entry(2, new Movie(2, "The Godfather", 1972)),
            Map.entry(3, new Movie(3, "Inside Man", 2006)),
            Map.entry(4, new Movie(4, "Gladiator", 2000)),
            Map.entry(5, new Movie(5, "Whiplash", 2014)),
            Map.entry(6, new Movie(6, "The Matrix Reloaded", 2003)),
            Map.entry(7, new Movie(7, "Inception", 2010)),
            Map.entry(8, new Movie(8, "The Matrix Revolutions", 2003)),
            Map.entry(9, new Movie(9, "The Godfather Part II", 1974)),
            Map.entry(10, new Movie(10, "The Godfather Part III", 1990)),
            Map.entry(11, new Movie(11, "Avatar", 2009)),
            Map.entry(12, new Movie(12, "Avatar: The Way of Water", 2022)),
            Map.entry(13, new Movie(13, "Dune", 2021)),
            Map.entry(14, new Movie(14, "Dune: Part Two", 2024)),
            Map.entry(15, new Movie(15, "Pirates of the Caribbean: The Curse of the Black Pearl", 2003)),
            Map.entry(16, new Movie(16, "Pirates of the Caribbean: Dead Man's Chest", 2006)),
            Map.entry(17, new Movie(17, "Pirates of the Caribbean: At World's End", 2007)),
            Map.entry(18, new Movie(18, "Back to the Future", 1985)),
            Map.entry(19, new Movie(19, "Back to the Future Part II", 1989)),
            Map.entry(20, new Movie(20, "Back to the Future Part III", 1990)),
            Map.entry(21, new Movie(21, "Mad Max: Fury Road", 2015)),
            Map.entry(22, new Movie(22, "A Beautiful Mind", 2001)),
            Map.entry(23, new Movie(23, "Blade Runner", 1982)),
            Map.entry(24, new Movie(24, "Coco", 2017)),
            Map.entry(25, new Movie(25, "Donnie Darko", 2001)),
            Map.entry(26, new Movie(26, "Eternal Sunshine of the Spotless Mind", 2004)),
            Map.entry(27, new Movie(27, "Forrest Gump", 1994)),
            Map.entry(28, new Movie(28, "Interstellar", 2014)),
            Map.entry(29, new Movie(29, "Joker", 2019))
    );

    public Movie findById(int id) {
        return movies.get(id);
    }

    public List<Movie> findAll() {
        Collection<Movie> values = movies.values();
        List<Movie> listaMovies = new ArrayList<>(values);

        Collections.sort(listaMovies, Comparator.comparing(Movie::getId));

        return listaMovies;
    }

}
