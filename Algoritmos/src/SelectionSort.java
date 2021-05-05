public class SelectionSort {
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int array[] = {64,25,12,22,11};



        ob.Selectionsort(array);
        ob.print(array);
    }

    void Selectionsort(int array[]) {
        int element = array.length;
        for (int i = 0; i < element-1; i++) {


            int min_idx = i;
            for (int j = i+1; j < element; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    void print(int array[])
    {
        int element = array.length;
        for (int i=0; i<element; ++i)
            System.out.print(array[i]+" ");
    }
}
