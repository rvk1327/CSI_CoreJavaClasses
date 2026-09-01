package chapter2;

public class InterfaceDemo {

	public static void main(String[] str) {
		
		TV t = new TV();
		t.channelInfo(); //interface method
		t.channelData(); //class method
		
		//Features of interface
		//Feature #1: Access only interface methods
		Remote r = new TV();
		r.channelInfo();
		
		//Feature #2
		Remote r1 = new Remote() {
			
			public void channelInfo() {
				
				System.out.println("Channel-3 : " + CHANNEL_NAME);
			}
		
		};
		
		r1.channelInfo();
	}
}

interface Remote {
	
	public void channelInfo();
	//abstract public void channelInfo1();
	String CHANNEL_NAME = "TN News";
}

class TV implements Remote {
	
	public void channelInfo() {
		
		System.out.println("Channel-1 : " + CHANNEL_NAME);
	}
	
	public void channelData() {
		
		System.out.println("Channel-2 : " + CHANNEL_NAME);
	}
	
}









