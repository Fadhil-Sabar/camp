package com.enigma;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    public void getX_Should_returnXPosition2_When_PositionX2Y3(){
        Integer expectedX = 2;
        Position position = new Position(2,3);
        assertEquals(expectedX, position.getX());
    }

    @Test
    public void getY_Should_returnYPosition3_When_PositionX2Y3(){
        Integer expectedY = 3;
        Position position = new Position(2,3);
        assertEquals(expectedY, position.getY());
    }

    @Test
    public void getTop_Should_returnPositionX2Y4_When_PositionX2Y3(){
        Position expectedPosition = new Position(2,4);
        Position originPosition = new Position(2,3);
        assertEquals(expectedPosition, originPosition.getTop());
    }

    @Test
    public void getBottom_Should_returnPositionX2Y2_When_PositionX2Y3(){
        Position expectedPosition = new Position(2,2);
        Position originPosition = new Position(2,3);
        assertEquals(expectedPosition, originPosition.getBottom());
    }

    @Test
    public void getRight_Should_returnPositionX3Y3_When_PositionX2Y3(){
        Position expectedPosition = new Position(3,3);
        Position originPosition = new Position(2,3);
        assertEquals(expectedPosition, originPosition.getRight());
    }

    @Test
    public void getLeft_Should_returnPositionX1Y3_When_PositionX2Y3(){
        Position expectedPosition = new Position(1,3);
        Position originPosition = new Position(2,3);
        assertEquals(expectedPosition, originPosition.getLeft());
    }



}