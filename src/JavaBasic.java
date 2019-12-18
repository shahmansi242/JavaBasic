public class JavaBasic {

        // Main method
    public static void main(String[] args){

           // static variable
        String word1 = "There";
        String word2 = "England";
        String word3 = "Orange";


          // substring method
        word1 = word1.substring(2, 3);
        word2 = word2.substring(3, 4);
        word3 = word3.substring(2, 4);
        System.out.println(word1);       // declared substring variable
        System.out.println(word2);       // declared substring variable
        System.out.println(word3);        // declared substring variable


        //Remove all occurrences of character "c" from string
        String samplestring = "This is very easy programme";
        samplestring = samplestring.replaceAll("s", "");
        System.out.println(samplestring);     // declared the string without occurrences character

        //Find out length of string
        String str = "This is very easy programme";
        System.out.println(str.length());    // declared the length of string

        //Remove space from string
        String str1 = "This is very easy programme";
        str = str1.replaceAll("\\s", "");
        System.out.println(str);     // declares the string without space

        //Extract special characters from string ($,£,@)
        String samplestring2 = "This $300 is equivalent of £200 but not for @100";
        samplestring2 = samplestring2.replaceAll("[a-zA-Z0-9\\s+]", "");
        System.out.println(samplestring2);       // declared the extract characters from string ($,£,@)

        //Extract number from string
        String str2 = "The cost of iphone is £1250";
        str2 = str2.replaceAll("\\D+", "");
        System.out.println(str2);    // declared the number from string


        //Convert int to double number
        int i = 450;
        Double d1 = Double.valueOf(i);
        System.out.println(d1);     // declared int to number


        //Convert string to integer
        String number = "125";
        int result = Integer.parseInt(number);
        System.out.println(result);     //declared string to integer


        //Double number to string
        Double d = 123.45;
        String str4 = String.valueOf(d);
        System.out.println(str4);     // declared double number to string


        //Convert string to double
        String a = "560.25";
        double b = Double.parseDouble(a);
        System.out.println(b);      // declared string to double


        //Ans in decimal points
        double c = 1;
        double f = 3;
        double d2 = (c/f);
        System.out.println(d2);     // declared and in decimals


        //Replace currency symbol from $ to £ in string
        String str3 = "$250.00";
        str3 = str3.replace("$", "£");
        System.out.println(str3);     // replace symbol $ To £ in string

    }
}