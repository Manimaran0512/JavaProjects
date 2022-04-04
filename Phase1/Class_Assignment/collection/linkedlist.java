package collection;
import java.util.Iterator;
import java.util.LinkedList;


public class linkedlist {
		    public static void main(String a[]){
		    	
	        LinkedList<String> ll = new LinkedList<String>();
	        
	        ll.add("May");
	        ll.add("June");
	        ll.add("July");
	        ll.add("August");
	        ll.add("April");
	        ll.add("November");
	        ll.addLast("December");       
	        ll.addFirst("January");
	        System.out.println("after adding:"+ll);
	        ll.add(1, "March");
	        ll.add(2, "February");
	        ll.add(8, "September");
	        ll.add(9, "October");
	        System.out.println("\nlist of months:"+ll);
	        
	        
	        for(int i=0;i<ll.size();i++)
	        	if(i%2==0)
	        		System.out.println("\nEven months "+ll.get(i));
	       for(int i=0;i<ll.size();i++)
	    	   if(i%2!=0)
	    		   System.out.println("\nOdd months "+ll.get(i));
	        	 	                 
	        Iterator itr=ll.iterator();
	        while(itr.hasNext()) {
	        System.out.println("Iterator list is "+ itr.next());
	        }
	       
	        System.out.println(ll);
	        System.out.println("\nfirst and last month is  " +ll.getFirst() +"  and  "    +ll.getLast());
	        System.out.println("\nRemove my birthday month is Dec  " +ll.remove("December"));
	        System.out.println("\nDoes LinkedList contains winter month ? "+ll.contains("November"));
	        System.out.println("\npeekFirst :"+ll.peekFirst()+ " and "+"peeklast :"+ll.peekLast());
	        System.out.println("\npollFirst :"+ll.pollFirst()+" and "+"pollLast :"+ll.pollLast()); 


	        
	        }
	        
}