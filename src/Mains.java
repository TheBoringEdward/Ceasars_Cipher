import java.util.Scanner;

public class Mains {

    //private final int[] count = new int[26]; //no documentation

    Mains() {

        Scanner scn2 = new Scanner(System.in);

        System.out.print("""


                 Caesar's Cipher
                 This is a tool for en- and decrypting text with the famous "Ceasar's Cypher".
                 In order to use this tool properly you must take attention to the following:
                 -Only use latin letters "a" to "z" or Umlaute.
                 -Only use lowercase letters
                 -Avoid using a key which is a multiple of 26 or your text will look the same
                 -Pray to your local deity that the program will run properly""");


        System.out.print("\n\n Enter Key: \n");
        int key = scn2.nextInt();
        System.out.print("\n Enter Text to be processed: \n");
        //Plain text
        String plain = scn2.nextLine();
        plain = scn2.nextLine();
        System.out.print("\n Key: " + key + " (Mod: "+ key % 26 +") ; Text to be processed: " + plain);

        //Encrypted text
        StringBuilder procc = new StringBuilder();

        for (int i = 0; i < plain.length(); i++) {
            char c = plain.charAt(i);
            key = key % 26;

            if (c == 'ß'){
                c = (char) ('s' + key);
                c = ck(c);
                procc.append(c);
                c = (char) ('s' + key);
                c = ck(c);
                procc.append(c);
            }else if (c == ' '){
                procc.append(c);
            }else if (c == 'ü'){
                c = (char) ('u' + key);
                c = ck(c);
                procc.append(c);
                c = (char) ('e' + key);
                c = ck(c);
                procc.append(c);       //This is terrible.
            }else if (c == 'ö'){
                c = (char) ('o' + key);
                c = ck(c);
                procc.append(c);
                c = (char) ('e' + key);
                c = ck(c);
                procc.append(c);       //This is terrible.
            }else if (c == 'ä'){
                c = (char) ('a' + key);
                c = ck(c);
                procc.append(c);
                c = (char) ('e' + key);
                c = ck(c);
                procc.append(c);       //This is terrible.
            }else {
                c = (char) (c + key);
                c = ck(c);
                procc.append(c);
            }
        }
        System.out.print("\n\n Encrypted text: " + procc);

        procc.setLength(0);

        for (int i = 0; i < plain.length(); i++) {
            char c = plain.charAt(i);
            key = key % 26;

            if (c == 'ß'){
                c = (char) ('s' - key);
                c = ck(c);
                procc.append(c);
                c = (char) ('s' - key);
                c = ck(c);
                procc.append(c);
            }else if (c == ' '){
                procc.append(c);
            }else if (c == 'ü'){
                c = (char) ('u' - key);
                c = ck(c);
                procc.append(c);
                c = (char) ('e' - key);
                c = ck(c);
                procc.append(c);       //This is terrible.
            }else if (c == 'ö'){
                c = (char) ('o' - key);
                c = ck(c);
                procc.append(c);
                c = (char) ('e' - key);
                c = ck(c);
                procc.append(c);       //This is terrible.
            }else if (c == 'ä'){
                c = (char) ('a' - key);
                c = ck(c);
                procc.append(c);
                c = (char) ('e' - key);
                c = ck(c);
                procc.append(c);       //This is terrible.
            }else {
                c = (char) (c - key);
                c = ck(c);
                procc.append(c);
            }
        }
        System.out.print("\n\n Decrypted text: " + procc);
    }

    private char ck (char c){
        if (c - 'z' > 0) {
            c = (char) (c - 26);
        }
        if (c - 'a' < 0) {
            c = (char) (c + 26);
        }
        return c;
    }

        /*
        The first task called to turn Umlaute into their written version ("ä" to "ae" and so on...)
        However I'm not willing to do so because I'm a lazy fuck.
        I'll mitigate this issue by prompting the user to simply only enter the letters "a" to "z"

        Edit: Turns out I'm not that lazy.

        The second task calls for a for-loop which turns each letter from the "plain" string into
        into a char "c". This char is then to be encrypted using the method "encrypt()"
        This char is then to be added to the String "encrpt"
        inside of that loop:
        encrpt += Character.toString( encrypt(c));

        Edit: Used the append function instead.
        */

    /*
    For personal reference:
     Integer.parseInt(); //Grab Int from String
     Character.toString(); //Name explains it  //Can be replaced with append, given the situation.
    */

    public static void main(String[] args) {
        Mains e = new Mains();
        System.out.print("\n\n ======= This code has been provided by TheBoringEdward =======");
    }
}
