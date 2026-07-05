public class statickey {
    static void mystaticmethod(){
        System.out.println("this is a static method");
    
    }
    public static void main(String args[]){
        mystaticmethod();
        statickey.mystaticmethod();
    }
    
}
