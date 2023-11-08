 class human{
    void head(){
        System.out.println("Eyes");
        System.out.println("mouth");
        System.out.println("nose");
        
    }
}
class gorilla extends human{
public void legs(){
    System.out.println("cows have four legs");
}
}
class chipanze extends gorilla{
    void torso(){
        System.out.println("breasts");
        System.out.println("shoulder");
        System.out.println("hands");
    }
}
interface bodyparts{
    void feet();
}
class A extends gorilla implements bodyparts{
   public void feet(){
    System.out.println("toes");
    
}
}
public class secondinheritance{
    public static void main(String[] args) {
        chipanze X= new chipanze();
        X.head();
        X.torso();
        //X.feet();
        X.legs();

    }
}
