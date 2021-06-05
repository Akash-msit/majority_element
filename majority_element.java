import java.util.*;

public class majority_element {
    static boolean isMajorityElement(int arr[], int n, int key) {
        if (arr[n / 2] == key)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 4, 5, 10, 10 };
        int n = arr.length;
        int x = 10;
        if (isMajorityElement(arr, n, x))
            System.out.printf("%d appears more than %d " + "times in arr[]", x, n / 2);
        else
            System.out.printf("%d does not appear more " + "than %d times in " + "arr[]", x, n / 2);

    }
}