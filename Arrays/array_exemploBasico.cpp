#include <iostream> 
#define x 8

using namespace std; 

int main () { 
    int num[x]; 
    cout << "Digite os 8 valores da array: " << endl;
    for ( int i = 0 ; i < x ; i++){
         
        cin >> num[i]; 

        
    }; 
    
    for ( int i = 0 ; i < x ; i++){
        cout << num[i] << " ";  
        
    }
}