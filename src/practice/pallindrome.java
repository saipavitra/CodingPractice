package practice;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=131;
int rev = 0;
int n=0;
while(num>0)
{
rev=num%10;
n=n*10+rev;
num=num/10;
}

System.out.println(n);

	}

}
