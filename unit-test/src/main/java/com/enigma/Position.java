package com.enigma;

import java.util.Objects;

public class Position {
    private Integer x;
    private Integer y;

    public Position(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return this.x;
    }

    public Integer getY() {
        return this.y;
    }

    public Position getTop() {
        return new Position(this.x, this.y+1);
    }

    public Position getBottom() {
        return new Position(this.x, this.y-1);
    }

    public Position getRight() {
        return new Position(this.x+1, this.y);
    }

    public Position getLeft() {
        return new Position(this.x-1, this.y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Objects.equals(x, position.x) && Objects.equals(y, position.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }

}
