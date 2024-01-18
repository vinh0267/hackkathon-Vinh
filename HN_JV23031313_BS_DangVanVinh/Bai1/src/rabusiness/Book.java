package rabusiness;

import java.util.Scanner;

public class Book { // tạo lớp Book

    private static int nextBookId = 1;
    // định nghĩa các thuộc tính
    private int bookId;
    private String bookName;
    private String author;
    private String descriptions;
    private double importPrice;
    private double exportPrice;
    private float interest;
    private boolean bookStatus;

    //contructor
    public Book() {
        this.bookId = nextBookId++;
        this.bookStatus = true;
    }

    //getter and setter
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }


    //phương thức inout data để yêu cầu ng dùng nhập
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Mời nhập tên sách: ");
        this.bookName = scanner.nextLine();

        System.out.print(" Mời nhập tác giả: ");
        this.author = scanner.nextLine();

        System.out.print("Mời nhập mô tả về sách (ít nhất 10 ký tự): ");
        this.descriptions = scanner.nextLine();

        while (this.descriptions.length() < 10) {
            System.out.print("Mô tả phải có ít nhất 10 ký tự : ");
            this.descriptions = scanner.nextLine();
        }

        System.out.print("Nhập giá nhập: ");
        this.importPrice = scanner.nextDouble();

        while (this.importPrice <= 0) {
            System.out.print("Giá nhập phải lớn hơn 0. Vui lòng nhập lại: ");
            this.importPrice = scanner.nextDouble();
        }

        System.out.print("Nhập giá xuất: ");
        this.exportPrice = scanner.nextDouble();

        while (this.exportPrice <= this.importPrice * 1.2) {
            System.out.print("Giá xuất phải lớn hơn 1.2 lần giá nhập. Vui lòng nhập lại: ");
            this.exportPrice = scanner.nextDouble();
        }

        this.interest = (float) (this.exportPrice - this.importPrice);

        scanner.nextLine(); // Đọc bỏ dòng new line sau khi nhập exportPrice
    }

    //phơng thức display để hiển thị
    public void displayData() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Tác giả: " + author);
        System.out.println("Mô tả về sách: " + descriptions);
        System.out.println("Giá nhập: " + importPrice);
        System.out.println("Giá xuất: " + exportPrice);
        System.out.println("Lợi nhuận: " + interest);
        System.out.println("Trạng thái: " + bookStatus);
    }
}



