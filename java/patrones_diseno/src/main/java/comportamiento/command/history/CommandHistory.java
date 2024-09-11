package comportamiento.command.history;

import java.util.Stack;

import comportamiento.command.impl.Command;

public class CommandHistory {
	private Stack<Command> history = new Stack<>();

	public void push(Command c) {
		history.push(c);
	}

	public Command pop() {
		return history.pop();
	}

	public boolean isEmpty() {
		return history.isEmpty();
	}
}