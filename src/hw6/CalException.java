package hw6;

public class CalException extends Exception {

	public CalException() {

	}

	public CalException(String msg) {
		super(msg);
	}

	public String toString() {
		return getMessage(); // 返回自訂義的訊息
	}
}
