package com.siksco.array;

/**
 * Created by hjs on 16. 10. 19.
 */
public class Matrix {

    public int[][] changeAllRowColWithZeroToZero(int[][] matrix){
        boolean isEnd = false;
        for(int i=0; i < matrix.length; i++){
            if(isEnd) break;
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    for(int m = 0; m < matrix[i].length; m++){
                        matrix[i][m] = 0;
                    }

                    for(int n = 0; n < matrix.length; n++){
                        matrix[n][j] = 0;
                    }
                    isEnd = true;
                    break;
                }
            }
        }
        return matrix;
    }
}
