package ra.run;

import java.util.Scanner;

import ra.run.BookManager;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManager bookManager = new BookManager();

        while (true) {
            System.out.println("----- Quản lý sách -----");
            System.out.println("1. Thêm sách mới");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Sắp xếp sách theo lợi nhuận");
            System.out.println("4. Xóa sách");
            System.out.println("5. Tìm kiếm sách");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            byte choice = Byte.parseByte(scanner.nextLine());

            switch (choice) {
                case 1:
                    bookManager.addBooks(scanner);
                    break;
                case 2:
                    bookManager.displayAllBooks();
                    break;
                case 3:
                    bookManager.sortBook();
                    break;
                case 4:
                    bookManager.deleteBook(scanner);
                    break;
                case 5:
                    bookManager.searchBooks(scanner);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }
}