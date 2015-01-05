public class LecturerScript {

	public static void main(String[] args){
	
		LecturerScript ls = new LecturerScript();
		ls.launch();
		
	}
	
	public void launch() {	
		Lecturer mark = new Lecturer("king");
		mark.teach("maths");
		mark.doResearch("english");
	}

}