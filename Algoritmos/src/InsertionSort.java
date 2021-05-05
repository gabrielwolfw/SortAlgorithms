public class InsertionSort {
    public static void main(String args[]) {
        int array[] = {90,21,32,3,5,2};

        InsertionSort ob = new InsertionSort();

        ob.Insertionsort(array);
        ob.print(array);
    }


    void Insertionsort(int array[]) {
        int n = array.length;


        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    static void print(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
    }
}
