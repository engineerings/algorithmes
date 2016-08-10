package com.michal.algorithmes.arrays;


public class ArraysFun {

    private int[] myArray = new int[18];
    private int myArraySize = 15;

    public void createArrayRandomNumbers() {

        for(int i = 0; i < myArraySize; i++) {

            myArray[i] = (int)(Math.random() * 10)+ 10;
        }
    }

    public void printMyArray() {

        for(int i = 0; i < myArraySize; i++) {

           System.out.println("----------");

            System.out.print("| " + i + " | " );
            System.out.println(myArray[i] + " |");

            System.out.println("----------");
        }
    }

    public int getValueFormArray(int index) {

        if(index < myArraySize) {
            return  myArray[index];
        } else {
            return 0;
        }
    }

    public boolean isValueInArray(int value) {

        boolean valueInArray = false;

        for (int i = 0; i < myArraySize; i++) {

            if(value == myArray[i]) {

                valueInArray = true;
            }
        }

        return valueInArray;
    }

    public boolean findValueInArray(int value) {

        boolean valueInArray = false;
        String indexesWithValue = "";

        for(int i = 0; i < myArraySize; i++) {

            if(value == myArray[i]) {

                valueInArray = true;
                indexesWithValue += i + " ";
            }
        }

        if(!valueInArray) {
            System.out.println("Value " + value + " not found");
        } else {
            System.out.println("Value found in the Indexes: " + indexesWithValue);
        }

        return valueInArray;
    }

    public void insertValueToArray(int value) {

        if(myArraySize < 18) {

            myArray[myArraySize] = value;
        }

        myArraySize++;
    }

    public void deleteFromArrayAndResize(int index) {

        if(index < myArraySize) {

            for(int i = index; i < (myArraySize - 1); i++) {

                myArray[i] = myArray[i+1];
            }

            myArraySize--;
        }
    }

    public static void main(String[] args) {

        ArraysFun arraysFun = new ArraysFun();
        arraysFun.createArrayRandomNumbers();
        arraysFun.printMyArray();
        //System.out.print(arraysFun.getValueFormArray(5));
        //System.out.print(arraysFun.isValueInArray(18));
        System.out.println("------------------");
        //arraysFun.deleteFromArrayAndResize(3);
        //arraysFun.printMyArray();
        //arraysFun.insertValueToArray(999);
        //arraysFun.printMyArray();
        arraysFun.findValueInArray(15);


    }
}
