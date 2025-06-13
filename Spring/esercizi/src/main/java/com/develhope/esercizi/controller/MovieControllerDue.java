package com.develhope.esercizi.controller;

import com.develhope.esercizi.model.Movie;
import com.develhope.esercizi.repository.MovieRepository;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/v2")
public class MovieControllerDue {
    private MovieRepository movieRepo = new MovieRepository();

//    @GetMapping("/film")
//    /**
//     * Modificare questo metodo affinchè:
//     * - accetti un parametro 'q' (String) opzionale che contiene una stringa da cercare nei titoli dei film
//     *      se il parametro è impostato, vengono restituiti quindi solo i film che contengono la stringa
//     * - accetti un paramtero 'limit' (int) che limita i risultati mostrati
//     * - accetti un parametro 'sort' (String: 'anno', 'titolo')
//     * @return
//     */
//    public List<Movie> list() {
//        return movieRepo.findAll();
//    }

    @GetMapping("/film")
    public List<Movie> movie(@RequestParam(required = false) String q,
                             @RequestParam(required = false) String sort,
                             @RequestParam(required = false) Integer limit) {
        List<Movie> movies = movieRepo.findAll();

        // Restituisce solo i film che contengono la stringa {q}
        if (q != null) {
            List<Movie> filteredMovies = new ArrayList<>();
            for (Movie m : movies) {
                String titolo = m.getNomeFilm().toLowerCase();
                if (titolo.startsWith(q.toLowerCase())) {
                    filteredMovies.add(m);
                }
            }
            movies = filteredMovies;
        }

        // Riordina i film per 'titolo' o 'anno'. Per 'id' se inserisco un valore errato nella stringa {sort}
        if (sort != null) {
            switch (sort) {
                case "titolo":
                    movies.sort(Comparator.comparing(Movie::getNomeFilm));
                    break;
                case "anno":
                    movies.sort(Comparator.comparing(Movie::getAnno));
                    break;
                default:
                    throw new ResponseStatusException(HttpStatusCode.valueOf(406), "Parametro inserito errato");
                    // movies.sort(Comparator.comparing(Movie::getId));
            }
        }

        // Limita i risultati mostrati. Se {limit} > lista.size() restituisce la lista intera
        if (limit != null) {
            List<Movie> limitedList = new ArrayList<>();
            int num = limit <= movies.size() ? limit : movies.size();
            for (int i = 0; i < num; i++) {
                limitedList.add(movies.get(i));
            }
            movies = limitedList;
        }

        return movies;
    }

    @GetMapping("/film/{id}")
    public Movie detail(@PathVariable("id") Integer id) {
        Movie movie = movieRepo.findById(id);

        if (movie == null) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(404), "Film non trovato");
        }

        return movie;
    }

}

