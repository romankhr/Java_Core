package homeWork20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationExecutor {

	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		MyThread mt = new MyThread();

		RunnableThread rt = new RunnableThread();

		es.submit(new Runnable() {

			@Override
			public void run() {
				mt.run();

			}
		});

		es.submit(new Runnable() {

			@Override
			public void run() {
				rt.run();

			}
		});

	}

}
