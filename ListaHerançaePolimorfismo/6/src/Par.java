public class Par<F,S> {
    private F first;
    private S second;
   
    public Par(F x, S y){
    first=x;
    second = y;
    }
    public void setFirst(F x){
    first = x;
    }
    public void setSecond(S x){
    second = x;
    }
    public F getFirst(){
    return first;
    }
    public S getSecond(){
    return second;
    }
    public void printPar(){
    System.out.println("First: "+first+"\nSecond: "+second);
    }
   }
   