public class constructorChaining {
    constructorChaining(){
        this(10);
        System.out.println("this is default");
    }

    constructorChaining(int a,int b){
        System.out.println("\n"+(a+b));
    }

    constructorChaining(int x){
        this(2,10);
        System.out.println(x);
    }

    public static void main(String[] args) {
        constructorChaining c  = new constructorChaining();
    }
}
