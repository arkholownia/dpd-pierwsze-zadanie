public class TryThisWay {

    static String information = "...something went wrong..";

    public static void main(String[] args) {
        returnValue(null);
        returnValue("A04");
        returnValue("null");
    }

    private static void returnValue(String myVar){

        if (myVar == null){
            information = "is OK: " + myVar;
        }

        if (myVar != null){
            myVar = "\""+myVar + "\"";
            information = "is OK: "+ myVar;

         if (myVar.contains("null")){
             information = "has incorrect value: "+ myVar;
         }
        }

        System.out.println("Value " + information );
    }

}
