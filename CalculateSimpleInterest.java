import java.util.*;
class CalculateSimpleIterest{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		double principal= sc.nextDouble();
		double rate=sc.nextDouble();
		double time= sc.nextDouble();
		double SI=  (principal * rate * time) / 100;
		System.out.println(SI);
	}

}