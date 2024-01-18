package rabusiness;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book = new Book(); // tạo đối tượng từ lớp Book
        book.inputData();
        book.displayData();
    }
}