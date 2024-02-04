import java.io.*;
import java.util.*;

class Main3{

    public static void main(String args[]){
    int r1;
    int r2;
    int c1;
    int c2;
    int[][] m1 = new int[50][50];
    int[][] m2 = new int[50][50];
    int[][] add= new int[50][50];
    int[][] sub= new int[50][50];
    int[][]mutl= new int[50][50];
    Scanner sc = new Scanner(System.in);
        System.out.println("Enten rows and columns");
        r1 = sc.nextInt();
        r2 = sc.nextInt();
        c1 = sc.nextInt();
        c2 = sc.nextInt();
    System.out.println("ENTER MATRIX1");
    for( int i = 0 ; i<r1 ; i++){
      for( int j = 0 ; j<c1 ; j++){
    m1[i][j] = sc.nextInt();
      }
    }  

    System.out.println("ENTER MATRIX2");
    for( int i = 0 ; i<r2 ; i++){
      for( int j = 0 ; j<c2 ; j++){
    m2[i][j] = sc.nextInt();
      }
    }

    
      System.out.println(" ORIGINAL MATRIX1");
      for( int i = 0 ; i<r1 ; i++){
        for( int j = 0 ; j<c1 ; j++){
      System.out.print(m1[i][j]+" ");
        }
        System.out.println();
      }
  
      System.out.println(" ORIGINAL MATRIX2");
      for( int i = 0 ; i<r2 ; i++){
        for( int j = 0 ; j<c2 ; j++){
      System.out.print(m2[i][j]+" ");
        }
        System.out.println();
      }
    if(r1==r2 || c1==c2){
    System.out.println("ADDITION");
    for( int i = 0 ; i<r2 ; i++){
        for( int j = 0 ; j<c2 ; j++){
      m2[i][j] = sc.nextInt();
      }
    }

  

    
  


    }








}

