import java.io.*;
class Bike{
    Bike(){
     System.out.println("this is Bike ");
    }
 }

class activa extends Bike{
     activa(){
         
         System.out.println("this is activa");
     }
 }
 
class Inheritance{
    

    public static void main(String args[]){
        activa a = new activa();
    }
}