public class Arrayhomework4 {
    public static void main(String[] args) {
        int[] a = {3, 3, 2, 1, 1, 4};
        System.out.println("duplicates values are");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] == a[j]) && (i != j)) {
                    System.out.print(a[j] + " ,");
                }
            }

        }
    }
}
