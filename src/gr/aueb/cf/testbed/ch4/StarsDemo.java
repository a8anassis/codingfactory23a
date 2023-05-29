package gr.aueb.cf.testbed.ch4;

public class StarsDemo {

    public static void main(String[] args) {
        // Ascending Stars
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Descending
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = 0; i < 10; i++){
            // Second loop handles the horizontal part
            // It makes sure that the line has the correct amount of stars
            // it slowly decreases until it only prints 1 star
            for(int j = 10 - 1; j > i; j--){
                System.out.print("*");
            }
            System.out.println("*");
        }

        for(int j = 10 - 1; j > 0; j--){
            System.out.print("*");
        }
    }
}
