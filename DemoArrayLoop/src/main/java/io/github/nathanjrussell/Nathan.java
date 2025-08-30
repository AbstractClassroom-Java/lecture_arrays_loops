package io.github.nathanjrussell;


import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Nathan {
    public static void main(String[] args) {
        int[] arrayOfInts = {5,4,7,2};
        String[] arrayOfStrings = {"Hello", "My Name Is Nathan", "Good Bye"};

        int i = 0;
        while (i < arrayOfInts.length) {
            arrayOfInts[i] = 2 * arrayOfInts[i];
            System.out.println(arrayOfInts[i]);
            i++;
        }

        for (int k = 0; k< arrayOfStrings.length; k++) {
            System.out.println(arrayOfStrings[k]);
        }

        for (String phrase : arrayOfStrings) {
            System.out.println(phrase);
        }

        int[] newArrayOfInts = new int[10];
        for (int k=0; k < newArrayOfInts.length; k++) {
            newArrayOfInts[k] = k;
        }

        for (int value : newArrayOfInts) {
            System.out.println(value);
        }


        i = 50;

        while (i < 10) {
            System.out.println("It worked");
        }

        do {
            System.out.println("It worked");
        } while (i < 10);

//        i = 100;
//        while (i<110) {
//            System.out.println(i);
//            i++;
//        }
//
//        i = 100;
//        while (i<110) {
//            System.out.println(++i);
//        }

        i = 100;
        while (i<110) {
            System.out.println(i++);
        }

        ArrayList<String> dynamicStringArray = new ArrayList<>();
        dynamicStringArray.add("My Name Is Nathan");
        dynamicStringArray.add("My Last Name Is Russell");
        dynamicStringArray.add("My Friend Is Sam");

        for (String phrase : dynamicStringArray) {
            System.out.println(phrase);
        }

        dynamicStringArray.remove(1);

        for (String phrase : dynamicStringArray) {
            System.out.println(phrase);
        }

        for (int k=0; k < dynamicStringArray.size(); k++ ) {
            System.out.println(dynamicStringArray.get(k));
        }

        ArrayList<Integer> dynamicArrayOfInts = new ArrayList<>();
        dynamicArrayOfInts.add(6);
        dynamicArrayOfInts.add(7);

        for (Integer value : dynamicArrayOfInts) {
            System.out.println(value);
        }
    }
}