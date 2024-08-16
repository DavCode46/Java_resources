package dev.davcode;

public class Song {

    private String songTitle;
    private double songDuration;

    public Song(String title, double duration) {
        this.songTitle = title;
        this.songDuration = duration;
    }

    public String getTitle() {
        return songTitle;
    }

    @Override
    public String toString() {
        return songTitle + ": " + songDuration;
    }
}
