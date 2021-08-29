/*
TODO 17 21
 */

import task1.BerylliumSphere;
import task1.Methods;
import task12.Ex12;
import task13.Ex13;
import task14.ArraysOfPrimitives;
import task15.ContainerComparison;
import task16.TestArrayGeneration;
import task17.Test;
import task18.CopiedArray;
import task19.EqualsArrays;
import task2.ReturnArrayOfBS;
import task20.DeepEquals;
import task21.CBerylliumSphere;
import task21.CBerylliumSphereComparator;
import task22.BSearchArray;
import task23.ReversedIntegers;
import task3.TwoDimensionalArray;
import task4.ThreeDimensionalArray;
import task5.NonPrimitiveArray;
import task6.TwoDimensionalArrayBS;
import task7.ThreeDimensionalArrayBS;
import task8.Assertions;
import task9.PeelBanana;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        /*
        Exercise 1: (2) Create a method that takes an array of BerylliumSphere as an
        argument. Call the method, creating the argument dynamically. Demonstrate that ordinary
        aggregate array initialization doesn’t work in this case. Discover the only situations where
        ordinary aggregate array initialization works, and where dynamic aggregate initialization is
        redundant.
         */

        Methods.method1(new BerylliumSphere[3]);
        Methods.method1(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()});

        System.out.println();


        /*
        Exercise 2: (1) Write a method that takes an int argument and returns an array of that
        size, filled with BerylliumSphere objects
         */

        System.out.println(Arrays.toString(ReturnArrayOfBS.getArray(5)));

        System.out.println();


        /*
        Exercise 3: (4) Write a method that creates and initializes a twodimensional array of
        double. The size of the array is determined by the arguments of the method, and the
        initialization values are a range determined by beginning and ending values that are also
        arguments of the method. Create a second method that will print the array generated by the
        first method. In main( ) test the methods by creating and printing several different sizes of
        arrays.
         */

        TwoDimensionalArray.printTwoDimensionalArray(TwoDimensionalArray.getDoubleTwoDimensionalArray(3, 3, 1, 5));

        System.out.println();

        /*
        Exercise 4: (2) Repeat the previous exercise for a three-dimensional array.
         */


        ThreeDimensionalArray.printThreeDimensionalArray(ThreeDimensionalArray.getDoubleTwoDimensionalArray(3, 3, 3, 1, 5));

        System.out.println();



        /*
        Exercise 5: (1) Demonstrate that multidimensional arrays of nonprimitive types are
        automatically initialized to null.
         */

        System.out.println(Arrays.toString(NonPrimitiveArray.array));

        System.out.println();

        /*
        Exercise 6: (1) Write a method that takes two int arguments, indicating the two sizes of
        a 2-D array. The method should create and fill a 2-D array of BerylliumSphere according
        to the size arguments.
         */

        TwoDimensionalArray.printTwoDimensionalArray(TwoDimensionalArrayBS.getTwoDimensionalArrayBS(3, 3));

        System.out.println();

        /*
        Exercise 7: (1) Repeat the previous exercise for a 3-D array.
         */

        ThreeDimensionalArray.printThreeDimensionalArray(ThreeDimensionalArrayBS.getDoubleTwoDimensionalArray(3, 3, 3));

        System.out.println();

        /*
        Exercise 8: (1) Demonstrate the assertions in the previous paragraph.
         */

        Assertions.test();

        /*
        Exercise 9: (3) Create the classes necessary for the Peel<Banana> example and show
        that the compiler doesn’t accept it. Fix the problem using an ArrayList.
         */

        PeelBanana peelBanana = new PeelBanana();
        System.out.println(peelBanana.getBananas());

        System.out.println();


        /*
        Exercise 10: (2) Modify ArrayOfGenerics .Java to use containers instead of arrays.
        Show that you can eliminate the compile-time warnings.


        ************************************IN PACK****************************************
         */


        /*
        Exercise 11: (2) Show that autoboxing doesn’t work with arrays.


        **************************IN PACK*****************************
         */


        /*
        Exercise 12: (1) Create an initialized array of double using CountingGenerator. Print
        the results.
         */

        Ex12.start();

        System.out.println();

        /*
        Exercise 13: (2) Fill a String using CountingGenerator.Character.
         */

        Ex13.start();

        System.out.println();

        /*
        Exercise 14: (6) Create an array of each primitive type, then fill each array by using
        CountingGenerator. Print each array.
         */

        ArraysOfPrimitives.printArrays();

        System.out.println();

        /*
        Exercise 15: (2) Modify ContainerComparison.java by creating a Generator for
        BerylliumSphere, and change main( ) to use that Generator with Generated.array().
         */

        ContainerComparison.start();

        System.out.println();

        /*
        Exercise 16: (3) Starting with CountingGenerator.java, create a SkipGenerator
        class that produces new values by incrementing according to a constructor argument. Modify
        TestArrayGeneration.java to show that your new class works correctly.
         */
        System.out.println("-----------------------------------------------------");

        TestArrayGeneration.start();

        System.out.println("-----------------------------------------------------");

        System.out.println();



        /*
        Exercise 17: (5) Create and test a Generator for BigDecimal, and ensure that it works
        with the Generated methods.
         */

        System.out.println("-----------------------------------------------------");

        Test.test();

        System.out.println("-----------------------------------------------------");

        System.out.println();


        /*
        Exercise 18: (3) Create and fill an array of BerylliumSphere. Copy this array to a new
        array and show that it’s a shallow copy.
         */


        CopiedArray.test();

        System.out.println();


        /*
        Exercise 19: (2) Create a class with an int field that’s initialized from a constructor
        argument. Create two arrays of these objects, using identical initialization values for each
        array, and show that Arrays.equals( ) says that they are unequal. Add an equals( )
        method to your class to fix the problem.
         */

        int size = 5;

        EqualsArrays[] equalsArrays1 = new EqualsArrays[size];
        EqualsArrays[] equalsArrays2 = new EqualsArrays[size];

        for (int i = 0; i < size; i++) {
            equalsArrays1[i] = new EqualsArrays(1);
            equalsArrays2[i] = new EqualsArrays(1);
        }

        EqualsArrays.test(equalsArrays1, equalsArrays2);

        System.out.println();

        /*
        Exercise 20: (4) Demonstrate deepEquals( ) for multidimensional arrays.
         */

        DeepEquals.start();

        System.out.println();

        /*
        Exercise 21: (3) Try to sort an array of the objects in Exercise 18. Implement
        Comparable to fix the problem. Now create a Comparator to sort the objects into reverse
        order.
         */

        BerylliumSphere[] spheres = new BerylliumSphere[5];
        for (int i = 0; i < spheres.length; i++) {
            spheres[i] = new BerylliumSphere();
        }


        CBerylliumSphere[] cBerylliumSpheres = new CBerylliumSphere[5];

        for (int i = 0; i < cBerylliumSpheres.length; i++) {
            cBerylliumSpheres[i] = new CBerylliumSphere();
        }


        System.out.println("Original: ");
        System.out.println(Arrays.toString(cBerylliumSpheres));

        Arrays.sort(cBerylliumSpheres);

        System.out.println("Sorted: ");
        System.out.println(Arrays.toString(cBerylliumSpheres));

        Arrays.sort(cBerylliumSpheres, new CBerylliumSphereComparator());
        System.out.println("Reverse: ");

        System.out.println(Arrays.toString(cBerylliumSpheres));


        System.out.println();

        /*
        Exercise 22: (2) Show that the results of performing a binarySearch( ) on an unsorted
        array are unpredictable.
         */


        BSearchArray.start();

        System.out.println();


        /*
        Exercise 23: (2) Create an array of Integer, fill it with random int values (using
        autoboxing), and sort it into reverse order using a Comparator.
         */

        ReversedIntegers.start(10);

        System.out.println();

        /*
        Exercise 24: (3) Show that the class from Exercise 19 can be searched.
         */


        EqualsArrays[] equalsArrays = new EqualsArrays[]{new EqualsArrays(1),
                new EqualsArrays(2), new EqualsArrays(3)};

        Arrays.sort(equalsArrays);

        System.out.println(Arrays.toString(equalsArrays));
        System.out.println(Arrays.binarySearch(equalsArrays, equalsArrays[1]));


    }
}
