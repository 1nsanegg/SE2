package to_dos.factory;

// Creating the Health class that extends Course abstract class 
class Health extends Course {
	// TO-DO: Implement getDuration() method: set a specific duration and print value
	private static final String courseName = "Health";
	private int duration;
	private double feePerSemester;

	public int getDuration() {
		return duration;
	}

	// TO-DO: Implement getFeePerSemester() method: set a specific fee and print value
	public double getFeePerSemester() {
		return feePerSemester;
	}
}// end of Health class.