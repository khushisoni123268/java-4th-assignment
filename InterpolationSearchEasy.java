public class InterpolationSearchEasy {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int x = 70;
        int low = 0, high = arr.length - 1;

        while (low <= high && x >= arr[low] && x <= arr[high]) {
            int pos = low + (x - arr[low]) * (high - low) / (arr[high] - arr[low]);

            if (arr[pos] == x) {
                System.out.println("Element found at index " + pos);
                return;
            }
            if (arr[pos] < x)
                low = pos + 1;
            else
                high = pos - 1;
        }

        System.out.println("Element not found");
    }
}
