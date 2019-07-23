
abstract public class PayCalculator {
	private double payRate;

	public double computePay(int hours) {
		return payRate * hours;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	
	public class RegularPay extends PayCalculator{

		public RegularPay(double payRate) {
			this.setPayRate(payRate);
		}
		
	}
	
	class HazardPay	extends PayCalculator{
		public HazardPay(double payRate) {
			this.setPayRate(payRate);
		}
		public double computePay(int hours) {
			return super.computePay(hours) * 1.5;
		}
	}
}
