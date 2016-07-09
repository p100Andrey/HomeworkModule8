package Homework.Exercise1;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        GradeComparator gc = new GradeComparator();
        TreeSet<File> spisokFiles = new TreeSet<>(gc);
        List<ImageFile> imageFiles = new ArrayList<>();
        List<AudioFile> audioFiles = new ArrayList<>();
        List<TextFile> textFiles = new ArrayList<>();

        textFiles.add(doTextFile("Книга 1"));
        textFiles.add(doTextFile("Книга 2"));
        textFiles.add(doTextFile("Книга 3"));

        audioFiles.add(doAudioFile("Аудиофайл 1"));
        audioFiles.add(doAudioFile("Аудиофайл 2"));
        audioFiles.add(doAudioFile("Аудиофайл 3"));

        imageFiles.add(doImageFile("Картина 1"));
        imageFiles.add(doImageFile("Картина 2"));
        imageFiles.add(doImageFile("Картина 3"));

        spisokFiles.addAll(textFiles);
        spisokFiles.addAll(imageFiles);
        spisokFiles.addAll(audioFiles);

        Table table1 = new Table();
        table1.showTable(spisokFiles);
    }

    public static String scanning() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static TextFile doTextFile(String name) {
        System.out.print("Введите название книги - ");
        String temp = scanning();
        TextFile textFile = new TextFile(name);
        textFile.setBook(temp);
        return textFile;
    }

    public static AudioFile doAudioFile(String name) {
        System.out.print("Введите название аудифайла - ");
        String temp = scanning();
        AudioFile audioFile = new AudioFile(name);
        audioFile.setAuthor(temp);
        return audioFile;
    }

    public static ImageFile doImageFile(String name) {
        System.out.print("Введите название картины - ");
        String temp = scanning();
        ImageFile imageFile = new ImageFile(name);
        imageFile.setPainter(temp);
        return imageFile;
    }
}
