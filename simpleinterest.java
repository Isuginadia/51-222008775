// calculating simple interest using methods and objects
public class simpleinterest {
    public double calculate(int p,double r, int t){//method
        return p*r*t;
}}
class Main{
    public static void main(String[]args){
            simpleinterest a=new simpleinterest();
            double result=a.calculate(100000,0.05,5);// object a
            System.out.println("the simple interest is" +result);
}}

