package va;

import java.util.ArrayList;
import java.util.List;

public class Compare {
    private Compare() {
        throw new IllegalStateException("Utility class");
    }
    public static void start(List<Docx> inputData) {
        List<Docx> newDocxs = new ArrayList(inputData);
       while (newDocxs.size()>1) {
        Docx currentDoc = newDocxs.remove(0);
        for (Docx docx : newDocxs) {
            if (currentDoc.getshortName().equals(docx.getshortName())) {
                System.out.println("\nstarting comparator for: " + docx.getshortName());
                if (currentDoc.getSegList().size() != docx.getSegList().size()){
                    System.out.println("\nthe file has been modify!");
                }
            }
        }        
       }
    }
}
