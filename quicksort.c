#include<stdio.h>
#include<stdlib.h>
int partition(int ar[],int l,int r){
    int p,i,j,t;
    i=l+1;
    j=r;
    p=ar[l];
    while(j>=i)
      {
      while(ar[i]<=p)
         i++;
         while(ar[j]>p)
         j--;
         if(i<j)
          {
             t=ar[i];
             ar[j]=ar[i];
             ar[i]=t;
          }
      }
      t=ar[l];
      ar[l]=ar[j];
      ar[j]=t;
  return j;
}
void quicksort(int ar[],int l,int r)
{   int s;
    if(l<r)
       {
           s=partition(ar,l,r);
           quicksort(ar,l,s-1);
           quicksort(ar,s+1,r);
       }
}
void main(){
     int i,j,a[]={5,4,3,2,1},t,n;
     
   //  scanf("%d",&n);
     //for(i=0;i<n;i++)
       //  scanf("%d",&a[i]);
      quicksort(a,0,4);  
      for(i=0;i<5;i++)
       printf("%d",a[i]);      
   }
