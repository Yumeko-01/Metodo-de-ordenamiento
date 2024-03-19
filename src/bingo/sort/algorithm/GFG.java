/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bingo.sort.algorithm;

/**
 *
 * @author medin
 */
public class GFG {

    public GFG() {
    }
    
    
    
    static int bingo;
    static int nextBingo;
 
    // Function for finding the maximum and minimum element
    // of
    // the Array
    public static void maxMin(int[] vec, int n)
    {
        for (int i = 1; i < n; i++) {
            bingo = Math.min(bingo, vec[i]);
            nextBingo = Math.max(nextBingo, vec[i]);
        }
    }
 
    // Function to sort the array
    public static int[] bingoSort(int[] vec, int n)
    {
        bingo = vec[0];
        nextBingo = vec[0];
        maxMin(vec, n);
        int largestEle = nextBingo;
        int nextElePos = 0;
        while (bingo < nextBingo) {
            // Will keep the track of the element position
            // to
            // shifted to their correct position
            int startPos = nextElePos;
            for (int i = startPos; i < n; i++) {
                if (vec[i] == bingo) {
                    int temp = vec[i];
                    vec[i] = vec[nextElePos];
                    vec[nextElePos] = temp;
                    nextElePos = nextElePos + 1;
                }
                // Here we are finding the next Bingo
                // Element for the next pass
                else if (vec[i] < nextBingo)
                    nextBingo = vec[i];
            }
            bingo = nextBingo;
            nextBingo = largestEle;
        }
        return vec;
    }
 
    // Function to print the array
    public static void printArray(int[] arr, int n)
    {
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }   
}
