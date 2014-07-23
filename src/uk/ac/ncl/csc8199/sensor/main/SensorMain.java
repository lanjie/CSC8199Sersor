package uk.ac.ncl.csc8199.sensor.main;

import java.util.Timer;

import uk.ac.ncl.csc8199.sensor.thread.CounterThread;
import uk.ac.ncl.csc8199.sensor.thread.CreateTupleThread;
import uk.ac.ncl.csc8199.sensor.thread.SendThread;

/**   
 *    
 * Project Name：CSC8199   
 * Class Name：SensorMain   
 * Author：Jie Lan  
 * Time：2014年5月28日 下午11:51:49   
 * @version    
 *    
 */
public class SensorMain {

	public static void main(String[] args) throws Exception {
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new CreateTupleThread(), 0, 1);
		timer.scheduleAtFixedRate(new SendThread(1688), 0, 1);
		timer.scheduleAtFixedRate(new CounterThread(), 0, 1000);
		
/*		CreateTuple createTuple = new CreateTuple();
		createTuple.createTuple();
		SensorSendSocket sensorSendSocket = new SensorSendSocket();
		sensorSendSocket.createSendSocket();*/
	}
}
