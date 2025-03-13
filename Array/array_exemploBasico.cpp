#include <iostream> 
#define x 8; 

using namespace std; 

int main () { 
    int num[x]; 

    for ( int i = 0 ; i < x ; i++){
        cout << "Digite os valores da array: " << endl; 
        cin >> num[i]; 

        
    }
    for ( int i = 0 ; i < x ; i++){
        cout << num[i] << " ";  
        
    }
}