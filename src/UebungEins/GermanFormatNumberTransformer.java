package UebungEins;

import java.text.*;

public class GermanFormatNumberTransformer implements NumberTransformer{
    private static DecimalFormat dec = new DecimalFormat("#,###");






    public String transformNumber(int number) {


        if (number < 1 || number  > 3000) {
            return "ERROR";
        }
        DecimalFormatSymbols sym = new DecimalFormatSymbols();
        sym.setGroupingSeparator('.');
        dec.setDecimalFormatSymbols(sym);

        return dec.format(number);





    }
    public String getTransformerType() {
        return ("Transformer für römische Zahlen");

    }


}
