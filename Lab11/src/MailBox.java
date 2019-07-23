
public class MailBox {

	private Mail[] mails;
	private int count;

	public MailBox(int size) {
		mails = new Mail[size];
		count = 0;
	}

	public void addMail(Mail m) {
		mails[count] = m;
		count++;
	}

	public double postage() {
		double sum = 0;
		for (int i = 0; i < count; i++) {
			sum += mails[i].normalPostageRate();
		}
		return sum;
	}

	public double postageRate() {
		for (int i = 0; i < count; i++) {
			return mails[i].postageRate();
		}
		return 0;
	}

	public int invalidMail() {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			if (mails[i].valid()) {
				sum++;
			}
		}
		return sum;
	}

	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.println(mails[i]);
		}
	}
}
