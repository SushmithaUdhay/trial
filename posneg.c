#include <stdio.h>

int main(void) {
	
	int i,j,temp = 0,k=0,pos;
	int a[10] = {9,-8,0,1,-4,4,-2};
	int res[10];
	
	for(i=0;i<7;i++){
		for(j=i+1;j<7;j++){
			if(a[i]>a[j]){
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	for(i=0;i<7;i++){
		if(a[i] >= 0){
			res[k] = a[i];
			k+=2;
		}
		if(a[i]<0){
			pos = i;
		}
	}
//	printf("%d ",pos);
	for(j=pos,k=1;j>=0;j--,k+=2){
		
			res[k] = a[j];
		
	}
	
	for(i=0;i<7;i++){
		printf("%d ",res[i]);
	}
	
	return 0;
}
