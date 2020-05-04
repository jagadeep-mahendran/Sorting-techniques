import java.util.*;
public class Test {
    static  void merge(int a[],int l,int m,int r)
     {
       int n1=m-l+1;
       int n2=r-m;
       int lt[]=new int[n1];
       int rt[]=new int[n2];
        for(int i=0;i<n1;i++)
            lt[i]=a[l+i];
               for (int j=0; j<n2; ++j)
                rt[j]=a[m+1+j];

           int i=0,j=0;
           int k=l;
           while(i<n1&&j<n2)
            {
              if(lt[i]<=rt[j])
               {
                 a[k]=lt[i];
                 i++;
                 k++;
               }
               else
                 {
                   a[k]=rt[j];
                   k++;
                   j++;
                 }
            }
            while(i<n1)
              {
                a[k]=lt[i];
                k++;
                i++;
              }
              while(j<n2)
              {
                a[k]=rt[j];
                k++;
              j++;
              }

     }
     static void sort(int a[],int l,int r)
       {
         if(l<r)
          {
             int m=(l+r)/2;
            sort(a,l,m);
             sort(a,m+1,r);
             merge(a,l,m,r);
          }
       }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
         sort(a,0,n-1);
        for(int i=0;i<n;i++)
           System.out.print(a[i]+" ");
    }
}
