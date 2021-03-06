package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    int value = 3;
	    if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

	    int switchValue = 3;

	    switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
	    }
	    // switch se utiliza normalmente cuando queremos probar la misma
        // variable y deseamos probar diferentes valores para dicha variable.

        // Exercise:
        // Create a new switch statement using char instead of int.
        // Create a new char variable.
        // Create a switch statement testing for
        // A, B, C, D, or E
        // Display a message if any of these are found and then break
        // Add a default which displays a message saying not found.

        char charValue = 'D';

        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            case 'D':
                System.out.println("D was found");
                break;
            case 'E':
                System.out.println("E was found");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
