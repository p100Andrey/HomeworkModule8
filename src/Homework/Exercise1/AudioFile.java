package Homework.Exercise1;

public class AudioFile extends File {

    private String author;

    public AudioFile(String audioFile) {
        super(audioFile);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void play() {
        System.out.println(getName() + " is played");
    }

    @Override
    public String toString() {
        return getName() + ", author: " + author;
    }
}
