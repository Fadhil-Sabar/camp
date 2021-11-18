package com.enigma.oop.shape;

public class MainShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.0,5.0);
        Block block = new Block(3.0,5.0,2.0);

        System.out.println(block.getSurface());
        System.out.println(block.getVolume());
    }
}
