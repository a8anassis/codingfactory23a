package gr.aueb.cf.ch4;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 * Ο frog βρίσκεται στη θέση X και θέλει να φτάσει στη
 * θέση Y (ή σε θέση > Υ). Ο frog jumps a fixed distance, D.
 *
 * Βρίσκει τον ελάχιστο αριθμό jumps που ο small from πρέπει'
 * να κάνει ώστε να φτάσει (ή να ξεπεράσει) τον στόχο.
 *
 * Για παράδειγμα, αν έχουμε:
 * X = 10
 * Y = 85
 * D = 30,
 *
 * τότε ο small frog θα χρειαστεί 3 jumps, γιατί:
 * Starts at 10, και μετά to 1o jump πάει στη θέση 10 + 30 = 40
 * Στο 2ο jump, πάει 40 + 30 = 70
 * Και στο 3ο jump, πάει 70 + 30 = 100
 */
public class FrogApp {

    public static void main(String[] args) {
        int jumps = 0;
        int x = 10;
        int y = 85;
        int jmp = 30;

        jumps = (int) Math.ceil((y - x) / (double) jmp);

        System.out.println("Jumps: " + jumps);
    }
}
