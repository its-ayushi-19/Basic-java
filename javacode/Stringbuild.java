public class Stringbuild {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb); // Output: Hello

        //char at 0
        System.out.println(sb.charAt(0)); // Output: H

        //set char at index 
        sb.setCharAt(0, 'a');
        System.out.println(sb); // Output: aello

        //insert function
        sb.insert(1, 'b');
        System.out.println(sb); // Output: abello

        //delete function
        sb.delete(1, 2 );
        System.out.println(sb); // Output: aello

        //append in string
        sb.append(" bro");
        System.out.println(sb);
    }

    
}
