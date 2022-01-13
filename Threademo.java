package com.revature.threads;

//1  extendsing Thread

class T1 extends Thread { //run ,start,
	
	public  void run() {
		try {
			for(int i=1;i<=5;i++) {
			System.out.println(" Firts:"+ Thread.currentThread().getName());
			Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class T2  implements Runnable {  //run
	public void run() {
	try {
		for(int i=1;i<=5;i++) {
		System.out.println("Second:"+Thread.currentThread().getName());
		Thread.sleep(500);
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

public class Threademo {

	public static void main(String[] args) { // thread  ,JVM
		
		System.out.println(Thread.currentThread().getName());
		
		T1 t1=new T1();
		t1.setName("FSD user1");
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		t1.start();
		t1.suspend();
		t1.resume();
	/*	T1 t2=new T1();
		t2.setName("FSD User2");
		t2.start();
		*/
		
		T2  tt2=new T2();
		Thread tt=new Thread(tt2);  ///aditional step , Runnable
		tt.start();
		System.out.println(Thread.activeCount());
		System.out.println(t1.isAlive());
		//System.out.println(t1.isDaemon());
		//t1.setDaemon(true);
		//t1.interrupt();
		//System.out.println(t1.isInterrupted());
		try {
			t1.join();
			tt.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(Thread.activeCount());
		

	}

}
