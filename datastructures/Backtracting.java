package datastructures;

 class Backtracting {
    public static void PrintPermutation(String str, String permutation, int idx){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }  
        for(int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            PrintPermutation(newStr, permutation+currChar, idx+1);
        }
    }

    //time complexity = O(n*n!) 
    public static void main(String[] args) {
        String str = "abc";
        PrintPermutation(str, "", 0);
    }   
    
}
