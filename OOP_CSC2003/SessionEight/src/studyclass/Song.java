package studyclass;

public class Song {
    String title;
    String singer;
    int playCount;

    void increasePlayCount(int count) {
        playCount += count;
    }

    void play() {
        System.out.println("Playing song: " + title + "by " + singer + "count: " + playCount);
    }
}
