import java.util.*;

public class ListadeAdjacencia {
    private int n;
    private List<Integer>[] listaAdj;

    
    public ListadeAdjacencia(int x){
        this.n = x;
        this.listaAdj = new ArrayList[x];
        for(int i = 0 ; i < x ; i++){
            listaAdj[i] = new ArrayList<>();
        }
    }

    
    public void adicionaAresta(int x, int y){
        if(x < 0 || x >= n || y < 0 || y >= n) {
            System.out.println("Vértices inválidos!");
            return;
        }
        if(!listaAdj[x].contains(y)){
            listaAdj[x].add(y);
        }
        if(!listaAdj[y].contains(x)){
            listaAdj[y].add(x);
        }
    }

    
    public void removeVertice(int x){
        if(x < 0 || x >= n) {
            System.out.println("Vértice inválido!");
            return;
        }
        for(int i = 0 ; i < n ; i++){
            listaAdj[i].remove(Integer.valueOf(x));
        }
        listaAdj[x].clear();
    }

    
    public int quantidadeArestas(){
        int soma = 0;
        for(int i = 0 ; i < n ; i++){
            soma += listaAdj[i].size();
        }
        return soma/2;
    }

    
    public int somadosGraus(){
        int soma = 0;
        for(int i = 0 ; i < n ; i++){
            soma += listaAdj[i].size();
        }
        return soma;
    }

    
    public boolean existeAresta(int x, int y){
        if(x < 0 || x >= n || y < 0 || y >= n) {
            System.out.println("Vértices inválidos!");
            return false;
        }
        return listaAdj[x].contains(y);
    }

    
    public void imprimeVizinho(int x){
        if(x < 0 || x >= n) {
            System.out.println("Vértice inválido!");
            return;
        }
        System.out.print("Os vizinhos de " + x + ": ");
        for(int i = 0 ; i < listaAdj[x].size() ; i++ ){
            int v = listaAdj[x].get(i);
            System.out.print(v + " ");
        }
        System.out.println();
    }

    
    public void verticesComGrauMaiorQue(int k){
        System.out.println("Vértices com grau maior que " + k + ":");
        for(int i = 0 ; i < n; i++){
            if(listaAdj[i].size() > k){
                System.out.println("Vértice: " + i + " contém grau: " + listaAdj[i].size());
            }
        }
    }

    
    public void imprimirGrafo(){
        System.out.println("Lista de Adjacência:");
        for(int i = 0 ; i < n ; i++){
            System.out.println(i + ": " + listaAdj[i]);
        }
    }

    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número de vértices: ");
        int n = entrada.nextInt();

        ListadeAdjacencia grafo = new ListadeAdjacencia(n);

        while(true){
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar aresta");
            System.out.println("2 - Remover vértice");
            System.out.println("3 - Imprimir vizinhos");
            System.out.println("4 - Existe aresta entre dois vértices?");
            System.out.println("5 - Quantidade de arestas");
            System.out.println("6 - Listar vértices com grau maior que K");
            System.out.println("7 - Imprimir todo o grafo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int escolha = entrada.nextInt();

            if(escolha == 1){
                System.out.print("Origem: ");
                int x = entrada.nextInt();
                System.out.print("Destino: ");
                int y = entrada.nextInt();
                grafo.adicionaAresta(x, y);
            }
            else if(escolha == 2){
                System.out.print("Vértice para remoção: ");
                int x = entrada.nextInt();
                grafo.removeVertice(x);
            }
            else if(escolha == 3){
                System.out.print("Digite o vértice para imprimir os vizinhos: ");
                int x = entrada.nextInt();
                grafo.imprimeVizinho(x);
            }
            else if(escolha == 4){
                System.out.print("Digite o primeiro vértice: ");
                int x = entrada.nextInt();
                System.out.print("Digite o segundo vértice: ");
                int y = entrada.nextInt();
                System.out.println("Existe aresta? " + grafo.existeAresta(x, y));
            }
            else if(escolha == 5){
                System.out.println("A quantidade de arestas é: " + grafo.quantidadeArestas());
            }
            else if(escolha == 6){
                System.out.print("Digite o grau que deseja: ");
                int k = entrada.nextInt();
                grafo.verticesComGrauMaiorQue(k);
            }
            else if(escolha == 7){
                grafo.imprimirGrafo();
            }
            else if(escolha == 0){
                System.out.println("Saindo...");
                break;
            }
            else{
                System.out.println("Opção inválida!");
            }
        }
        entrada.close();
    }
}
