import java.util.Scanner;

public class Mains {

    private String plain;   //Plain text
    private String encrpt;  //Encrypted text
    private int key = 1;    //Amount to shift letters
    private int[] count = new int[26]; //no documentation

    Mains(){

        Scanner scn2 = new Scanner(System.in);

        System.out.print("\n\n Ceasar's Cypher" +
                "\n This is a tool for en- and decrypting text with the famous \"Ceasar's Cypher\"." +
                "\n In order to use this tool properly you must take attention to the following:" +
                "\n -Only use the standard latin letters \"a\" to \"z\". If you use anything but, the program will crash. I'm not intending to work on a fix." +
                "\n -Only use lowercase letters" +
                "\n -Pray to God that the program will run properly" +
                "\n -Avoid using a key which is a multiple of 26");

        System.out.print("\n\n Enter Key: \n");
        key = scn2.nextInt();
        System.out.print("\n\n Enter Text to process: \n");
        plain = scn2.nextLine();
        plain = scn2.nextLine();
        System.out.print("\n\n Key: "+key+" ; Text to be cyphered: "+plain);

        //The first task called to turn Umlaute into their written version ("ä" to "ae" and so on...)
        //However I'm not willing to do so because I'm a lazy fuck.
        //I'll mitigate this issue by prompting the user to simply only enter the letters "a" to "z"

        //The second task calls for a for-loop which turns each letter from the "plain" string into
        //into a char "c". This char is then to be encrypted using the method "encrypt()"
        //This char is then to be added to the String "encrpt"
        //inside of that loop:
        //encrpt += Character.toString( encrypt(c));

        encrpt = ""; //Needed, so that the program doesn't output "null" at the beginning of the cypher.

        for (int i = 0; i < plain.length(); i++){
            char c = plain.charAt(i);
            c = (char)(c + key);
            encrpt = encrpt + Character.toString(c);
        }

        System.out.print("\n\n "+encrpt);

    }

    //For personal reference:
    // Integer.parseInt();
    // Character.toString();

    private char encrypt(char c){
        //If it is not a letter, just leave it as is
        //If it is a minuscule, transform it into a majuscule
        //If it is a majuscule use count[c-'A']++; to count it
        //Now shift it by "key" positions to the right in the alphabet

        return c;
    }

    private void statistics(){
        int sum = 0;
        for (int i=0; i<26; i++){
            System.out.print("\n\n "+Character.toString('a'+i)+" : "+ count[i]);
            sum += count[i];
        }
        System.out.print("\n\n Altogether "+sum+" letters.\n\n");
    }

    public static void main(String[] args){
        Mains e =  new Mains();
        System.out.print("\n ======= This code has been provided by TheBoringEdward =======");
    }
}
