import java.util.*;
class FizzBuzz{
	int i,n;
	FizzBuzz(int n)
	{
	i=1;
	this.n=n;
	}
	public synchronized void printFizz(){
		try{
			while(i<=n){
				if(i%5!=0 && i%3==0){
						System.out.print("Fizz ");
						i=i+1;
						notifyAll();	
				}
				else
					wait();
		    }
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public synchronized void printBuzz(){
		try{
			while(i<=n){
				if(i%5==0 && i%3!=0){
						System.out.print("Buzz ");
						i=i+1;
						notifyAll();
				}
				else
					wait();
		  }
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public synchronized void printFizzBuzz(){
		try{
			while(i<=n){
				if(i%5==0 && i%3==0){
						System.out.print("FizzBuzz ");
						i=i+1;
						notifyAll();
				}
				else
					wait();
				
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public synchronized void printNumber(){
		try{
			while(i<=n){
				if(i%3!=0 && i%5!=0){
					System.out.print(i+" ");
					i=i+1;
					notifyAll();
				}
				else
					wait();	
		   }
		}
		catch(Exception e){
				System.out.println(e.getMessage());
		}
	}
}
class T1 implements Runnable{
	FizzBuzz fb;
	T1(FizzBuzz fb){
		this.fb=fb;
	}
	public void run(){
		fb.printFizz();
	}
}
class T2 implements Runnable{
	
	FizzBuzz fb;
	
	T2(FizzBuzz fb){
		this.fb=fb;
	}
	
	public void run(){
		fb.printBuzz();
	}
}
class T3 implements Runnable{
	
	FizzBuzz fb;
	
	T3(FizzBuzz fb){
		this.fb=fb;
	}
	
	public void run(){
		fb.printFizzBuzz();
	}
}
class Test{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			FizzBuzz obj1 = new FizzBuzz(n);
			T1 t1 = new T1(obj1);
			T2 t2 = new T2(obj1);
			T3 t3 = new T3(obj1);
			Thread th1= new Thread(t1);
			th1.start();
			Thread th2= new Thread(t2);
			th2.start();
			Thread th3= new Thread(t3);
			th3.start();
			obj1.printNumber();
		}		
	}
}