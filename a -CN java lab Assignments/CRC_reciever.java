public class CRC {

    public static boolean checkCRC(String code, String divisor) {
        int codeLength = code.length();
        int divisorLength = divisor.length();
        
        char[] temp = code.toCharArray();
        
        for (int i = 0; i <= codeLength - divisorLength; i++) {
            if (temp[i] == '1') {
                for (int j = 0; j < divisorLength; j++) {
                    temp[i + j] = (temp[i + j] == divisor.charAt(j)) ? '0' : '1';
                }
            }
        }
        
        for (int i = codeLength - divisorLength + 1; i < codeLength; i++) {
            if (temp[i] == '1') {
                return false; // Remainder is non-zero, error detected
            }
        }
        
        return true; // Remainder is zero, data is correct
    }

    public static void main(String[] args) {
        String code = "1110001010";
        String divisor = "101";

        if (checkCRC(code, divisor)) {
            System.out.println("CRC check passed! Data is valid.");
        } else {
            System.out.println("CRC check failed! Data might be corrupted.");
        }
    }
}
