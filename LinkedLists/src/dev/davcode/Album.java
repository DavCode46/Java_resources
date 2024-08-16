package dev.davcode;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public static void main(String[] args) {
        Song song = new Song("Song Title", 4.05);
        System.out.println(song.toString());
        System.out.println("Length: " + song.toString().length());
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for(Song song : songs) {
            if(song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int numberOfSong, LinkedList<Song> list) {
        int index = numberOfSong - 1;
        if(index >= 0 && index <= songs.size()) {
            list.add(songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> list) {
        Song song = findSong(title);
        if (song != null) {
            list.add(song);
            return true;
        }
        return false;
    }
}
