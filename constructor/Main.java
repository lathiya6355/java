public class Main {
    // int x = 5;

    // public Main() {
    //     x = 5;    
    // }
    // public static void main (String[] args){
    //     Main myObj = new Main();
    //     Main myObj1 = new Main();
    //     System.out.println(myObj.x);
    //     System.out.println(myObj1.x);
    // }
// ===============================================
    // int x;
    // public Main(int y) {
    //     x = y;
    // }
    // public static void main (String[] args){
    //     Main myObj = new Main(1);
    //     System.out.println(myObj.x);
    // }
//  ==============================================

int modelYear;
String modelName;
    public Main(int year, String name) {
        modelYear = year;
        modelName = name;
    }
    public static void main (String[] args){
        Main myCar = new Main(1920,"mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}