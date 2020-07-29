

class Q {
	int num;
  boolean valueSet=false;
  
  
	public synchronized void getNum() {
		if(!valueSet) {
			try {
				wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("get" +num);
		valueSet=false;
		notify();
	}

	public synchronized void setNum(int num) {
		while(valueSet) {
			try {
				wait();
			}catch(Exception e){
			}
		}
		System.out.println("put " +num);
		this.num = num;
		valueSet=true;
		notify();
		
	}
}

class producer implements Runnable {
	Q q;

	public producer(Q q) {
		// TODO Auto-generated constructor stub
		this.q = q;
		Thread t=new Thread(this,"Producer");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.setNum(i++);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("");
			}
		}

	}

}

class Consumer implements Runnable {
	Q q;

	public Consumer(Q q) {
		// TODO Auto-generated constructor stub
		this.q = q;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.getNum();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("");
			}
		}

	}

}

public class InterThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Q q1=new Q();
    producer p=new producer(q1);
    Consumer c=new Consumer(q1);
	}

}
