#include<iostream>
using namespace std;
int main(){
	int a, n, soma=0;
    while(cin>>a){
        cin>>n;
        while(n<=0){
			cin>>n;
		}
        for(int i=0; i<n; i++){
            soma+=(a+i);
        }
        cout<<soma<<endl;
        soma=0;
    }
	return 0;
}
