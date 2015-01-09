public class SimpleMapScript {

	public static void main(String[] args) {
		SimpleMapScript sms = new SimpleMapScript();
		sms.launch1();
		sms.launch2();
	}
	
	public void launch1() {
		SimpleMap<Integer,String> sm = new SimpleMap<Integer,String>();
		System.out.println();
		System.out.println(" === NEW MAP: INTEGER FOR KEY AND STRING FOR VALUES=== ");		
		System.out.println(" === TEST PUT & GET === ");
		sm.put(10, "Mark");
		sm.put(20, "Tom");
		sm.put(10, "Ellie");
		sm.put(80, "Anna");
		System.out.println("Get key 20 ---> " + sm.get(20));
		System.out.println("Get key 80 ---> " + sm.get(80));
		System.out.println("Get key 15 ---> " + sm.get(15));
		System.out.println(" === TEST PUT & REMOVE === ");
		sm.put(999, "Fred");
		sm.put(500, "Jane");
		System.out.println("Get key 500 ---> " + sm.get(500));
		System.out.println("Remove 500: " + sm.remove(500));
		System.out.println("Remove 100: " + sm.remove(100));
		System.out.println();
	}
	
	public void launch2() {
		SimpleMap<String,Double> sm = new SimpleMap<String,Double>();
		System.out.println();
		System.out.println(" === NEW MAP: STRING FOR KEY AND DOUBLE FOR VALUE === ");		
		System.out.println(" === TEST PUT & GET === ");
		sm.put("aaa", 1.1);
		sm.put("bbb", 2.2);
		sm.put("aaa", 3.3);
		sm.put("ccc", 4.4);
		System.out.println("Get key bbb ---> " + sm.get("bbb"));
		System.out.println("Get key ccc ---> " + sm.get("ccc"));
		System.out.println("Get key zzz ---> " + sm.get("zzz"));
		System.out.println(" === TEST PUT & REMOVE === ");
		sm.put("ppp", 100.1);
		sm.put("qqq", 100.2);
		System.out.println("Get key qqq ---> " + sm.get("qqq"));
		System.out.println("Remove qqq: " + sm.remove("qqq"));
		System.out.println("Remove sss: " + sm.remove("sss"));
		System.out.println();
	}
	
	
	

	

}