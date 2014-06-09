package uk.ac.ncl.csc8199.sensor.socket;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Iterator;

import uk.ac.ncl.csc8199.model.Tuple;
import uk.ac.ncl.csc8199.model.TupleList;


/**   
 *    
 * Project Name��CSC8199   
 * Class Name��Init   
 * Author��Jie Lan  
 * Time��2014��5��28�� ����11:00:56   
 * @version    
 *    
 */
public class SensorSendSocket {
	
	public void createSendSocket() throws Exception {
		
		DatagramSocket socket = new DatagramSocket();
		DatagramPacket packet = new DatagramPacket(new byte[0], 0, InetAddress.getByName("127.0.0.1"), 1688);
		ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
		ObjectOutputStream objectStream = new ObjectOutputStream(byteArrayStream);
		TupleList tupleList = new TupleList();
		for(Iterator<Tuple> i = tupleList.getTupleList().iterator(); i.hasNext(); ){

			Tuple tuple = i.next();
			objectStream.writeObject(tuple);
			i.remove();
			
			
			byte[] array = byteArrayStream.toByteArray();
			packet.setData(array);//���DatagramPacket
			socket.send(packet);//����
			//socket.close();

		}

		objectStream.close();
		byteArrayStream.close();
		

	}

}
