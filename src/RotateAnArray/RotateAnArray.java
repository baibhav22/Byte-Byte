package RotateAnArray;

public class RotateAnArray {


    public void rotateArray(int array[],int d){


        int temp=array[0];
        for(int i=0;i<d;i++){

            array[i+1]=array[i];
        }
        array[array.length]=temp;



    }


    public void printArray(int array[]) {





    }
}
