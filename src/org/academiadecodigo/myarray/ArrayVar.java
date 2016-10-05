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
    //add
    //remove
    //get
    //find
    //size - done

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

        return arrElements[index];
    }
}
