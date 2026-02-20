import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        
        BigInteger p1 = new BigInteger(num1);
        BigInteger p2 = new BigInteger(num2);

        return p1.multiply(p2).toString();
    }
}