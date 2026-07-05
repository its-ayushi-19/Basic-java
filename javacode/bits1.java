public class bits1 {
    public static void main(String[] args) {
        int n = 5;   //0101
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = n | bitMask;   //set operation 
        System.out.println(newNumber);
    }
    
}
