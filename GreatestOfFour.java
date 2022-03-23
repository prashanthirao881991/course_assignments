public class GreatestOfFour {
    public static void main(String[] args) {
        //Assignment: Finding Greatest Number Among Given 4 Numbers
        int value1 = 600;
        int value2 = 800;
        int value3 = 800;
        int value4 = 400;

        if (value1 >= value2 && value1 >= value3 && value1 >= value4) {
            System.out.println("Number value1: " + value1 + " is the greatest!");
        } else if (value2 >= value3 && value2 >= value4) {
            System.out.println("Number value2: " + value2 + " is the greatest!");
        } else if (value3 >= value4) {
            System.out.println("Number value3: " + value3 + " is the greatest!");
        } else {
            System.out.println("Number value4: " + value4 + " is the greatest!");
        }
    }
}
