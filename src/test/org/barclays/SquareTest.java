package org.barclays;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SquareTest
{
    @Test
    public void shouldCalculateArea()
    {
        Square square = new Square(5);
        assertEquals(25, square.area());
    }

    @Test
    public void shouldCalculatePerimeter()
    {
        Square square = new Square(10);
        assertEquals(40, square.perimeter());
    }
}