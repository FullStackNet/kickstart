package platform.cli;

public class QuitCommand extends Command {

	public QuitCommand() {
		super("quit", "quit", "quit");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
