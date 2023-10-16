import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List <String> protein = new ArrayList<>();

        for (int i = 0; i < rnaSequence.length(); i += 3) {
            String codon = rnaSequence.substring(i, i + 3);
            String proteinName = translateCodon(codon);
            if (proteinName == "STOP") {
                break;
            }
            protein.add(proteinName);
        }
        return protein;
    }

    String translateCodon(String codon) {
        switch (codon) {
            case "AUG":
                return "Methionine";
            case "UUU":
            case "UUC":
                return "Phenylalanine";
            case "UUA":
            case "UUG":
                return "Leucine";
            case "UCU":
            case "UCC":
            case "UCA":
            case "UCG":
                return "Serine";
            case "UAU":
            case "UAC":
                return "Tyrosine";
            case "UGU":
            case "UGC":
                return "Cysteine";
            case "UGG":
                return "Tryptophan";
            case "UAA":
            case "UAG":
            case "UGA":
                return "STOP";
            default:
                return null;
        }
    }
    
}

class test {
    public static void main(String[] args) {
        ProteinTranslator proteinTranslator = new ProteinTranslator();
        List<String> protein = proteinTranslator.translate("UAGUGG");
        //System.out.println(proteinTranslator.translateCodon(["AUG", "UUU", "UCU", "UAA", "AUG"]));
        System.out.println(protein);
    }
}