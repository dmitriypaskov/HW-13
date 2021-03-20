package pashkov;

public class IntList {

    private int[] arr = new int[0];

    public void add(int value) {
        int[] tmpArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, tmpArray, 0, arr.length);
        tmpArray[arr.length] = value;
        arr = tmpArray;
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int size() {
        return arr.length;
    }

    @Override
    public String toString() {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print("[" + arr[i] + "]");
            } else
                System.out.print("[" + arr[i] + "], ");
        }
        return "";
    }
}
