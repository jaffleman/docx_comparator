package va;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class OperatingData {
    private String excelFileName ="20221228_NP_Sopra_FXX-0XX-XX_Données SIRH_FSF_analyse_20230207.xlsx";
    private String SheetName = "Zones_Segments";
    private String filePath = "/home/Jaffleman/Documents/banque-docx/";
    private int variableColumnNumber = 5, resultColumnNumber = -1;
    public boolean newSheetForResult;
    
    public OperatingData() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        // System.out.print("Please provide the directory path: ");
        // String fPath = br.readLine();
        // if (fPath.length()>0) filePath = fPath;

        // System.out.print("Please provide your Excel filename: ");
        // String EFName = br.readLine();
        // if(EFName.length()>0) excelFileName = EFName;

        // System.out.print("Please enter sheet name (if different from: 'Zones_Segments'): ");
        // String SName = br.readLine();
        // if (SName.length()>0) SheetName = SName;
        // Boolean goodAnswer = false;
        // String response="";
        // while (!goodAnswer){
        //     System.out.print("Same sheet for results (yes/no)?");
        //     Pattern pattern = Pattern.compile("Yes|yes|YES|no|No|NO");
        //     response = br.readLine();
        //     goodAnswer = pattern.matcher(response).matches();
        // }
        // Pattern pattern = Pattern.compile("Yes|yes|YES");
        // goodAnswer = pattern.matcher(response).matches();
        // if (goodAnswer) {
        //     System.out.print("Please enter result column : ");
        //     resultColumnNumber = Converter.convertion(br.readLine());
        //     br.close();isr.close();
        // }
        System.out.flush();
    }
    public String getPatn() {return this.filePath;}
    public String getExcelFileName() {return this.excelFileName;}
    public String getSheetName() {return this.SheetName;}
    public int getVariableColumnNumber(){return this.variableColumnNumber;}
    public int getResultColumnNuber(){return this.resultColumnNumber;}
}
