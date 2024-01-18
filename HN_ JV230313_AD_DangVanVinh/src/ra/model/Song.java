package ra.model;

import java.util.Date;
import java.util.Scanner;

public class Song {

    private static int nextId = 1;
    private String songId;
    private String songName;
    private String descriptions;
    private Singer singer;
    private String songWriter;
    private Date createdDate;
    private boolean songStatus;

    public Song(String songId, String songName, String descriptions, Singer singer, String songWriter, Date createdDate, boolean songStatus) {
        this.songId = songId;
        this.songName = songName;
        this.descriptions = descriptions;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createdDate = createdDate;
        this.songStatus = songStatus;
    }

    public Song() {

    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }


    public boolean isSongStatus() {
        return songStatus;
    }

    public void setSongStatus(boolean songStatus) {
        this.songStatus = songStatus;
    }



    public void inputSong() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên bài hát: ");
        songName = sc.nextLine();

        System.out.print("Nhập mô tả bài hát: ");
        descriptions = sc.nextLine();

        Singer singer = new Singer(); // Lớp quản lý danh sách ca sĩ


        System.out.print("Nhập ID ca sĩ: ");
        int singerId = Integer.parseInt(sc.nextLine());


        if (singer == null) {
            System.out.println("Ca sĩ không tồn tại. Vui lòng thêm ca sĩ trước.");
            // Thêm ca sĩ mới
            singer = addNewSinger();
        }

    }

    private Singer addNewSinger() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên ca sĩ: ");
        String singerName = sc.nextLine();

        System.out.print("Nhập quốc tịch: ");
        String nationality = sc.nextLine();

        return new Singer(singerName, nationality);
    }

    public void displaySong() {
        System.out.println("Thông tin sản phẩm:");
        System.out.println("ID: " + songId);
        System.out.println("Tên bài hát: " + songName);
        System.out.println("Mô tả: " + descriptions);
        System.out.println("Ca sĩ trình bày: " + singer.getSingerName());
        System.out.println("Người sáng tác: " + songWriter);
        System.out.println("Ngày tạo: " + createdDate);
        System.out.println("Trạng thái bài hát: " + (songStatus ? "Đang hoạt động" : "Ngừng hoạt động"));
    }
}
