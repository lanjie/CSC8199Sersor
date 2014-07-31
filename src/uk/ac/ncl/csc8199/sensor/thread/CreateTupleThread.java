package uk.ac.ncl.csc8199.sensor.thread;

import java.util.TimerTask;

import uk.ac.ncl.csc8199.sensor.method.CreateTuple;
import uk.ac.ncl.csc8199.sensor.socket.SensorSendSocket;


/**   
 *    
 * Project Name：CSC8199   
 * Class Name：CreateTupleThread   
 * Author：Jie Lan  
 * Time：2014年5月28日 下午11:23:37   
 * @version    
 *    
 */
public class CreateTupleThread extends TimerTask{

	public static int counter;
	 /* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		CreateTuple ct = new CreateTuple();
		for(int i = 0; i < 10; i++){
		
			ct.createTuple();
			counter++;
		}
		
	}
	

	
}
