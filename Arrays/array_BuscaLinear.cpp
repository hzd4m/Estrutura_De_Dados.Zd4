#include <iostream> 

using namespace std; 

int buscaLinear(int* arr , int tamanho , int alvo){
    for(int i = 0 ; i < tamanho ; i++){
        if(arr[i] == alvo){
            return i;
        }
    }
    return -1;
}

int main(){

    int tamanho;
    int alvo;

    cout << "Digite o tamanho da array: " << endl;
    cin >> tamanho; 

    int* arr = new int[tamanho]; 

    cout << "Agora, digite os " << tamanho << " elementos da sua array. " << endl;
    for(int i = 0 ; i < tamanho ; i++){
        cin >> arr[i];
    }

    cout << "Digite o valor do alvo" << endl; 
    
}