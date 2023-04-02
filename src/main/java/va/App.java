package va;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
public class App 
{
    public static void main( String[] args )throws IOException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String report = "";
        report += "Débuté à: "+simpleDateFormat.format(date);
        String filePath = "c:/home/Jaffleman/Documents/banque-docx/";
        System.out.print("Please provide the directory path: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String fPath = br.readLine();
        if (fPath.length()>0) filePath = fPath.endsWith("\\")?fPath:fPath+"\\";


        File dir  = new File(filePath);
        File[] listeOfFiles = dir.listFiles();
        if (listeOfFiles == null){
            report += "\nPathFile error:";
            report += "\nSorry, no usable files in this directory!";
            Finale.end(date, report);
            return;
        }

        System.out.println("\nCreation of the docx Class files...");
        report += "\nDocx file :";
        List <Docx> docxList = new ArrayList<>();
        for(File file : listeOfFiles){
            String fileName = file.getName();
            if(fileName.endsWith(".docx")) docxList.add(new Docx(fileName, filePath));
        }

        
        Compare.start(docxList);
        report += "\nNumber of docx founded: "+docxList.size();
        for (Docx docx : docxList) {
            report += docx.getReport();
        }

        Finale.end(date, report);
    }
}
