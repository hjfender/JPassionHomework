package mycollectionproject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Object> hashSet = new HashSet<Object>();
		
		//Add 2 String Objects to hashSet
		hashSet.add("Hash");
		hashSet.add("Set");
		
		//Add 2 MyOwnClass Objects to hashSet
		hashSet.add(new MyOwnClass("Uno", 1));
		hashSet.add(new MyOwnClass("Dos", 2));
		
		//Add 3 Integer Objects to hashSet
		hashSet.add(3);
		hashSet.add(4);
		hashSet.add(5);
		
		//Print out the contents of hashSet with its iterator
		for (Iterator<Object> iterator = hashSet.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		
		Set<Object> linkedHashSet = new LinkedHashSet<Object>();
		
		//Add 2 String Objects to linkedHashSet
		linkedHashSet.add("LinkedHash");
		linkedHashSet.add("Set");
		
		//Add 2 MyOwnClass Objects to linkedHashSet
		linkedHashSet.add(new MyOwnClass("Ciento_Once", 111));
		linkedHashSet.add(new MyOwnClass("Ciento_Doce", 112));
		
		//Add 3 Integer Objects to linkedHashSet
		linkedHashSet.add(113);
		linkedHashSet.add(114);
		linkedHashSet.add(115);
		
		//Print out the contents of linkedHashSet with its iterator
		for (Iterator<Object> iterator = linkedHashSet.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		
		List<Object> linkedList = new LinkedList<Object>();
		
		//Add 2 String Objects to linkedHashSet
		linkedList.add("Linked");
		linkedList.add("List");
		
		//Add 2 MyOwnClass Objects to linkedHashSet
		linkedList.add(new MyOwnClass("Once", 11));
		linkedList.add(new MyOwnClass("Doce", 12));
		
		//Add 3 Integer Objects to linkedHashSet
		linkedList.add(13);
		linkedList.add(14);
		linkedList.add(15);
		
		//Print out the contents of linkedList with its iterator
		for (Iterator<Object> iterator = linkedList.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next()+" ");
		}
	}
}
