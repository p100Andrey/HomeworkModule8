package Homework.Exercise1;

import java.util.Comparator;
import java.util.List;

public abstract class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}