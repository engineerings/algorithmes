package com.michal.algorithmes.sort;


public class MainSort {

    private static int[] myArray = new int[20];
    private static int myArraySize = 20;

    public static void createRandomNumbersArray() {

        for(int i = 0; i < myArraySize; i++) {

            myArray[i] = (int)(Math.random() * 10) + 10;
        }
    }

    public static void printArray(int[] arrayToPrint) {

        for(int i = 0; i < arrayToPrint.length - 1; i++) {

            System.out.print(arrayToPrint[i] + " ");
        }
        System.out.println("");
    }

    public static void switchValues(int indexOne, int indexTwo){

        int temp = myArray[indexOne];
        myArray[indexOne] = myArray[indexTwo];
        myArray[indexTwo] = temp;

    }

    public static void bubbleSort(int[] randomArray) {

        int temp;

        for(int i = myArraySize - 1; i > 1; i--) {

            for(int j = 0; j < i; j++) {

                if(randomArray[j] > randomArray[j+1]) {
                    temp = randomArray[j];
                    randomArray[j] = randomArray[j + 1];
                    randomArray[j+1] = temp;
                }
            }
        }
        printArray(randomArray);
    }

    public static void binarySearch(int value) {

        int minIndex = 0;
        int maxIndex = myArraySize - 1;

        while(minIndex <= maxIndex) {

            int middleIndex = (maxIndex + minIndex) / 2;

            if(myArray[middleIndex] < value) {

                minIndex = middleIndex + 1;

            } else if(myArray[middleIndex] > value) {

                maxIndex = middleIndex - 1;

            } else {

                System.out.println("Value " +  value + " found at position " + middleIndex);
                minIndex = maxIndex + 2;
            }
        }
    }

    public static void insertionSort()
    {
        int i,j; /* counters */
        int min; /* index of minimum */

        for(i = 1; i < myArraySize; i++) {

            j = i;
            while((j > 0) && (myArray[j]) < myArray[j - 1]) {
                switchValues(j, j-1);
                j = j-1;
            }
        }
    }



    public static void selectionSort() {

        int i, j; /* counters */
        int min; /* minimum index */

        for(i = 0; i < myArraySize; i++) {
            min = i;
            for(j = i; j < myArraySize; j++)
                if(myArray[j] < myArray[min]) min = j;
                switchValues(i, min);

        }

    }


    public static void main(String[] main) {

        createRandomNumbersArray();
        printArray(myArray);
        /*
        bubbleSort(myArray);
        binarySearch(14);
        */
        /*
        selectionSort();
        printArray(myArray);
        */
        /*
        insertionSort();
        printArray(myArray);
        */




    }
}

