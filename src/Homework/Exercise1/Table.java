package Homework.Exercise1;

import java.lang.reflect.Array;
import java.util.*;


public class Table {
    public void showTable(List<File> anyList) {
        System.out.println("   -----------------------------------------------------------------------------");
        System.out.println("   |  Name            |  Book            |  Author          |  Painter         |");
        System.out.println("   -----------------------------------------------------------------------------");
        for (Object element : anyList) {
            if (element instanceof TextFile) {
                System.out.printf("   |  %-16s", ((TextFile) element).name);
                System.out.printf("|  %-16s", ((TextFile) element).getBook());
                System.out.println("|                  |                  |");
                System.out.println("   -----------------------------------------------------------------------------");
            }
            if (element instanceof AudioFile) {
                System.out.printf("   |  %-16s", ((AudioFile) element).name);
                System.out.print("|                  ");
                System.out.printf("|  %-16s", ((AudioFile) element).getAuthor());
                System.out.println("|                  |");
                System.out.println("   -----------------------------------------------------------------------------");
            }
            if (element instanceof ImageFile) {
                System.out.printf("   |  %-16s", ((ImageFile) element).name);
                System.out.print("|                  |                  ");
                System.out.printf("|  %-16s", ((ImageFile) element).getPainter());
                System.out.println("|");
                System.out.println("   -----------------------------------------------------------------------------");
            }
        }
    }
}
