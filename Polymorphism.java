class Opt{
  public int sum(int a, int b ){
    return a+b;
  }
  public double sum(double a, double b){
    return a+b;
  }


}
class Polymorphism{
  public static void main(String[] args) {
    Opt o = new Opt();
    System.out.println("\n"+o.sum(2.3,2.4));
  }
}