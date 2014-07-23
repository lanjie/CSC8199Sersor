package uk.ac.ncl.csc8199.sensor.thread;

import java.util.TimerTask;

import uk.ac.ncl.csc8199.sensor.socket.SensorSendSocket;

/**   
 *    
 * Project Name：CSC8199   
 * Class Name：CounterThread   
 * Author：Jie Lan  
 * Time：2014年5月29日 上午9:10:06   
 * @version    
 *    
 */
public class CounterThread extends TimerTask{

	
	 /* (non-Javadoc)
	 * @see java.util.TimerTask#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Create: " + CreateTupleThread.counter);
		System.out.println("Send: " + SensorSendSocket.counter);
	}

}
