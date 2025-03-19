/*Algoritmo de Ordenação > Bubble Sort compara dois elementos adjacentes e os troca se estiverem na ordem errada.*/
/*Pior caso: O(n²)*/ 

#include <iostream> 

using namespace std; 

void BubbleSort (int arr[], int tamanho){
    for(int i = 0 ; i < tamanho - 1 ; i++){
        for(int j = 0 ; j < tamanho - i - 1; j++){
            if(arr[j] > arr[j + 1]){
                swap(arr[j] , arr[j + 1]);
            }

        }

    }
}

void imprimirArray(int arr[], int tamanho){
    for(int i = 0 ; i < tamanho ; i++){
        cout << arr[i] << " " ; 
    }

    cout << endl;
}


int main() { 
    int arr[] = {64 , 34 , 25 , 12 , 22 , 11 , 90};
    int tamanho = sizeof(arr)/sizeof(arr[0]); 

    BubbleSort(arr, tamanho);
    
    cout << "Bubble Sort: ";
    imprimirArray(arr, tamanho);
    return 0;
}

