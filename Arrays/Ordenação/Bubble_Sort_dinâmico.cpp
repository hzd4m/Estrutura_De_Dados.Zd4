#include <iostream> 

using namespace std; 


void bubbleSort(int* arr , int tamanho){
    for(int i = 0 ; i < tamanho - 1 ; i++){
        for(int j = 0 ; j < tamanho - i - 1 ; j++){
            if(arr[j] > arr[j + 1]){
                swap(arr[j],arr[j+1]);
            }
            
            
            
        }
        
    }
}

void imprimirArray(int* arr, int tamanho) {
    for (int i = 0; i < tamanho; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    int tamanho;
    
    cout << "Digite o tamanho da sua array: " << endl;
    cin >> tamanho; 
    
    int* arr = new int[tamanho]; 
    
    cout << "Digite os " << tamanho << " elementos da sua array." << endl; 
    for(int i = 0 ; i < tamanho ; i++){
        cin >> arr[i];
    }

    
    
    bubbleSort(arr, tamanho);

    cout << "Bubble Sort: ";
    imprimirArray(arr, tamanho);
    
    delete[] arr;
    return 0;
}