package uk.ac.ncl.csc8199.model;

import java.io.Serializable;
import java.util.LinkedList;

/**   
 *    
 * Project Name��CSC8199   
 * Class Name��TupleList   
 * Author��Jie Lan  
 * Time��2014��5��28�� ����11:43:20   
 * @version    
 *    
 */
public class TupleList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static LinkedList<Tuple> tupleList = new LinkedList<>();
	
	public LinkedList<Tuple> getTupleList() {
		return tupleList;
	}
	public void setTupleList(LinkedList<Tuple> tupleList) {
		TupleList.tupleList = tupleList;
	}
}
