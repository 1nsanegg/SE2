package to_dos.factory;

// Create the CivilService class that extends Course abstract class 
class CivilService extends Course {
	// TO-DO: Implement getDuration() method: set a specific duration and print value
	private static final String courseName = "CivilService";
	private int duration;
	private int feePerSemester;

	public int getDuration() {
		return duration;
	}

	// TO-DO: Implement getFeePerSemester() method: set a specific fee and print value
	public double getFeePerSemester() {
		return feePerSemester;
	}
}