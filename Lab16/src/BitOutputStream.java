import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class BitOutputStream {
	private PrintWriter outputStream;

	public BitOutputStream(String file) {
		try {
			outputStream = new PrintWriter(new FileOutputStream(file));
		} catch (IOException e) {
			throw new RuntimeException(e.toString());
		}
	}

	public void write(int n) {
		if (n == 1) {
			outputStream.write('1');
		} else {
			outputStream.write('0');
		}
	}

	public void writeln() {
		outputStream.write("\r\n");
	}

	// post: input is closed
	public void close() {
		outputStream.close();
	}

	// included to ensure that the stream is closed
	protected void finalize() {
		close();
	}
}
