public class occurence {
    public static int first= -1;
    public static int last= -1;

    public static void findOccurence(String str, char element, int idx){
        if(idx==str.length()){
            System.out.println("first occurence at index "+first);
            System.out.println("last occurence at index "+last);
            return;
        }


        char currentchar = str.charAt(idx);
        if(currentchar==element){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        findOccurence(str, element, idx+1);
    }
        public static void main(String[] args) {
            String str="abaabbbbsbabb";
            char element='b';
            findOccurence(str, element, 0);
    
    }
}
