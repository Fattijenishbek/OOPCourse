package scrabbleScores;


import java.util.Arrays;


public class Scrabble {
    private String word="";

    public Scrabble(String word) {
        this.word = word;
    }
    private int point(char ch){
        char[] value1 = "aeioulnrst".toCharArray();
        Arrays.sort(value1);
        char[] value2 = "dg".toCharArray();
        char[] value3 = "bcmp".toCharArray();
        char[] value4 = "fhvwy".toCharArray();
        char[] value5 = "k".toCharArray();
        char[] valueun8 = "jx".toCharArray();
        char[] value10 = "qz".toCharArray();
        if(Arrays.binarySearch(value1, ch)>=0) return 1;
        if(Arrays.binarySearch(value2, ch)>=0) return 2;
        if(Arrays.binarySearch(value3, ch)>=0) return 3;
        if(Arrays.binarySearch(value4, ch)>=0) return 4;
        if(Arrays.binarySearch(value5, ch)>=0) return 5;
//        if(Arrays.binarySearch(value8, ch)>=0) return 8;
        if(Arrays.binarySearch(value10, ch)>=0) return 10;
        return 0;
    }
    public int getScore(){
        int score=0;
        for(char i: word.toLowerCase().toCharArray()){
            score+=point(i);
        }
        return score;
    }
}
