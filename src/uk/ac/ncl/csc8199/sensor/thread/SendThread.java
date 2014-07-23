package uk.ac.ncl.csc8199.sensor.thread;

import java.util.TimerTask;

import uk.ac.ncl.csc8199.sensor.socket.SensorSendSocket;

/**   
 *    
 * Project Name：CSC8199   
 * Class Name：OutputThread   
 * Author：Jie Lan  
 * Time：2014年5月28日 下午10:44:56   
 * @version    
 *    
 */
public class SendThread extends TimerTask{

	private int port;
	
	public SendThread(int port) {
		
		this.port = port;
	}
	 /* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		SensorSendSocket sensorSendSocket = new SensorSendSocket();
		try {
			sensorSendSocket.createSendSocket(port);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
