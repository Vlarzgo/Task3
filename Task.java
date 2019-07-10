public class task {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String jewels = "aAb";
        String stones = "caсAcA";
        System.out.println("jewels: " + jewels);
        System.out.println("stones: " + stones);
        System.out.println("Output: " + numJewelsInStones(jewels, stones));
        System.out.println("\n");

        System.out.println("Task 2");
        int[] arr = {-4, -1, 0, 3, 10};
        System.out.println("arr: " + Arrays.toString(arr));
        sortArrayWithSquareValue(arr);
        System.out.println("sort: " + Arrays.toString(arr));
        System.out.println("\n");

        System.out.println("Task 3");
        String myString = "#1AbC!Z";
        System.out.println("Default: " + myString);
        System.out.println("Changed: " + stringToLower(myString));


    }


    private static int numJewelsInStones(String jewels, String stones) {

        int jewelsInStones = 0;

        char[] jewelsArray = jewels.toCharArray();
        char[] stonesArray = stones.toCharArray();

        for (char jewelsValue : jewelsArray) {
            for (char stonesValue : stonesArray) {
                if (jewelsValue == stonesValue) {
                    jewelsInStones++;
                }
            }
        }
        return jewelsInStones;
    }

    private static int[] sortArrayWithSquareValue(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }

        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    buffer = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buffer;
                }
            }
        }
        return result;
    }

    private static String stringToLower (String myString) {

        char[] chars = myString.toCharArray();

        int diffValue = 'a' - 'A';
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += diffValue;
            }
        }
        return new String(chars);
    }

}
