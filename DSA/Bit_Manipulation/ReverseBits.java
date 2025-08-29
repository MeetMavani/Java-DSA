package DSA.Bit_Manipulation;

public class ReverseBits {
    
    public static void main(String[] args) {
        int n = 43261596;
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1;
            ans = ans | (bit << (31 - i));
        }

    }
}
