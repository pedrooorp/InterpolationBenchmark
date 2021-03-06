package com.pedrooorp;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVFile {

    Point[] points;
    String filename;
    private Path file;

    public CSVFile(String filename, Point[] points) {
        this.points = points;
        this.filename = filename;
        file = Paths.get(System.getProperty("user.home") + "/Desktop/" + filename + ".csv");

    }

    public void save() throws IOException {

        List<String> lines = new ArrayList<>();

        for(int i = 0; i < points.length; i++) {
            lines.add(points[i].x + ";" + points[i].y);
        }

        Files.write(file, lines, Charset.forName("UTF-8"));

    }

}
