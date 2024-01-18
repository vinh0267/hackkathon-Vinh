import ra.model.Singer;
import ra.model.Song;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Singer singer = new Singer();
        Song song = new Song();

//        singer.inputData(singer);
//        singer.displayData();
        song.inputSong();
        song.displaySong();
    }
}