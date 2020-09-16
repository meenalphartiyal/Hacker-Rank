#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    float a1,b1;
    int a2,b2;
    scanf("%d%d",&a2,&b2);
    scanf("%f%f",&a1,&b1);
    printf("%d %d\n",a2+b2,a2-b2);
	printf("%0.1f %0.1f",a1+b1,a1-b1);
    
    return 0;
}
