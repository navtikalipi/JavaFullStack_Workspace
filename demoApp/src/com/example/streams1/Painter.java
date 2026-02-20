package com.example.streams1;

public class Painter {
    private final String name;
    private final String paintingStyle;
    private final String theme;

    public Painter(String name, String paintingStyle, String theme) {
        this.name = name;
        this.paintingStyle = paintingStyle;
        this.theme = theme;
    }

    public String getName() {
        return name;
    }

    public String getPaintingStyle() {
        return paintingStyle;
    }

    public String getTheme() {
        return theme;
    }
}
