package UebungEins;

public class RomanNumberTransformer implements NumberTransformer {

    public String transformNumber(int number) {

        if (number < 1 || number  > 3000) {
            return "ERROR";
        }
        String[] röm = {"I", "IV", "V", "IX", "X", "XL", "L", "XC",
                "C", "CD", "D", "CM", "M"};
        int[] germ = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900,
                1000};
        String ret = "";
        for(int i = röm.length -1; i >= 0; i--) {
            while( number >= germ[i]) {
                ret = ret + röm[i];
                number -= germ[i];

            }

        }
        return ret;
    }

    public String getTransformerType() {
        return "Transformer für deutsche Zahlenformatierungen";

    }
}

