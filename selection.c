#include<stdio.h>
#include<stdlib.h>
void main(){
     int i,j,a[100],t,x,n,min=999;
     scanf("%d",&n);
     for(i=0;i<n;i++)
         scanf("%d",&a[i]);
       for(i=0;i<n-1;i++)
           {
           	min=a[i+1];
           	x=i+1;
               for(j=i+2;j<n;j++)
                      {
                      if(min>a[j])
                            {
                                 min=a[j];
                                 x=j;
                              }
                  }
                  if(a[i]>min)
                     {
                         t=a[i];
                         a[i]=a[x];
                         a[x]=t;
                     }
            }
            for(i=0;i<n;i++)
         printf("%d",a[i]);
}