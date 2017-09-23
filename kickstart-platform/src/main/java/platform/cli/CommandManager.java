package platform.cli;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;

public class CommandManager {
	public static CommandManager instance;
	Map<String , Command> map;
	public CommandManager() {
		// TODO Auto-generated constructor stub
		map = new HashMap<String, Command>();
		registerCommand(new HelpCommand());
		registerCommand(new QuitCommand());
	}

	public static CommandManager getInstance() {
		if (instance == null)
			instance = new CommandManager();
		return instance;
	}

	public void registerCommand(Command command) {
		map.put(command.getId(),command);
	}

	public void run(String line) throws ApplicationException {
		Command command = null;
		if ((line == null) || (line.length() == 0))
			return;
		String[] tokens = line.split(" ");
		int index = 0;
		String commandID = tokens[index];
		index++;
		command = map.get(commandID);
		if (command == null) {
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Command");
		}
		if (command.getNumberArguments() != 0) {
			if (command.getNumberArguments() != (tokens.length -1))
				throw new ApplicationException(ExceptionSeverity.ERROR, "Argument Missing");
			command.parse(tokens, index);
		}
		command.execute();
		return ;
	}

	public void printHelp() {
		Iterator<Entry<String, Command>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Command> pair = itr.next();
			Command command = pair.getValue();
			System.out.println(command.getId() + " - " + command.getDescription());
			System.out.println("\t\t" + command.getSyntax());
		}
	}
}
