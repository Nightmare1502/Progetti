package com.develhope.esercizi.model;

    public class Movie {
        private int id;
        private String nomeFilm;
        private int anno;

        public Movie(int id, String nomeFilm, int anno) {
            this.id = id;
            this.nomeFilm = nomeFilm;
            this.anno = anno;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNomeFilm() {
            return nomeFilm;
        }

        public void setNomeFilm(String nomeFilm) {
            this.nomeFilm = nomeFilm;
        }

        public int getAnno() {
            return anno;
        }

        public void setAnno(int anno) {
            this.anno = anno;
        }
    }
