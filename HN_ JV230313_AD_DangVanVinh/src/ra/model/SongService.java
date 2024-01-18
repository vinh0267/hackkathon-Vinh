package ra.model;

import ra.model.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongService {
    Song song = new Song();
    private List<Song> songs;


    public SongService() {
        this.songs = new ArrayList<>();
    }

    public void addSong() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Thêm bài hát mới:");
        Song Song = new Song();
        Song.inputSong();

        // You might want to set the songId here (e.g., generate a unique ID or use a database sequence)
        // Song.setSongId(generateUniqueId());

        songs.add(Song);
        System.out.println("Bài hát đã được thêm vào danh sách.");
    }





    public void displayAllSongs() {
        System.out.println("Danh sách các bài hát:");
        System.out.println("Thông tin sản phẩm:");
        System.out.println("ID: " + song.getSongId());
        System.out.println("Tên bài hát: " + song.getSongName());
        System.out.println("Mô tả: " + song.getDescriptions());
        System.out.println("Ca sĩ trình bày: " );
        System.out.println("Người sáng tác: " + song.getSongWriter());
        System.out.println("Ngày tạo: " + song.getCreatedDate());
        System.out.println("Trạng thái bài hát: " + (song.isSongStatus() ? "Đang hoạt động" : "Ngừng hoạt động"));
    }
}
