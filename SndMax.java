public class SndMax {

    public static void main(String[] args) {
        int[] a = { 1, 4, 56, 75, 87, 6, 4, 6, 67, 43, 56, 77, 55, 56 };
        int max = a[0];
        int max2 = a[0];
        int temp;
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] != max) {
                if (max > max2) {
                    if (max2 < a[i]) {
                        max2 = a[i];
                    }
                }
            }
        }

        System.out.println(max2);
        System.out.println(max);
    }
}
