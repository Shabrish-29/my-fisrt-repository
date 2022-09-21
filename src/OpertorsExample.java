
public class OpertorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=90,c=50;

		        if(a<b || b>c) // F && T -> F
		        {
		            System.out.println("Hello world!!");
		        }
		        
		        if(a!=b) //90!=90
		        {
		            System.out.println("Its false");
		        }
		        else
		        {
		            System.out.println("Its true");
		        }
		        
		        
		        if((a==b)!=true) //true != true
		        {
		            System.out.println("Its equal");
		        }
		        else
		        {
		            System.out.println("Its not equal");
		        }
		        
		        
		        System.out.println(a+b);
		        System.out.println(a/b);
		        System.out.println(a%b);
		        System.out.println(a>b && b>c);
		        
		        int result=a>b? a>c?a:c  : b>c?b:c;
		        System.out.println(result);
		        

		    }

		
	}


