public class binaryysearchh {
    public static int binarysearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int number[] = { 1, 12, 35, 47, 58, 68, 76, 87, 98, 101, 111 };
        int key = 68;
        System.out.println(" the number is : = " + binarysearch(number, key));
    }
}
// Note the  binary search is only apply to the sorted array.