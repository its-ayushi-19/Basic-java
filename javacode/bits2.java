public class bits2 {
    public static void main(String[] args) {
        int n = 5;   //0101
        int pos = 2;
        int bitMask = 1 << pos;

        int newNumber = n & (~bitMask);   //clear operation 
        System.out.println(newNumber);  //0001
    }
    
}
