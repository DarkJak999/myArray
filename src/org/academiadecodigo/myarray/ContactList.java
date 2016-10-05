package org.academiadecodigo.myarray;

/**
 * Created by codecadet on 05/10/16.
 */
public class ContactList {

    public static void main(String[] args) {

        ArrayVar myArray = new ArrayVar();

        for(int i = 0; i < 6; i++)
            myArray.add("nhe");


        for(int i = 0; i < 6; i++)
            System.out.println(myArray.get(i));

        System.out.println(myArray.size());
    }
}
