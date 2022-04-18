public interface IBaseRate {
	
	// Returns the interest rate based on this method
	default double getBaseRate() {
		return 2.5;
	}
}