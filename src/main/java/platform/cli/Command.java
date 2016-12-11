package platform.cli;

import java.util.ArrayList;

import platform.util.ApplicationException;

public abstract class Command {
	String id;
	String syntax;
	String description;
	
	int numberArguments;
	ArrayList<Argument> argList;
	
	public Command(String id,String description, String syntax) {
		this.id = id;
		this.syntax = syntax;
		this.description = description;
		argList = new ArrayList<Argument>();
	}

	public String getId() {
		return id;
	}

	public String getSyntax() {
		return syntax;
	}

	public void setSyntax(String syntax) {
		this.syntax = syntax;
	}

	public int getNumberArguments() {
		return numberArguments;
	}

	public void setNumberArguments(int numberArguments) {
		this.numberArguments = numberArguments;
	}
	
	public void add(Argument arg) {
		argList.add(arg);
		numberArguments++;
	}
	
	public ArrayList<Argument> getArgs() {
		return argList;
	}
	
	public void parse(String[] tokens, int startIndex) throws ApplicationException {
		ArrayList<Argument> args = getArgs();
		int index = startIndex;
		for(int i =0 ; i < args.size() ; i++) {
			Argument arg = args.get(i);
			arg.parse(tokens[index]);
			index++;
		}
	}

	public Argument getArg(String name) {
		ArrayList<Argument> args = getArgs();
		for(int i =0 ; i < args.size() ; i++) {
			if (args.get(i).getName().equals(name)) {
				return args.get(i);
			}
		}
		return null;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getIntegerValue(String name) {
		Argument arg = getArg(name);
		if (arg != null) {
			return (Integer)arg.getValue();
		}
		return null;
	}
	
	public String getStringValue(String name) {
		Argument arg = getArg(name);
		if (arg != null) {
			return (String)arg.getValue();
		}
		return null;
	}
	
	public abstract void execute();
}
