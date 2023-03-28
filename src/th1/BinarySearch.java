package th1;

public class BinarySearch {

        static int [] list={2,3,5,9,10,11,13};

    public static void main(String[] args) {
        System.out.println(binarySearch(list,11));
        System.out.println(binarySearch(list,9));
        System.out.println(binarySearch(list,3));
        System.out.println(binarySearch(list,13));
    }
    public static int binarySearch(int [] list,int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
