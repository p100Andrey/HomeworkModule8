package Homework.Exercise1;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<File> spisokFiles = new ArrayList<>();

        spisokFiles.add(doTextFile("Книга 1"));
        spisokFiles.add(doTextFile("Книга 2"));
        spisokFiles.add(doTextFile("Книга 3"));

        spisokFiles.add(doAudioFile("Аудиофайл 1"));
        spisokFiles.add(doAudioFile("Аудиофайл 2"));
        spisokFiles.add(doAudioFile("Аудиофайл 3"));

        spisokFiles.add(doImageFile("Картина 1"));
        spisokFiles.add(doImageFile("Картина 2"));
        spisokFiles.add(doImageFile("Картина 3"));

        sorting(spisokFiles);
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

    public static void sorting(List<File> list) {
        GradeComparator gc = new GradeComparator();
        for (File file : list) {
            for (File file1 : list) {
                if (gc.compare(file, file1) < 0) {
                    File temp = file1;
                    file1 = file;
                    file = temp;
                }
            }
        }
    }

}
