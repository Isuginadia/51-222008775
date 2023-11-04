// a program to find compund interest using methods and objects
public class compoundinterest {
    public double futurevalue(int p, double r, int t, int n){
                return p* (Math.pow((1 + r/1200), n*t));
            }}
        class Main{
            public static void main(String[] args){
                compoundinterest a= new compoundinterest();
                double result=a.futurevalue(500000,18,3,12);
                System.out.println("the compound interest at the end of 3 years is" + result);
        }}
        
    

