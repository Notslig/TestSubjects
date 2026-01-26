package lib;

import java.util.Scanner ;
import lib.Exception ;

public class Maths {
    

    public int[] matrixadd1D(int[] matrixA, int[] matrixB) {

        if (matrixA == null || matrixB == null){
            throw new EmptyElementException() ;
        }

        if (matrixA.length!=matrixB.length){
            throw new MismatchArraySizeException() ;
        }

        int rows=matrixA.length;
        int[] resultMatrix = new int[rows];
        for( int iteration = 0 ; iteration <= matrixA.length ; iteration++){
            resultMatrix[iteration] = matrixA[iteration] + matrixB[iteration] ;
        }

        return resultMatrix ;

    }



    public int[] matrixsub1D(int[] matrixA, int[] matrixB) {

        if (matrixA == null || matrixB == null){
            throw new EmptyElementException() ;
        }

        if (matrixA.length!=matrixB.length){
            throw new MismatchArraySizeException() ;
        }

        int rows=matrixA.length;
        int[] resultMatrix = new int[rows];
        for( int iteration = 0 ; iteration <= matrixA.length ; iteration++){
            resultMatrix[iteration] = matrixA[iteration] - matrixB[iteration] ;
        }

        return resultMatrix ;

    }




    public int[][] matrixadd2D(int[][] matrixA, int[][] matrixB){

        int rowA = matrixA.length ;
        int colA = matrixA[rowA].length ;
        int rowB = matrixB.length ;
        int colB = matrixB[rowB].length ;

        if (matrixA == null || matrixB == null){
            throw new EmptyElementException() ;
            return null ;
        }

        if (rowA != rowB && colA != colB){
            throw new MismatchArraySizeException() ;
            return null ;
        }

        int row = matrixA.length ;
        int col = matrixA[row].length ;
        int[][] resultMatrix = new int[row][col] ;


        for (int i = 0 ; i <= row ; i++ ){
            for (int j = 0 ; j <= col ; j++ ){
                resultMatrix[row][col] = matrixA[row][col] + matrixB[row][col] ;
            }
        }


        return resultMatrix ;
    }


    public int[][] matrixsub2D(int[][] matrixA, int[][] matrixB){

        int rowA = matrixA.length ;
        int colA = matrixA[rowA].length ;
        int rowB = matrixB.length ;
        int colB = matrixB[rowB].length ;

        if (matrixA == null || matrixB == null){
            throw new EmptyElementException() ;
            return null ;
        }

        if (rowA != rowB && colA != colB){
            throw new MismatchArraySizeException() ;
            return null ;
        }

        int row = matrixA.length ;
        int col = matrixA[row].length ;
        int[][] resultMatrix = new int[row][col] ;


        for (int i = 0 ; i <= row ; i++ ){
            for (int j = 0 ; j <= col ; j++ ){
                resultMatrix[row][col] = matrixA[row][col] - matrixB[row][col] ;
            }
        }


        return resultMatrix ;
    }









}
