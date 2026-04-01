package studyclass;

public class SongTest {
    public static void main(String[] args) {

        Song song1 = new Song();
        Song song2 = new Song();
        Song song3 = new Song();

        song1.title = "내일의 우리";
        song2.title = "너무 아픈 사랑은 사랑이 아니었음을";
        song3.title = "소우주";

        song1.singer = "카더가든";
        song2.singer = "김광석";
        song3.singer = "BTS";

        song1.playCount = 0;
        song2.playCount = 0;
        song3.playCount = 0;

        song1.increasePlayCount(50000);
        song2.increasePlayCount(65000);
        song3.increasePlayCount(120000);

        song1.play();
        song2.play();
        song3.play();
    }
}
