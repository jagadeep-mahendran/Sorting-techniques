import java.util.*;
class heap{

  static void heapify(int a[],int n,int i)
   {
    int  lar=i;
     int l=2*i+1;
     int r=2*i+2;
     if(l<n&&a[l]>a[lar])
        lar=l;
        if(r<n&&a[r]>a[lar])
         lar=r;
         if(lar!=i)
           {
             int t;
             t=a[lar];
             a[lar]=a[i];
             a[i]=t;
             heapify(a,n,lar);
           }
   }

   static void printf(int a[],int n){
     System.out.println("Elements after Sort : ");
      for (int i=0;i<n ;i++ ) {
        System.out.print(a[i]+" ");
      }
   }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
    System.out.println("Enter elements to sort");
      int a[]=new int[n];
     for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=n/2-1;i>=0;i--)
           heapify(a,n,i);
          for(int i=n-1;i>=0;i--)
           {
             int t=a[0];
             a[0]=a[i];
             a[i]=t;
             heapify(a,i,0);
           }
           printf(a,n);

  }
}
