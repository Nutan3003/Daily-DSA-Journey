import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {

    // Function to find the kth largest element using a Min-Heap
    public static void KthLargest(int arr[], int k) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min-Heap by default

        // Add first k elements to the heap
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        // Process remaining elements
        for (int i = k; i < n; i++) {
            if (arr[i] > pq.peek()) { // If current element is larger than the smallest in the heap
                pq.remove();          // Remove the smallest element
                pq.add(arr[i]);       // Add the current element
            }
        }

        // The root of the heap will be the kth largest element
        System.out.println("Kth largest element is: " + pq.peek());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();  // Size of the array
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();  // The value of k

        // Input the array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the kth largest element
        KthLargest(arr, k);
    }
}
