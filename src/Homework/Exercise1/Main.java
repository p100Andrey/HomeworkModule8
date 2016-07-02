package Homework.Exercise1;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<File> spisok1 = new ArrayList<>();

        List<TextFile> spisokTextFiles = new ArrayList<>();
        TextFile text1 = new TextFile("text1");
        text1.setBook("Кобзарь");
        TextFile text2 = new TextFile("text2");
        text2.setBook("Каменяры");
        TextFile text3 = new TextFile("text3");
        text3.setBook("Лисова писня");
        spisokTextFiles.add(text1);
        spisokTextFiles.add(text2);
        spisokTextFiles.add(text3);
        for (TextFile file : spisokTextFiles) {
            spisok1.add(file);
        }
        List<AudioFile> spisokAudioFiles = new ArrayList<>();
        AudioFile audio1 = new AudioFile("audio1");
        audio1.setAuthor("Dj1");
        AudioFile audio2 = new AudioFile("audio2");
        audio2.setAuthor("Dj2");
        AudioFile audio3 = new AudioFile("audio3");
        audio3.setAuthor("Dj3");
        spisokAudioFiles.add(audio1);
        spisokAudioFiles.add(audio2);
        spisokAudioFiles.add(audio3);
        for (AudioFile file : spisokAudioFiles) {
            spisok1.add(file);
        }
        List<ImageFile> spisokImageFiles = new ArrayList<>();
        ImageFile image1 = new ImageFile("image1");
        image1.setPainter("Да Винчи");
        ImageFile image2 = new ImageFile("image2");
        image2.setPainter("Шевченко");
        ImageFile image3 = new ImageFile("image3");
        image3.setPainter("Брюлов");
        spisokImageFiles.add(image1);
        spisokImageFiles.add(image2);
        spisokImageFiles.add(image3);
        for (ImageFile file : spisokImageFiles) {
            spisok1.add(file);
        }
        Table table1 = new Table();
        table1.showTable(spisok1);
    }
}
