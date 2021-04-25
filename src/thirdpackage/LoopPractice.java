package thirdpackage;

public class LoopPractice {

    // write psvm and you will have the option to create the line bellow
    public static void main(String[] args) {

        // sout for the print line
        // java print me i love java 10 times
        // start counting from 0
        // keep counting till 9
        // increment the number every time (i++) and decrement -->(i--)
        // for every time print i love java

        // for loop --> increment
        // keyword(starting point; ending point; increment) { --> body starts
        // body
        //} --> bopdy ends
        // for(int i=0; i<5; i++){
        //   System.out.println("i love java "+i);
        // }

        // for(int i=5; i>0; i--){
        //   System.out.println("i love python "+i);
        // }

        //for(int i=0; i>-5; i--){
        //  System.out.println("i love selenium "+i);
        //}


        // System.out.println("i love java");
        //System.out.println("i love java");


        //print java 10 times
        // form each time of java, print selenium 2 times

        for (int i = 0; i < 5; i++) {
            System.out.println("i love java " + i);
            System.out.println("i love selenium " + i);
            System.out.println("i love selenium " + i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("java " + i);
            for (int j = 0; j < 2; j++) {
                System.out.println("selenium " + j);
            }
        }

        // conditional for loop
        // count till 10, if the number is 5, print java, if the number is 6 print selenium
        // for the rest, print python

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("java");
            } else if (i == 6) {
                System.out.println("selenium");
            } else {
                System.out.println("python");
            }
        }
        //compare 2 strings using if else
        String country = "USA";
    }

}
