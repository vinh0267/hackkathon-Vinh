package ra.run;

import java.util.Arrays;
import java.util.Scanner;

import ra.run.Book;

public class BookManager {
    private static final int MAX_BOOKS = 100; // số lượng không quá 100
    private Book[] newBook; // tạo mảng lưu sách
    private int count; // khởi tạo biến đếm


    // khởi tạo đối tượng BookManager
    public BookManager() {
        newBook = new Book[MAX_BOOKS];
        count = 0;
    }


    //thêm sách mới
    public void addBooks(Scanner scanner) {
        System.out.print("Nhập số lượng sách cần thêm mới( <= 100): ");
        int numBooks = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line sau khi đọc numBooks

        if (count + numBooks > MAX_BOOKS) { // nếu số
            System.out.println("số lượng qua lớn ");
            return;
        }

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Nhập thông tin cho sách thứ " + (i + 1) + ":");
            Book book = new Book();
            book.inputData();
            newBook[count] = book;
            count++;
        }
        System.out.println("Thêm sách thành công.");
    }

    // hiển thị sách
    public void displayAllBooks() {
        if (count == 0) {
            System.out.println("Không có quyển sách nào.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Thông tin sách thứ " + (i + 1) + " là :");
            newBook[i].displayData();
        }
    }

    //sắp xếp
    public void sortBook() {
        if (count == 0) {
            System.out.println("Thư viện không có sách nào.");
            return;
        } else {
            Arrays.sort(newBook, 0, count, (a, b) -> Float.compare(a.getProfit(), b.getProfit()));
        }
    }

    //xóa
    public void deleteBook(Scanner sc) {
        System.out.print("Nhập mã sách cần xóa: ");
        int bookId = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng new line sau khi đọc bookId

        int index = findBookIndex(bookId);
        if (index == -1) {
            System.out.println("Không tìm thấy sách có mã " + bookId);
            return;
        }

        for (int i = index; i < count - 1; i++) {
            newBook[i] = newBook[i + 1];
        }
        count--;

        System.out.println("Xóa sách thành công.");
    }

    public void searchBooks(Scanner scanner) {
        System.out.println("tìm kiếm");
    }

    //tìm kiếm dựa trên id
    private int findBookIndex(int bookId) {
        for (int i = 0; i < count; i++) {
            if (newBook[i].getBookId() == bookId) {
                return i;
            }
        }

        return -1;
    }
}