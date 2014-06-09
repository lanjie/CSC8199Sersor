package uk.ac.ncl.csc8199.model;

import java.io.Serializable;
/**   
 *    
 * Project Name：CSC8199   
 * Class Name：Tuple   
 * Author：Jie Lan  
 * Time：2014年5月28日 下午10:42:58   
 * @version    
 *    
 */
public class Tuple implements Serializable{
	
	
	/**
	 * 
	 */
	public double waitingTime;
	public long timestamp;
	

	
	public double getWaitingTime() {
		return waitingTime;
	}
	public void setWaitingTime(double waitingTime) {
		this.waitingTime = waitingTime;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Tuple [waitingTime=" + waitingTime + ", timestamp=" + timestamp
				+ "]";
	}
}
