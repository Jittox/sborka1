package org.example;

import java.util.ArrayList;
import java.util.List;

class ArtExhibition {
    private String exhibitionName;
    private List<Artwork> artworks;

    public ArtExhibition(String exhibitionName) {
        this.exhibitionName = exhibitionName;
        this.artworks = new ArrayList<>();
    }

    public void addArtwork(String title, String author, String time) {
        Artwork artwork = new Artwork(title, author, time);
        artworks.add(artwork);
    }

    public void displayArtworks() {
        System.out.println("Выставка: " + exhibitionName);
        for (Artwork artwork : artworks) {
            System.out.println("Название картины: " + artwork.getTitle());
            System.out.println("Автор: " + artwork.getAuthor());
            System.out.println("Время: " + artwork.getTime());
            System.out.println("_______________");
        }
    }

    //для хранения информации о картинах
    private class Artwork {
        private String title;
        private String author;
        private String time;

        public Artwork(String title, String author, String time) {
            this.title = title;
            this.author = author;
            this.time = time;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getTime() {
            return time;
        }
    }
}

public class zad4 {
    public static void main(String[] args) {
        ArtExhibition exhibition = new ArtExhibition("Modern Art Exhibition");

        exhibition.addArtwork("Abstract Painting", "John Doe", "10:00 AM");
        exhibition.addArtwork("Sculpture", "Jane Smith", "02:00 PM");

        exhibition.displayArtworks();
    }
}
