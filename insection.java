import java.util.*;
public class Test {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
      int indx=0;
         for(int i=1;i<n;i++)
           {  int k=a[i];
                indx=i;
             for(int j=i-1;j>=0;j--)
               {
                 if(k<a[j])
                    {
                      a[j+1]=a[j];
                      indx=j;
                    }
                    a[indx]=k;
               }
               for(int ii=0;ii<n;ii++)
                  System.out.print(a[ii]+" ");
                  System.out.println();
           }
        for(int i=0;i<n;i++)
           System.out.print(a[i]+" ");
    }
}
