import java.util.Scanner;
public class FcFs
{
  public static void main(String args[])
{
  int process[]=new int[20];
  int btime[]=new int[20];																														
  int wtime[]=new int[20];
  int tat[]=new int[20];
  
  float avwt=0;
  float avtat=0;

  int total_wt=0;
  int total_tat=0;

  Scanner Sc=new Scanner(System.in);
  System.out.println("Enter no of process:");
  int n=Sc.nextInt();
  for(int i=0;i<n;i++)
{
  System.out.println("Enter the process no:"+(i+1));
  process[i]=Sc.nextInt();
  System.out.println("Enter the btime no:"+(i+1));
  btime[i]=Sc.nextInt();
}
  wtime[0]=0;
  for(int i=1;i<n;i++)
{
  wtime[i]=0;
  for(int j=0;j<i;j++)
{
  wtime[i]+=btime[j];
}
}
System.out.println("\nProcess\t\tBurst Time\tWaiting Time\tTurnaround Time");
 for(int i=0;i<n;i++)
 {
  tat[i]=btime[i]+wtime[i];
  total_wt+=wtime[i];
  total_tat+=tat[i];
  System.out.println("\n"+(i+1)+"\t\t"+btime[i]+"\t\t"+wtime[i]+"\t\t"+tat[i]);
 }
   avwt=total_wt/n;
   avtat=total_tat/n;
   System.out.println("\nAverage wait time:"+avwt);
   System.out.println("\nAverage Turnaroundtime:"+avtat);
}
}
  