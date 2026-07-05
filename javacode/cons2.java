public class cons2 {
    int modelYear;
    String modelName;
    

public cons2(int year, String name){
    modelYear = year;
    modelName = name;

}
public static void main(String[] args){
    cons2 mycar=new cons2(2021,"mustang");
    System.out.println(mycar.modelYear+" "+mycar.modelName);
}
}
