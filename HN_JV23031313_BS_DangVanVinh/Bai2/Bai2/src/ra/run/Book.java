package ra.run;

import java.util.Scanner;

public class Book {     // định nghĩa các thuộc tính
    private int bookId;
    private String title;
    private String description;
    private float profit;


    //getter and setter
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    // đọc thông tin từ ng dùng
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        bookId = scanner.nextInt();

        System.out.print("Nhập tên sách: ");
        title = scanner.nextLine();

        System.out.print("Nhập mô tả : ");
        description = scanner.nextLine();

        System.out.print("Nhập lợi nhuận sách: ");
        profit = scanner.nextFloat();
    }

    public void displayData() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + title);
        System.out.println("Mô tả sách: " + description);
        System.out.println("Lợi nhuận sách: " + profit);
    }
}