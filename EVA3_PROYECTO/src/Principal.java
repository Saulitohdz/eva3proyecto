
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int ar = 1000000;
        int insertionSort[] = new int[ar];
        int QuickSort[] = new int[ar];
        int BubbleSort[] = new int[ar];
        for (int j = 0; j < 10; j++) {
            int SelectionSort[] = new int[ar];

            for (int i = 0; i < SelectionSort.length; i++) {
                SelectionSort[i] = (int) (Math.random() * 1000000);

            }

            SelectionSort(SelectionSort);
           

        }
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < insertionSort.length; j++) {
                insertionSort[i] = (int) (Math.random() * 1000);
            }
            insertionSort(insertionSort);

        }

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < BubbleSort.length; j++) {
                BubbleSort[i] = (int) (Math.random() * 10);
            }
            bubbleSort(BubbleSort);
        }

        System.out.println("QuickSort");
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < QuickSort.length; j++) {
                QuickSort[i] = (int) (Math.random() *1000);

            }
            long nIni = System.nanoTime();
            Principal.quickSort(QuickSort, 0, QuickSort.length - 1);
            long nFin = System.nanoTime();
            System.out.println(nFin - nIni);
        }
    }

    public static void SelectionSort(int[] arreglo) {
        double startTime =  System.nanoTime();
        for (int i = 0; i < arreglo.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[index]) {
                    index = j;
                }
            }
            int smallerNumber = arreglo[index];
            arreglo[index] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
       double endTime = System.nanoTime();
        double totTime =(double) (endTime - startTime);
        System.out.println("Tiempo SelectionSort: " + totTime);
        

    }
    public static String arrayToList(int[]a){
        String resul= "";
        for (int i : a) {
            resul+=i+" ";
            
        }
        return resul;
    }

    public static void bubbleSort(int[] a) {
        double startTime = System.nanoTime();
        int n = a.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (a[j - 1] > a[j]) {

                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }

            }
        }
        double endTime = System.nanoTime();
        double totTime = endTime - startTime;
        System.out.println("Tiempo BubbleSort: " + totTime);
        
    }

    public static void insertionSort(int[] a) {
        double startTime = System.nanoTime();
        for (int i = 0; i < a.length; i++) {
            int n = a[i];
            int j = i - 1;
            while ((j > -1) && (a[j] > n)) {
                a[j + 1] = a[j];
                j--;

            }
            a[j + 1] = n;
        }
        double endTime = System.nanoTime();
        double totTime = endTime - startTime;
        System.out.println("Tiempo insertionSort: " + totTime);
    }

    public static void quickSort(int[] a, int iz, int de) {
     
        int pivote = a[iz];
        int i = iz;
        int j = de;
        int aux;

        while (i < j) {
            while (a[i] <= pivote && i < j) {
                i++;
            }
            while (a[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = a[i];
                a[i] = a[j];
                a[j] = aux;
            }
        }
        a[iz] = a[j];
        a[j] = pivote;
        if (iz < j - 1) {
            quickSort(a, iz, j - 1);
        }
        if (j + 1 < de) {
            quickSort(a, j + 1, de);

        }
       
    }

}
