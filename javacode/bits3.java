public class bits3 {
    public static void main(String[] args) {
        int n = 5;   //0101
        int pos = 3;
        int bitMask = 1 << pos;

        int newNumber = n ^ bitMask;   //update  operation 
        System.out.println(newNumber);  //1101
    }
    
}
