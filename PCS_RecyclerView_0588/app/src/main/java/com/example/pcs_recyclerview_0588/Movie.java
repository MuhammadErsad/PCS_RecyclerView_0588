package com.example.pcs_recyclerview_0588;

public class Movie {
    private String tilte;
    private String year;

    public Movie(String tilte, String year) {
        this.tilte = tilte;
        this.year = year;
    }

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
