#include <iostream> 

using namespace std; 

int main(){
    int tamanho; 
    cout << "Digite o tamanho da array: ";
    cin >> tamanho; 

    int* arr = new int[tamanho]; 

    cout << "Agora , digite os " << tamanho << " elementos"; 
    for(int i = 0 ; i < tamanho ; i++){
        cin >> arr[i]; 
    } 

    cout << "Os elementos da array são :" ;
       for(int i = 0 ; i < tamanho ; i++){
        cout << arr[i] << " ";
       }

       cout << endl; 
       delete[] arr;
       return 0; 


}