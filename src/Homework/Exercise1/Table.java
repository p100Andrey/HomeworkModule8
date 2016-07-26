package Homework.Exercise1;

import java.util.Collection;


public class Table {
    public void showTable(Collection<File> anyList) {
        String gorizontalLine = new String(new char[81]).replace("\0", "-");
        System.out.println(gorizontalLine);
        printCell("Name");
        printCell("Book");
        printCell("Author");
        printCell("Painter");
        System.out.println("|");
        System.out.println(gorizontalLine);
        for (File element : anyList) {
            printLine(element, gorizontalLine);
        }
    }

    private void printLine(File file, String gorizontalLine) {
        System.out.printf("|\t%-16.16s", file.getName());
        if (file instanceof ImageFile) {
            printCell("", "", ((ImageFile) file).getPainter());
        }
        if (file instanceof AudioFile) {
            printCell("", ((AudioFile) file).getAuthor(), "");
        }
        if (file instanceof TextFile) {
            printCell(((TextFile) file).getBook(), "", "");
        }
        System.out.println("|");
        System.out.println(gorizontalLine);
    }

    private void printCell(String... values) {
        for (String value : values) {
            System.out.printf("|\t%-16.16s", value);
        }
    }
}
