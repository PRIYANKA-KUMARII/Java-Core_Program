package test;

class Test implements Runnable
{
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		thread.stop();
		System.out.println(thread.getState());
	}
}
public class A
{
	public static void main(String[] args) {
		Test nit = new Test();
		nit.run();
	}
}
