import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create some songs
        List<Song> songs = new ArrayList<>();
        Song song1 = new Song("Title 1", "Artist 1", "Album 1", 111, 1111);
        Song song2 = new Song("Title 2", "Artist 2", "Album 2", 222, 1112);
        Song song3 = new Song("Title 3", "Artist 3", "Album 3", 333, 1113);
        Song song4 = new Song("Title 4", "Artist 4", "Album 4", 444, 1114);
        Song song5 = new Song("Title 5", "Artist 5", "Album 5", 555, 1115);
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);

        // Create a real song service 
        SongServiceImpl songService = new SongServiceImpl(songs);

        // Measure the time it takes to search for songs without the proxy
        long startTime = System.currentTimeMillis();

        Song foundSong = songService.searchById(1);
        List<Song> foundSongs = songService.searchByTitle("Title 2");
        foundSongs = songService.searchByAlbum("Album 1");

        long endTime = System.currentTimeMillis();
        System.out.println("Time without proxy: " + (endTime - startTime) + " ms");


        // Create a song service proxy
        CachingProxy cachingProxy = new CachingProxy(songService);

        // Search for songs by ID
        Song foundSongProxy = cachingProxy.searchById(1);
        System.out.println(foundSongProxy);

        // Search for songs by title
        List<Song> foundSongsProxy = cachingProxy.searchByTitle("Title 2");
        System.out.println(foundSongsProxy); 

        // Search for songs by album
        foundSongsProxy = cachingProxy.searchByAlbum("Album 1");
        System.out.println(foundSongsProxy);
    }
}