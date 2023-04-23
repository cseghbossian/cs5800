import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachingProxy implements SongService {

    // Song Service
    private SongServiceImpl songService;

    // Caches for various song metadata
    private Map<Integer, Song> songCache;
    private Map<String, List<Song>> titleCache;
    private Map<String, List<Song>> albumCache;

    public CachingProxy(SongServiceImpl songService) {
        this.songService = songService;
        this.songCache = new HashMap<>();
        this.titleCache = new HashMap<>();
        this.albumCache = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID) {

        Song song = songCache.get(songID);

        if (song == null) {

            //Query server (imitate high latency)
            song = songService.searchById(songID);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}

            // Add to song cache
            songCache.put(songID, song);
        }
        return song;

    }

    @Override
    public List<Song> searchByTitle(String title) {

        List<Song> songs = titleCache.get(title);

        if (songs == null) {

            //Query server (imitate high latency)
            songs = songService.searchByTitle(title);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}

            // Add to song cache
            titleCache.put(title, songs);
        }
        return songs;

    }

    @Override
    public List<Song> searchByAlbum(String album) {

        List<Song> songs = albumCache.get(album);

        if (songs == null) {

            //Query server (imitate high latency)
            songs = songService.searchByAlbum(album);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}

            // Add to song cache
            albumCache.put(album, songs);
        }
        return songs;

    }
}

