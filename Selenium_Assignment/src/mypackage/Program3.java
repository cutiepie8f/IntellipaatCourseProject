package mypackage;

public class Program3 {
       int max_number(int a,int b,int c)
       {
    	   if(a>b && a>c)
   		{
   			return a;
   		}
   		else if(b>a && b>c)
   		{
   			return b;
   		}
   		else
   		{
   			return c;
   		}
       }
	public static void main(String[] args) {
		Program3 obj = new Program3();
		int max = obj.max_number(109, 555, 899);
        System.out.println("The greatest number is : "+max);
	}

}
