/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bingo.sort.algorithm;

import static bingo.sort.algorithm.GFG.bingoSort;
import static bingo.sort.algorithm.GFG.printArray;

/**
 *
 * @author medin
 */
public class BingoSortAlgorithm {
 
    public static void main(String[] args){
        
        GFG gfg = new GFG();
        
        System.out.println("Bingo 1: ");
        int[] arr = { 5, 4, 8, 5, 4, 8, 5, 4, 4, 4 };
        arr = bingoSort(arr, arr.length);
        printArray(arr, arr.length);
 
        System.out.println("Bingo 2: ");
        int[] arr2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        arr2 = bingoSort(arr2, arr2.length);
        printArray(arr2, arr2.length);
 
        System.out.println("Bingo 3: ");
        int[] arr3 = { 0, 1, 0, 1, 0, 1 };
        arr3 = bingoSort(arr3, arr3.length);
        printArray(arr3, arr3.length);
    
}
    
}
