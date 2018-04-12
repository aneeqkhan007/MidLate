package datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class UseQueue {

	public static void main(String[] args) {
		Queue<Integer> Que = new LinkedList<>();

		Que.add(650);
		Que.add(700);
		Que.add(850);

		System.out.println(Que);

		int head = Que.peek() ;
			System.out.println(head);

			//Store results in the database
			//ConnectDB db = new ConnectDB();
			//db.InsertDataFromArrayListToMySql(myArrList, "queuetable", "ID");

		}

	}


/*
 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
 * Use For Each loop and while loop with Iterator to retrieve data.
 *
 */