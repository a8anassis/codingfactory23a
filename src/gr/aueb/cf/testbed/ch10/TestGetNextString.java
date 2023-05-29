package gr.aueb.cf.testbed.ch10;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestGetNextString {

    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] grades = getGrades();
        String firstName;

        firstName = getFirstName();
        System.out.println(firstName);

        in.close();
    }

    public static String getFirstName() throws InputMismatchException {
        String name = null;

        try {
            System.out.println("Give first name");
           //if (in.hasNext()) {
                name = in.next();
           // }
            return name;
        }catch (InputMismatchException e){
            System.out.println("Invalid string");
            throw  e;
        }
    }

    public static  int [] getGrades() throws InputMismatchException {
        int[] grades = new int[2];
        Logger logger = getLogger();
        System.out.println("Please give two grades of two courses ");

        try {
            for (int i = 0 ; i < grades.length ; i++){
                grades[i] = in.nextInt();

                if (grades[i] < 0 || grades[i] > 10) {
                    System.out.println("You didn't give an acceptable grade ");
                    throw new InputMismatchException();
                }
            }
            return  grades;
        } catch (InputMismatchException e){
            logger.severe("Error in grades ");
            throw e;
        }
    }


    public static Logger getLogger(){
        Logger logger = Logger.getLogger("mylogger");
        Handler fileHandler ;
        try {
            fileHandler = new FileHandler("C:/tmp/log.txt" , true);
            fileHandler.setFormatter(new SimpleFormatter());
        }catch (IOException e){
            throw  new RuntimeException(e);
        }
        logger.addHandler(fileHandler);
        return logger ;
    }
}
