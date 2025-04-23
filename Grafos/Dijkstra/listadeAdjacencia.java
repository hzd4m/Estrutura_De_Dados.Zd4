import java.util.*


public class lista{
    public static void main(String[] args){
        int N = 3;

        List<Integer>[] listaAdj = new ArrayList[N]; 


        for(int i = 0 ; i < N ; i++){
            listaAdj[i] = new ArrayList<>();
        }
        

        listaAdj[0].add(1);
        listaAdj[1].add(0);

        listaAdj[0].add(2);
        listaAdj[2].add(0);

        listaAdj[1].add(2);
        listaAdj[2].add(1);

        
        for (int i = 0; i < N; i++) {
            System.out.println("Vértice " + i + ": " + listaAdj[i]);
        }


    }
}