import java.util.*;
public class insertionSort {
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {30, 60, 10, 40, 20, 50, 70};
        printArray(arr);
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println();
        printArray(arr);
    }
} 
