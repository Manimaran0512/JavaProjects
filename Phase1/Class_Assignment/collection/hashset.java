package collection;

import java.util.HashSet;
public class hashset {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		
		h.add("a");
		h.add("b");
		h.add("4000");
		h.add("d");
		h.add("e");
		h.add("f");
		h.add("g");
		h.add("h");
		h.add("i");
		h.add("j");
		h.add("k");
		h.isEmpty();
		
		
		System.out.println("HashSet....: "+h);
		System.out.println("HashSet Size:"+h.size());
		System.out.println("HashSet code:"+h.hashCode());
		System.out.println("hashSet Empty:"+h.isEmpty());
		System.out.println("Hashset remove:"+h.remove("d"));
		System.out.println("Do Vriablehashset e element....:"+h.contains("e"));
		System.out.println("Hashset...."+h);
		
		
	
	}

}
