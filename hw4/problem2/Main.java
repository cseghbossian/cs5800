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

        // Create a song service proxy
        CachingProxy cachingProxy = new CachingProxy(songService);

        // 
        // Part A: 
        // Measure the time it takes to search for songs without the proxy
        //
        long startTime = System.currentTimeMillis();

        // Search for songs by ID, Title, Album
        songService.searchById(1115);
        songService.searchByTitle("Title 2");
        songService.searchByAlbum("Album 1");

        long endTime = System.currentTimeMillis();
        System.out.println("Time without proxy: " + (endTime - startTime) + " ms");

        //
        // Part B: 
        // Measure the time it takes to search for songs with the caching proxy
        // BEFORE any songs have been cached
        //
        startTime = System.currentTimeMillis();
    
        // Search for songs by ID, Title, Album
        cachingProxy.searchById(1115);
        cachingProxy.searchByTitle("Title 2");
        cachingProxy.searchByAlbum("Album 1");

        endTime = System.currentTimeMillis();
        System.out.println("Time with proxy before caching: " + (endTime - startTime) + " ms");

        //
        // Part C: 
        // Measure the time it takes to search for songs with the caching proxy
        // AFTER all songs have been cached
        //
        startTime = System.currentTimeMillis();
    
        // Search for songs by ID, Title, Album
        cachingProxy.searchById(1115);
        cachingProxy.searchByTitle("Title 2");
        cachingProxy.searchByAlbum("Album 1");

        long endTimeProxy = System.currentTimeMillis();
        System.out.println("Time with proxy after caching: " + (endTime - startTime) + " ms");
    }
}