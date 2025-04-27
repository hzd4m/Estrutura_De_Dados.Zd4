import java.util.*;
class Aresta{
    int destino;
    int peso;

    public Aresta(int x , int y){
        this.destino = x ;
        this.peso = y;
    }

    public String toString() {
        return "(" + x + ", peso=" + y + ")";
    }
}


public class ListadeAdjacencia{
    private int n;
    private List<Aresta>[] listaAdj;

    public ListadeAdjacencia(int x){
        this.n = x;
        this.listaAdj = new ArrayList[x];
        for(int i = 0 ; i < x ; i++){
            listaAdj[i] = new ArrayList<Aresta>();
        }
    }


   public void adicionaAresta(int x , int y , int p){
    if(x < 0 || x >= n || y < 0 || y >= n) {
            System.out.println("Vértices inválidos!");
            return;
    }
    boolean existe = false;
    for(int i = 0 ; i < listaAdj[x].size() ; i++){
        if(listaAdj[x].get(i).destino == y){
            existe = true;
            break;
        }
    }

    if(!existe){
        listaAdj[x].add(new Aresta(y,p));
    }

    existe = false;
    for(int i = 0 ; i < listaAdj[y].size() ; i++){
        if(listaAdj[y].get(i).destino == x){
            existe = true;
            break;
        }
    }

    if(!existe){
        listaAdj[y].add(new Aresta(x,p));
    }
   } 


   public void removeAresta(int x, int y){
    for(int i = 0 ; i < listaAdj[x].size() ; i++){
        if(listaAdj[x].get(i).destino == y){
            listaAdj[x].remove(i);
            break;
        }
    }

    for(int i = 0 ; i < listaAdj[y].size() ; i++){
        if(listaAdj[y].get(i).destino == x){
            listaAdj[y].remove(i);
            break;
        }
    }

   }
   public int quantidadeArestas(){
    int total = 0;
    for(int i = 0 ; i < n ; i++){
       total += listaAdj[i].size();  
    }

    return total/2;
   }

   public int somadosGraus(){
    int total = 0;
    for(int i = 0 ; i < n ; i++){
        total += listaAdj[i].size();
    }

    return total;
   }

   public boolean existeAresta(int x , int y){
    if(x < 0 || x >= n || y < 0 || y >= n) {
            System.out.println("Vértices inválidos!");
            return false;
        }
    for(int i = 0 ; i < listaAdj[x].size() ; i++){
        if(listaAdj[x].get(i).destino == y){
            return true;
        }
    }
    return false;    
   }

   public void imprimeVizinho(int x){
    if(x < 0 || x >= n) {
            System.out.println("Vértice inválido!");
            return;
        }

    System.out.println("Os vizinhos de " + x + " são: ");
    for(int i = 0 ; i < listaAdj[x].size() ; i++){
        Aresta a = listaAdj[x].get(i);
        System.out.println(a.destino + "(peso =" + a.peso + ") ");
    }
    System.out.println();
}

public void buscaLargura(int origem){
    boolean[] visitados = new boolean[n];
    int[] distancia = new distancia[n]; 

    for(int i = 0 ; i < n ; i++){
        distancia[i] = -1;
    }

    Queue<Integer>[] fila = new LinkedList<Integer>(); 

    fila.add(origem);

    visitado[origem] = true; 
    distancia[origem] = 0; 

    System.out.println("A sequência da BSF é: ");
    
    while(fila.size() > 0){
        int atual = fila.poll(); 
        System.out.println
        if(fila.size > 0 )

    }
}