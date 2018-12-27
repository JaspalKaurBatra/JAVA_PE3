package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixTest {
    Matrix mat = new Matrix();

    @Test
    public void matrixSum()
    {
       int[][] result = mat.sum(new int[][]{{1, 2, 3}, {4, 5, 6}}, new int[][]{{9, 8, 7}, {6, 5, 4}});
       assertArrayEquals(new int[][]{{10,10},{10,10},{10,10}},result);
    }

    @Test
    public void matrixSumFail()
    {
        int[][] result = mat.sum(new int[][]{{1, 2, 3}, {4, 5, 6}}, new int[][]{{9, 8, 7}, {6, 5, 4}});
        assertArrayEquals(new int[][]{{10,10},{10,10}},result);
    }

}
