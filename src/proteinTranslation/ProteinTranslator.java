package proteinTranslation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProteinTranslator {
    private ArrayList<String> polypeptide;
    public ProteinTranslator() {
    }
    private String acid(String codon){
        List<String> Methionine = Arrays.asList("AUG");
        List<String> Phenylalanine = Arrays.asList("UUU", "UUC");
        List<String> Leucine = Arrays.asList("UUA", "UUG");
        List<String> Serine = Arrays.asList("UCU", "UCC", "UCA", "UCG");
        List<String> Tyrosine = Arrays.asList("UAU", "UAC");
        List<String> Cysteine = Arrays.asList("UGU", "UGC");
        List<String> Tryptophan = Arrays.asList("UGG");
        if(Methionine.contains(codon)) return "Methionine";
        if(Phenylalanine.contains(codon)) return "Phenylalanine";
        if(Leucine.contains(codon)) return "Leucine";
        if(Serine.contains(codon)) return "Serine";
        if(Tyrosine.contains(codon)) return "Tyrosine";
        if(Cysteine.contains(codon)) return "Cysteine";
        if(Tryptophan.contains(codon)) return "Tryptophan";
        return "";
    }

    public ArrayList<String> translate(String RNA){
        polypeptide = new ArrayList<String>();
        List<String> stop = Arrays.asList("UAA", "UAG", "UGA");

        for (int i = 0; i < RNA.length(); i+=3) {
            if(stop.contains(RNA.substring(i,i+3))) break;
            polypeptide.add(acid(RNA.substring(i,i+3)));
        }
        return polypeptide;
    }
}
