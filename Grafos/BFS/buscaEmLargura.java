class Aresta{
    int destino;
    int peso;

    public Aresta(int x , int y){
        this.destino = x;
        this.peso = y;

    }

    public class ListaAdj{
        private int n;
        private List<Arestas>[] listaAdj; 

        public ListaAdj(int n){
            this.n = n;
            for(int i = 0 ; i < n ; i++){
                listaAdj[i] = new ArrayList<>();
            }
        }

        public void buscaLargura(int origem){
            boolean[] visitados = new boolean[n];
            int[] distancia = new int[n]; 

            for(int i = 0 ; i < n ; i++){
                distancia[i] = -1;
            }

            Queue<Integer> fila = new LinkedList<Integer>();

            fila.add(origem);

            visitado[origem] = true;
            distancia[origem] = 0; 

            System.out.println("A sequência da BSF é : ");
            while(fila.size() > 0) {
                int atual = fila.poll();
                System.out.println(atual + " ");

                for(int i = 0 ; i < listaAdj[atual].size(); i++){
                    int vizinho = listaAdj[atual].get(i).destino;
                    if(!visitados[vizinho]{
                        fila.add(vizinho);
                        visitado[vizinho] = true;
                        distancia[vizinho] = distancia[atual] + 1;
                    })
                }
            }
            System.out.println("\nDistâncias:");
            for(int i = 0 ; i < n ; i++){
                System.out.println("Vértice " + i + ":" + distancia[i]);
            }
        }
    }


}