public class CRC_sender {

    public static void appendCRC(StringBuilder code, String divisor) {
        int codeLength = code.length();
        int divisorLength = divisor.length();
        
        StringBuilder temp = new StringBuilder(code.toString());
        
        for (int i = 0; i < divisorLength - 1; i++) {
            temp.append("0"); // Append zeros for padding
        }
        
        for (int i = 0; i < codeLength; i++) { // Change loop condition here
            if (temp.charAt(i) == '1') {
                for (int j = 0; j < divisorLength; j++) {
                    temp.setCharAt(i + j, (temp.charAt(i + j) == divisor.charAt(j)) ? '0' : '1');
                }
            }
        }
        
        code.append(temp.substring(codeLength)); // Append the CRC bits
    }

    public static void main(String[] args) {
        StringBuilder code = new StringBuilder("110101");
        String divisor = "101";

        appendCRC(code, divisor);

        System.out.println("Transmitted code with CRC: " + code.toString());
    }
}
