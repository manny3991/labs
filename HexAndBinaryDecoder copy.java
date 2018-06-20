import java.util.Scanner;

public class HexAndBinaryDecoder {
//comments
    public static long hexStringDecode(String hex) {
        char carIndex;
        int length = hex.length() - 1;
        int counter = 0;
        long sum = 0;
        carIndex = hex.charAt(length);
        while (carIndex != 120) {
            if (carIndex >= 48 && carIndex <= 57) {//comments
                carIndex -= 48;
            } else if (carIndex >= 65 && carIndex <= 70) {
                carIndex -= 55;
            } else if (carIndex >= 97 && carIndex <= 102) {
                carIndex -= 87;
            }
            sum += carIndex * Math.pow(16, counter);
            counter += 1;
            if (length == 0) {
                break;
            }
            length--;
            carIndex = hex.charAt(length);// comments
        }
        return sum;
    }

    public static short hexCharDecode(char hexChar) //Decode single character
    {
        int sum = hexChar - 48;
        return (short) sum;


    }

    public static long binaryStringDecode(String bin) {
        char binIndex;
        int length = bin.length() - 1;
        int counter = 0;
        long sum = 0;
        binIndex = bin.charAt(length);
        while (binIndex != 98) {
            binIndex -= 48;
            sum += binIndex * Math.pow(2, counter);
            counter += 1;
            if (length == 0) {
                break;
            }
            length--;
            binIndex = bin.charAt(length);
        }
        return sum;
    }

    public static void main(String args[]) {
        String hexIn;
        String binIn;
        String charIn;
        //String bin;
        Scanner scnr = new Scanner(System.in);
        //public static long binaryStringDecode(String bin) //Decode binary string
        //public static String binaryToHex(String bin) //Optional
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Decode a hex string.");
            System.out.println("2. Decode a binary string.");
            System.out.println("3. Convert binary to hex.");
            System.out.println("4. Quit.");

            int choice = scnr.nextInt();

            if (choice == 1) {
                System.out.println("Please enter the hex string: ");
                hexIn = scnr.next();
                System.out.println("Result:" + hexStringDecode(hexIn));
            } else if (choice == 2) {
                System.out.println("Please enter the binary string: ");
                binIn = scnr.next();
                System.out.println("Result:" + binaryStringDecode(binIn));
            } else if (choice == 3) {
                //System.out.println("Please enter the binary string");
                //charIn = scnr.next();
                //System.out.println("Result:" + hexCharDecode(charIn));

            } else if (choice == 4) {
                System.out.println("Quitting program.");
                System.exit(0);
            }

        }
    }
}

