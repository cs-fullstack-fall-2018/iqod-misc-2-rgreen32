import java.util.*;


public class Main {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        input = input.toUpperCase();
        Map<Character, Integer> letterCounts = new HashMap<Character, Integer>();



        for(int i = 0; i < input.length(); i++){
            char letter = input.charAt(i);

            if(!letterCounts.containsKey(letter)){
                letterCounts.put(letter, 1);
            }else {
                letterCounts.put(letter, letterCounts.get(letter) + 1);
            }
        }

        for (Character letter: letterCounts.keySet()){
            char key = letter;
            double value = letterCounts.get(letter);
            double percent = (value/input.length())*100;
            System.out.println(key + " is: " + Math.round(percent) + "%" );
        }


    }
}
