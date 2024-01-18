package ra.model;

import java.util.Scanner;

public class Singer {
    private static int nextId = 1;

    private int singerId;
    private String singerName;
    private int age;
    private String nationality;
    private boolean gender;
    private String genre;

    //contructor
    public Singer(int singerId, String singerName, int age, String nationality, boolean gender, String genre) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genre = genre;
    }

    public Singer() {
        this.singerId = nextId;
        nextId++;
    }

    public Singer(String singerName, String nationality) {
    }

    //getter seter
    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Singer.nextId = nextId;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //pt input Data
    public void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên ca sĩ: ");
        singerName = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập quốc tịch: ");
        nationality = sc.nextLine();

        System.out.print("Nhập giới tính (Nam: true, Nữ: false): ");
        gender = Boolean.parseBoolean(sc.nextLine());

        System.out.print("Nhập thể loại: ");
        genre = sc.nextLine();
    }

    //hiển thị ca sĩ
    public void displayData(){
        System.out.println("Thông tin ca sĩ :");
        System.out.println("Tên ca sĩ :" + singerName);
        System.out.println("Tuổi ca sĩ :" + age);
        System.out.println("Quốc tịch ca sĩ :" + nationality);
        System.out.println(" Giói tính ca sĩ :" + gender);
        System.out.println(" Thể loại nhạc :" + genre);
    }

}
