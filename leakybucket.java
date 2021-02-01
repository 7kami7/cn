java.util.Scanner; public class leakybucket
{
static int front=-1; static int rear=-1; static int max=10;
static int[]q=new int[10];
public static void delete()
{
if(front==rear) front=rear=-1; else
front=(front+1)%max;
}
public static void insert(int i)
{
if(front==-1) front=rear=0; else
rear=(rear+1)%max; q[rear]=i;
}
public static void main(String[] args)
{
int t=0,i=1,j=1,cap,n,a,q=1; int b=0;
System.out.println("enter the bucket capacity");
Scanner S=new Scanner(System.in); cap=S.nextInt();
System.out.println("enter the rate at which packet must be sent:");
b=S.nextInt();
System.out.println("enter the number of count for which output should be shown");
n=S.nextInt();
for(a=0;a<n;a++)
{
t=(++t)%b; System.out.print("\t t:"+t);
if(t==0)
{
delete();
System.out.print(j+"delivered\n"); j++;
}
else {
if((q-j)>=cap)
{
System.out.print(i+"discarded\n"); i++;
}
else
{
System.out.print(i+"queue\n"); insert(i);
i++; q++;
}
}
}
}
}