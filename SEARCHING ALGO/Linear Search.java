import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int found = 0;
        for(int i = 0; i < n; i++){
            if(arr[i]==key){
                System.out.println("Value found at "+i+" index");
                found = 1;
            }
        }
        if(found==0){
            System.out.println("Key is not found");
        }
    }
}
