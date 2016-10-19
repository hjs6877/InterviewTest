package com.siksco.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hjs on 16. 10. 19.
 */
public class MatrixTest {
    @Test
    public void changeAllRowColWithZeroToZeroTest(){
        int[][] matrix = {{1, 1, 2},{2, 0, 1},{1, 2, 3}};
        Matrix matrixInstance = new Matrix();
        int[][] changedMatrix = matrixInstance.changeAllRowColWithZeroToZero(matrix);

        assertEquals(0, changedMatrix[0][1]);
        assertEquals(0, changedMatrix[1][0]);
        assertEquals(0, changedMatrix[1][1]);
        assertEquals(0, changedMatrix[1][2]);
        assertEquals(0, changedMatrix[2][1]);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(" | " + matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
