#include<stdio.h>
#include<stdlib.h>
void main(){
     int i,j,a[100],t,n;
     scanf("%d",&n);
     for(i=0;i<n;i++)
         scanf("%d",&a[i]);
       for(i=0;i<n-1;i++)
           {
               for(j=0;j<n-1-i;j++)
                  {
                      if(a[j]>a[j+1])
                        {
                             t=a[j];
                             a[j]=a[j+1];
                             a[j+1]=t;
                         }
                  }
            }
            for(i=0;i<n;i++)
         printf("%d",a[i]);
}
