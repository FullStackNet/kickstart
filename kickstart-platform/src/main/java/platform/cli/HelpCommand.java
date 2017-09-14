package platform.cli;

public class HelpCommand extends Command {

	public HelpCommand() {
		super("help", "help", "help");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		CommandManager.getInstance().printHelp();
	}

}
