public class LoopsAssignment {
    public static void main(String[] args) {

        //Print odd numbers from 1-100
        int i=1;
        while(i<=100){
            if(i%2 ==1){
                System.out.println("Printing odd number from range 1-100: "+i);
            }
            i++;
        }
        System.out.println("--------------------------------");
        //Print 10-1 using while loop
        int j=10;
        while(j>=1){
            System.out.println(j);
            j--;
        }
        System.out.println("--------------------------------");
        //Print 10-1 using for loop
        for(int k=10;k>=1;k--){
            System.out.println(k);
        }
        System.out.println("--------------------------------");
        //Printing ASCII numbers of a-z and A-Z using int
        char alphabet = 'A';

        while(alphabet<='z'){
            int asciiNum=alphabet;;
            if(asciiNum>96 || asciiNum<91) {
                System.out.println("ASCII value of " + alphabet + " using int is:" + asciiNum);
            }
            alphabet++;
        }

        /*//Printing ASCII numbers of a-z and A-Z using byte
        char alphabet = 'A';

        while(alphabet<='z'){
             byte asciiNum=(byte)alphabet;;
            if(asciiNum>96 || asciiNum<91) {
                System.out.println("ASCII value of " + alphabet + " using byte is:" + asciiNum);
            }
            alphabet++;
        }

        //Printing ASCII numbers of a-z and A-Z using short
        char alphabet = 'A';

        while(alphabet<='z'){
            short asciiNum=(short)alphabet;;
            if(asciiNum>96 || asciiNum<91) {
                System.out.println("ASCII value of " + alphabet + " using short is:" + asciiNum);
            }
            alphabet++;
        }

        //Printing ASCII numbers of a-z and A-Z using long
        char alphabet = 'A';

        while(alphabet<='z'){
            long asciiNum= alphabet;;
            if(asciiNum>96 || asciiNum<91) {
                System.out.println("ASCII value of " + alphabet + " using long is:" + asciiNum);
            }
            alphabet++;
        }*/


    }
}
