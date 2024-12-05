 class basic{
    public int sum(int a,int b){
  return a+b;
    }

    public double sum(double a, double b ){
        return a+b;
    }
 }
 class Polymorphism{
    public static void main(String[] args) {
        basic b = new basic();
        System.out.println("\n" + b.sum(2.3, 2.5));
    }
 }