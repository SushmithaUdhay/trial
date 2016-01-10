#include<stdio.h>
void main()
{
  int n,k;
  scanf("%d",&n); 
  for(k=1;k<=n;k++)
  {
    func(k);
  }
  
  void func(int m)
  {
    for(i=m;i<=n;i++)
    {
      for(j=m;j<=i;j++)
      {
        printf("%d",j);
      }
    }
    
  }
  }
