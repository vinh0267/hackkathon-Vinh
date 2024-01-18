package ra.model;

import ra.model.Singer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SingerService {
    private List<Singer> singers;

    public SingerService() {
        singers = new ArrayList<>();
    }

    public void addSinger() {
        Singer singer = new Singer();
        singer.inputData();

        singers.add(singer);
        System.out.println("Đã thêm thành công!");
    }

    public void updateSinger(int singerId) {
        Singer singer = findSingerById(singerId);

        if (singer != null) {
            System.out.println("Nhập thông tin ca sĩ mới:");
            singer.inputData();
            System.out.println("Sửa thông tin ca sĩ thành công!");
        } else {
            System.out.println("Không tìm thấy ca sĩ.");
        }
    }

    public void deleteSinger(int singerId) {
        Singer singer = findSingerById(singerId);

        if (singer != null) {
            singers.remove(singer);
            System.out.println("Đã xóa ca sĩ thành công!");
        } else {
            System.out.println("Không tìm thấy ca sĩ.");
        }
    }

    public void displayAllSingers() {
        if (singers.isEmpty()) {
            System.out.println("Không tìm thấy ca sĩ.");
        } else {
            System.out.println("danh sách ca sĩ :");
            for (Singer singer : singers) {
                singer.displayData();
                System.out.println("-----------------------");
            }
        }
    }

    private Singer findSingerById(int singerId) {
        for (Singer singer : singers) {
            if (singer.getSingerId() == singerId) {
                return singer;
            }
        }
        return null;
    }
}
