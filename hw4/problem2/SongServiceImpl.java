import java.util.ArrayList;
import java.util.List;

public class SongServiceImpl implements SongService {

    private List<Song> songs;

    public SongServiceImpl(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public Song searchById(Integer songID) {
        for (Song song : songs) {
            if (song.getId()==songID) {
                return song;
            }
        }
        return null;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        List<Song> foundSongs = new ArrayList<>();
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                foundSongs.add(song);
            }
        }
        return foundSongs;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        List<Song> foundSongs = new ArrayList<>();
        for (Song song : songs) {
            if (song.getAlbum().equals(album)) {
                foundSongs.add(song);
            }
        }
        return foundSongs;
    }
}