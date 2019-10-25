package td1mav;

import java.util.ArrayList;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>() ;
		remplirListe(list1,1);
		ArrayList<Integer> list2 = new ArrayList<Integer>() ;
		remplirListe(list2, 5);
		ArrayList<Integer> list3 = new ArrayList<Integer>() ;
		remplirListe(list3, 9);
		extracted(list1,1);
		extracted(list2,2);
		extracted(list3,3);
	}

	private static void remplirListe(ArrayList<Integer> list,int idepart) {
		for(int i=idepart;i<idepart+4;i++) {
			list.add(i);
		}
	}
	private static void extracted(ArrayList<Integer> list1,int numero) {
		int index = 0;
		for ( Integer value : list1 ) {
		System.out.println (" list"+numero+".get(" + index ++ + ") = " +
		value );
		}
	}

}

