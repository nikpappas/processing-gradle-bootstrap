package com.nikpappas.processing;

import processing.core.PApplet;

import java.awt.*;
import java.util.List;

import static java.util.Arrays.asList;

public class ExampleSketch extends PApplet {


    // The minimum boilerplate code I could get to.
    public static void main(String[] args) {
        PApplet.main(Thread.currentThread().getStackTrace()[1].getClassName());
    }

    private final static List<Color> colours = asList(
            new Color(140, 60, 70, 50),
            new Color(130, 60, 70, 50),
            new Color(20, 160, 60, 40),
            new Color(220, 200, 120, 20)
    );


    // size needs to be called in settings
    @Override
    public void settings() {
        size(900, 600);
    }

    @Override
    public void setup() {
        background(30, 34, 29);
    }

    @Override
    public void draw() {
        transparentBackground(1, 2, 1, 1.3f);

        drawColouredCircle(random(width), random(height), 30);

    }

    private void drawColouredCircle(double x, double y, double extent) {
        stroke(200, 200, 200, 10);

        Color colour = colours.get(floor(random(colours.size())));
        fill(colour.getRed() + random(80), colour.getGreen(), colour.getBlue() + random(30), 30);

        circle((float) x, (float) y, (float) extent);

    }

    private void transparentBackground(int r, int g, int b, float a) {
        fill(r, g, b, a);
        rect(0, 0, width, height);
    }

    private void circle(float x, float y, float r) {
        ellipse(x, y, r, r);
    }


}
