package uk.ac.ncl.csc8199.model;

import java.util.LinkedList;

/**   
 *    
 * Project Name：CSC8199   
 * Class Name：TupleList   
 * Author：Jie Lan  
 * Time：2014年5月28日 下午11:43:20   
 * @version    
 *    
 */
public class TupleList {

	public static LinkedList<Tuple> tupleList = new LinkedList<>();
	
	public LinkedList<Tuple> getTupleList() {
		return tupleList;
	}
	public void setTupleList(LinkedList<Tuple> tupleList) {
		TupleList.tupleList = tupleList;
	}
}
