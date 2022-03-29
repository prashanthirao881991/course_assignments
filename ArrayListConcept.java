import java.util.ArrayList;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList<Character> name = new ArrayList<>();
        ArrayList<Character> reverseName = new ArrayList<>();
        name.add('n');
        name.add('a');
        name.add('v');
        name.add('e');
        name.add('e');
        name.add('n');
        System.out.println("Array List Values: "+name);
        int n=name.size()-1;
        for (char c :name){
            reverseName.add(name.get(n));
            n--;
        }
        System.out.println("Array List Reversed Values: "+reverseName);

    }
}