package homeWork20;

public class Application {

	public static void main(String[] args) {

		MyThread mt=new MyThread();
		mt.run();
		
		RunnableThread rt=new RunnableThread();
		rt.run();

	}

}
