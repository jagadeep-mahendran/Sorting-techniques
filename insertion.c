#include<stdio.h>
#include<stdlib.h>
void main(){
     int i,j,a[100],t,n;
     scanf("%d",&n);
     for(i=0;i<n;i++)
         scanf("%d",&a[i]);
       for(i=1;i<=n-1;i++)
	{
		t=a[i];
		j=i-1;
		while(t<a[j] && j>=0)
		{
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=t;
	}
            for(i=0;i<n;i++)
         printf("%d",a[i]);
}
