class birds{
void hen(){
    System.out.println("chicken");   
}
  
}
 class reptiles extends birds{
    void crowling(){
        System.out.println("snake");
    }
}
 class amphibian extends reptiles{
    void jumping(){
        System.out.println("frog");
    }
 }
 interface mamal{
    void obj();
 }
 class n extends amphibian implements mamal{
public void obj(){
    System.out.println("These are animals");
}
}
public class firstinheritance{
    public static void main(String[] args) {
        amphibian c= new amphibian();
        c.hen();
        c.crowling();
        c.jumping();
        

        

    }
}
        
    

