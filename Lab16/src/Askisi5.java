public class Askisi5 {
	public static void main(String[] args) {
		String FileName = "numbersBinFile.bin";
		BitInputStream BIS;
		BitOutputStream BOS;
		try {
			BIS = new BitInputStream(FileName);
			BOS = new BitOutputStream("numbersBitBitFile.txt");
			int n;
			int count = 0;
			while ((n = BIS.readBit()) != -1) {
				BOS.write(n);
				count++;
				if (count == 8) {
					BOS.writeln();
					count = 0;
				}
			}
			System.out.println("Congratulations!");
			BIS.close();
			BOS.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
