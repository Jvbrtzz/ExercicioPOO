public class App {
    public static void main(String[] args){
        
            Par par1 = new Par<Integer,Double>(1,56.89);
            Par par2 = new Par<Integer,Double>(2,2.2);
            Par par3 = new Par<Integer,Double>(3,3.3);
           
            Par[] arrayPar = new Par[3];
            arrayPar[0]=par1;
            arrayPar[1]=par2;
            arrayPar[2]=par3;
            printArray(arrayPar);
            }
            public static <T extends Par> void printArray(T[] array){
            for(int i=0;i<array.length; i++){
            System.out.println("First: "+array[i].getFirst());
            System.out.println("Second: "+array[i].getSecond());
            }
            }
           
    }

