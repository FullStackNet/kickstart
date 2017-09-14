package platform.test;

import java.util.Date;

public class TestAru {
	public static void ghadi()  throws Exception {
		Thread thead = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				boolean stop = false;
				int seconds = 40*60*1000;
				while (!stop) {
					System.out.println("Remaining the time " + seconds/(1000*60) + " min " +(seconds/1000)%60 + " secs" );
					System.out.println("Current Time  " + new Date().toString() );
					try {
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					seconds = seconds - 1000;
					if (seconds < 0)
						stop = true;
				}
			}
		});
		thead.start();
	}
	public static void kuchaur(String[] args) throws Exception {
		int a = 1,b =5,c= 1;
		double d;
		d = Math.pow(b*b-4*a*c, .5);
		System.out.println("kuch aur Value of Expression -> "+ d);	
	}
	
	public static void main(String[] args) throws Exception {
		int a = 1,b =5,c= 1;
		double d;
		d = Math.pow(b*b-4*a*c, .5);
		System.out.println("Value of Expression -> "+ d);	
		kuchaur(args);
		ghadi();
	}
}	
