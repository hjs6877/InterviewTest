package com.siksco.array;

/**
 * Created by hjs on 16. 10. 19.
 */
public class Matrix {

    public int[][] changeAllRowColWithZeroToZero(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[i] = true;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
}
