package uk.ac.ncl.csc8199.sensor.method;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import uk.ac.ncl.csc8199.model.Tuple;
import uk.ac.ncl.csc8199.model.TupleList;

/**   
 *    
 * Project Name��CSC8199   
 * Class Name��CreateTuple   
 * Author��Jie Lan  
 * Time��2014��5��28�� ����11:32:24   
 * @version    
 *    
 */
public class CreateTuple {
	
	//TupleList tupleList = new TupleList();

	public void createTuple() {
		
		Tuple tuple = new Tuple();
		Random random = new Random();
		//tuple.setWaitingTime(1);
		tuple.setWaitingTime(Math.abs(random.nextInt() % 10));
		tuple.setTimestamp(TimeUnit.NANOSECONDS.toMicros(System.nanoTime()));
		TupleList.tupleList.add(tuple);
		//System.out.println(TupleList.tupleList.size());
		//System.out.println(tuple.toString());
	}
}
