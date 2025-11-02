class tuf {
    void array(int i, int n, int[] arr) {
        if (i >= n)  // base case
            return;

        // swap elements
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;

        // recursive call
        array(i + 1, n - 1, arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        tuf obj = new tuf();
        obj.array(0, arr.length - 1, arr);

        // print reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
