package org.academiadecodigo.myarray;

/**
 * Created by codecadet on 05/10/16.
 */
public class ContactList {

    public static void main(String[] args) {

        ArrayVar myArray = new ArrayVar();

        for(int i = 0; i < 6; i++)
            myArray.add("nhe" + i);


        for(int i = 0; i < myArray.size(); i++)
            System.out.println(myArray.get(i));

        System.out.println(myArray.find("nhe1"));

        myArray.remove(2);

        for(int i = 0; i < myArray.size(); i++){
            System.out.println(myArray.get(i));
        }

        System.out.println(myArray.size());

        System.out.println(myArray.isEmpty());

        myArray.emptyArray();

        System.out.println(myArray.isEmpty());

        for(int i = 0; i < myArray.size(); i++){
            System.out.println(myArray.get(i));
        }


    }
}
