import java.util.*;
class Newthread implements Runnable{
	Thread t;
	Newthread(String name){
			t=new Thread(this,name);
		}
		public void run(){
			try{
				for(int i=0;i<10;i++){
					System.out.println("BMS College of Engineering");
					Thread.sleep(10000);
					}
				}catch(InterruptedException e){
					System.out.println("Child thread interrupted");
					}
					System.out.println("Existing Child Thread");
				}
			
		}
class threaddemo{
       public static void main(String args[]){
       		Newthread nt=new Newthread("BMS college");
       		nt.t.start();
       		try{
       				for(int i=0;i<10;i++){
       					System.out.println("CSE");
       					Thread.sleep(2000);
       				}
       			}catch(InterruptedException e){
       				System.out.println("Main thread existing");
       			}
       			System.out.println("Main Thread existing");
       		}
  }
  
	
		
		
