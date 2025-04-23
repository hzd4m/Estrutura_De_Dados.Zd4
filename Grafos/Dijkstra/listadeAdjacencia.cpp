#include <iostream>
#include <vector> 


using namespace std; 

struct ElemLista{
    int vertice;
    ElemLista* prox; 

    ElemLista(int v){
        vertice = v;
        prox = nullptr;
    }
}

class Grafo{
    public:
        int numVertices;
        int numArestas;

        vector<ElemLista*> A;


        Grafo(int vertices){
            if(vertices < 0){
                return false;
            }

            numVertices = vertices;
            numArestas = 0; 

            A.resize(vertices, nullptr);
        }

}

 ~Grafo(){
    for(int i = 0 ; i < numVertices ; i++){
        ElemLista* atual = A[i];
        while(atual != nullptr){
            ElemLista* apagar = atual;
            atual = atual -> prox;
            delete apagar;
        }
    }
 }

 