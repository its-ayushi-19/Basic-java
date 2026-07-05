 class animal {
    public void animalsound() {
        System.out.println("The animal makes a sound");
     }
    }
     class pig extends animal {
        public void animalsound() {
          System.out.println("The pig says: wee wee");
        }
      }
      
      class dog extends animal {
        public void animalsound() {
          System.out.println("The dog says: bow wow");
        }
      }
      

        
public class Main{
      public static void main(String[] args) {
          animal myAnimal = new animal();  // Create an animal object
          animal myDog = new dog();  // Create a dog object
          animal mypig = new pig();  // Create a pig object

          myAnimal.animalsound();
          mypig.animalsound();
          myDog.animalsound();
        }
      }
      
    

