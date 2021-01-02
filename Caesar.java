import java.util.Locale;

public class Caesar {
    private byte shiftKey = 3; // for f(p) = (p+3) mod 26 .

    private static  String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Define the alphabet

    public byte getShiftKey() {

        return shiftKey;
    }

    public Caesar setShiftKey(byte shiftKey) {
        this.shiftKey = shiftKey;
        return this;
    }

    public String encrypt(String plaintext) {
        byte shiftKey = this.getShiftKey();
        StringBuilder ciphertext = new StringBuilder(); // Using StringBuilder for append .

        for (char chr : plaintext.toUpperCase().toCharArray()) { // convert to UpperCase
            if (Character.isDigit(chr)) { // Should give an error if a digit is used .
                System.out.println("Invalid syntax , please use letters");
            } else {

                byte position = (byte) alphabet.indexOf(chr); // Search on the alphabet
                if (chr == ' ') {
                    ciphertext.append(" ");
                } else {
                    ciphertext.append(alphabet.charAt((position + shiftKey) % 26)); // f(p) = (p+3) mod 26
                }
            }
        }
        return ciphertext.toString();

    }


    public String decrypt(String chipertext) {
        byte shiftKey = this.getShiftKey();
        StringBuilder ciphertext = new StringBuilder();

        for (char chr : chipertext.toUpperCase().toCharArray()) {
            if (Character.isDigit(chr)) {
                System.out.println("Invalid syntax , please use letters.");
            } else {

                byte position = (byte) alphabet.indexOf(chr);
                if (chr == ' ') {
                    ciphertext.append(" ");
                } else {

                    ciphertext.append(alphabet.charAt((position - shiftKey) < 0 ? ((position - shiftKey) % 26 + 26) % 26 : (position - shiftKey) % 26));
                    // To recover the original message from a secret message encrypted by the Ceaser cipher , the function f^-1 , the inverse of f , is used.
                    //Note that the function f^-1 send an integer p from  Z26 , to f^-1(p) = (p-3) mod 26 .

                }
            }

        }
        return ciphertext.toString();
    }
}


