package platform.cli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import platform.log.ApplicationLogger;
import platform.util.ApplicationException;

public abstract class CommandLine {
	protected abstract void registerCommand() ;
	protected abstract void init();

	public void start() {
		ApplicationLogger.init();
		init();
		registerCommand();
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.print("Ready for Command > ");
			try {
				String line = br.readLine();
				try {
					CommandManager.getInstance().run(line);
				} catch (ApplicationException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			} catch (IOException ioe) {
				System.out.println("IO error trying to read your name!");
				System.exit(1);
			}
		}
	}
}
