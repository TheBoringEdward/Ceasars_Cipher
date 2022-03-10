import java.util.Scanner;

public class Mains {

    //private final int[] count = new int[26]; //no documentation

    Mains() {

        Scanner scn2 = new Scanner(System.in);

        System.out.print("""


                 Ceasar's Cypher
                 This is a tool for en- and decrypting text with the famous "Ceasar's Cypher".
                 In order to use this tool properly you must take attention to the following:
                 -Only use the standard latin letters "a" to "z". If you use anything but, the program will crash. I'm not intending to work on a fix.
                 -Only use lowercase letters
                 -Do NOT use spaces
                 -Pray to God that the program will run properly
                 -Avoid using a key which is a multiple of 26
                \s
                 In order to decipher Text.
                 -Enter the key with a minus character up front,
                 -Enter encrypted key.
                 -Observe magic.""");


        System.out.print("\n\n Enter Key: \n");
        //Amount to shift letters
        int key = scn2.nextInt();
        System.out.print("\n Enter Text to process: \n");
        //Plain text
        String plain = scn2.nextLine();
        plain = scn2.nextLine();
        System.out.print("\n Key: " + key + " (Mod: "+ key % 26 +") ; Text to be en-/decrypted: " + plain);

        //Encrypted text
        StringBuilder encrpt = new StringBuilder(); //Needed, so that the program doesn't output "null" at the beginning of the cypher.

        for (int i = 0; i < plain.length(); i++) {
            char c = plain.charAt(i);
            key = key % 26;
            c = (char) (c + key);
            if (c - 'z' > 0) {
                c = (char) (c - 26);
            }
            if (c - 'a' < 0) {
                c = (char) (c + 26);
            }
            encrpt.append(c);
        }
        System.out.print("\n\n Encrypted text: " + encrpt);

        //TODO: Make this a function.
    }

        /*
        The first task called to turn Umlaute into their written version ("ä" to "ae" and so on...)
        However I'm not willing to do so because I'm a lazy fuck.
        I'll mitigate this issue by prompting the user to simply only enter the letters "a" to "z"
        The second task calls for a for-loop which turns each letter from the "plain" string into
        into a char "c". This char is then to be encrypted using the method "encrypt()"
        This char is then to be added to the String "encrpt"
        inside of that loop:
        encrpt += Character.toString( encrypt(c));
        */

    /*
    For personal reference:
     Integer.parseInt(); //Grab Int from String
     Character.toString(); //Name explains it
    */

        /*
        If it is not a letter, just leave it as is
        If it is a minuscule, transform it into a majuscule
        If it is a majuscule use count[c-'A']++; to count it
        Now shift it by "key" positions to the right in the alphabet

        Remnant of the JFrame stuff.
        */

    /*
    private void statistics() {  //Don't know the purpose of this. I assume it is a remnant of Wiele's JFrame debauchery.
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            System.out.print("\n\n " + Character.toString('a' + i) + " : " + count[i]);
            sum += count[i];
        }
        System.out.print("\n\n Altogether " + sum + " letters.\n\n");
    }
     */

    public static void main(String[] args) {
        Mains e = new Mains();
        System.out.print("\n ======= This code has been provided by TheBoringEdward =======");
    }
}
