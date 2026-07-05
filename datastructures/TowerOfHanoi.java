package datastructures;

public class TowerOfHanoi {
    public static void towerofhanoi(int n, char src, char helper, char dest){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return; 
        }
        towerofhanoi(n-1, src , dest, helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        towerofhanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n=5;
        towerofhanoi(n, 'S', 'H', 'D');
    }   
    
}
