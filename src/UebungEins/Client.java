public class Client extends RomanNumberTransformer {
    public static void main(String[] args){

       Client c = new Client();
     c.printTransformation(1008);
    }

    public void printTransformation(int number) {
        String result = "" + super.transformNumber(number); // Hier fehlt noch was
        System.out.println("Die römische Schreibweise der Zahl " + number + " ist: " + result);
    }
    //raphael sit coll
}