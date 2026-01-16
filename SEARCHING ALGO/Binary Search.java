import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int found = 0;
        int low = 0, high = n-1;
        while( low <= high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                System.out.println("Key found at "+mid);
                found = 1;
                break;
            } else if(arr[mid] > key){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if(found == 0){
            System.out.println("Key isn't in the array");
        }
    }
}
