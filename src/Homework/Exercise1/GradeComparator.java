package Homework.Exercise1;

import java.io.*;
import java.util.Comparator;

public class GradeComparator implements Comparator<File>{
    @Override
    public int compare(File file, File file1) {
        return file.getName().compareTo(file1.getName());
    }

}
