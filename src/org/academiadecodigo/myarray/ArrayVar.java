package org.academiadecodigo.myarray;
import java.util.*;

/**
 * Created by codecadet on 05/10/16.
 */
public class ArrayVar {

    private static int size = 0;
    private static final int initMax = 5;
    private static int totalSize = initMax;
    private static String[] arrElements;



    ArrayVar(){
        this.arrElements = new String[initMax];
    }
    //add - Done and working
    //remove
    //get - done and working
    //find
    //size - done and working

    public static int getInitMax() {
        return initMax;
    }

    public int size(){
        return size;
    }

    //add
    /*
    First of all I need to check if my array is full.
    If it is, I should create a new array and add the new element to it

    If not, just add the element
     */

    public static void add(String newElement){

        if(size == (totalSize - 1)){
            arrElements = extendArray();
        }

        arrElements[size] = newElement;
        size++;
    }

    //extend array. If array is already at max capacity, make a new array
    public static String[] extendArray(){

        totalSize *= 2;

        String[] newArray = new String[totalSize];

        System.arraycopy(arrElements, 0, newArray, 0, arrElements.length);

        return newArray;
    }

    public static String get(int index){

        if(index >= size){
            return "index out of bounds";
        }

        return arrElements[index];
    }

    public static void remove(int index){

        for (int i = index; i < size; i++)
            arrElements[i] = arrElements[i+1];
        size--;

    }

    public static int find(String searchElement){

        for(int i = 0; i < size; i++){
            if(arrElements[i].equals(searchElement))
                return i;
        }
        return -1;
    }

    public static void emptyArray(){

        for(int i = 0; i < size; i++){
            arrElements[i] = null;
        }
        size = 0;
    }

    public static boolean isEmpty(){

        if(size == 0)
            return true;
        return false;
    }


}
