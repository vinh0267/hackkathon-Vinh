package ra.model;

import ra.model.SingerService;
import ra.model.SongService;

import java.util.Scanner;

public class MusicManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SingerService singerService = new SingerService();
        SongService songService = new SongService();

       while (true) {

            System.out.println("************************MUSIC-MANAGEMENT*************************");
            System.out.println("1. Quản lý ca sĩ");
            System.out.println("2. Quản lý bài hát");
            System.out.println("3. Tìm kiếm bài hát");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            byte choice = (byte) scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    singerManagementMenu(scanner, singerService);
                    break;
                case 2:
                    songManagementMenu(scanner, songService);
                    break;
                case 3:
                    // TODO: Implement search song menu
                    System.out.println("Tính năng đang được phát triển...");
                    break;
                case 4:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    private static void singerManagementMenu(Scanner scanner, SingerService singerService) {

        while (true) {
            System.out.println("**********************SINGER-MANAGEMENT*************************");
            System.out.println("1. Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2. Hiển thị danh sách tất cả ca sĩ đã lưu trữ");
            System.out.println("3. Thay đổi thông tin ca sĩ theo mã id");
            System.out.println("4. Xóa ca sĩ theo mã id");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            byte choice = (byte) scanner.nextInt();

            switch (choice) {
                case 1:
                    singerService.addSinger();
                    break;
                case 2:
                    singerService.displayAllSingers();
                    break;
                case 3:
                    System.out.print("Nhập mã id của ca sĩ cần thay đổi thông tin: ");
                    int singerId = scanner.nextInt();
                    scanner.nextLine();
                    singerService.updateSinger(singerId);
                    break;
                case 4:
                    System.out.print("Nhập mã id của ca sĩ cần xóa: ");
                    int singerIdToDelete = scanner.nextInt();
                    scanner.nextLine();
                    singerService.deleteSinger(singerIdToDelete);
                    break;
                case 5:
                    System.out.println("Quay lại menu chính.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    private static void songManagementMenu(Scanner scanner, SongService songService) {
        while (true) {
            System.out.println("**********************SONG-MANAGEMENT*************************");
            System.out.println("1. Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2. Hiển thị danh sách tất cả bài hát đã lưu trữ");
            System.out.println("3. Thay đổi thông tin bài hát theo mã id");
            System.out.println("4. Xóa bài hát theo mã id");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            byte choice = (byte) scanner.nextInt();

            switch (choice) {
                case 1:
                    songService.addSong();
                    break;
                case 2:
                    songService.displayAllSongs();
                    break;
                case 3:

                    System.out.println("chưa lm");
                    break;
                case 4:
                    System.out.println("chưa lm");
                    break;
                case 5:
                    System.out.println("Quay lại menu chính.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }
    }
}