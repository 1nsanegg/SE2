package to_dos.builder;

import java.util.Optional;

//Create the Student class with a static nested (inner class)
public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;

	//TO-DO: Implement the constructor
	public Student(StudentBuilder studentBuilder) {

	}

	public Student(int id, String firstName, String lastName, int age, String phone, String address) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	//TO-DO: Implement GETTERs & SETTERs for given attributes
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	//TO-DO: Implement toString() method to display student's information


	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				'}';
	}

	// Create the StudentBuilder inner class
	public static class StudentBuilder {
		//TO-DO: Initialize the similar attributes with Student class
		private int id;
		private String firstName;
		private String lastName;
		private Optional<Integer> age;
		private Optional<String> phone;
		private Optional<String> address;

		//TO-DO: Implement the constructor


		public StudentBuilder() {
		}

		public StudentBuilder(int id, String firstName, String lastName) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}



		//TO-DO: Implement the 3 below methods
		public StudentBuilder withOptionalAge(int age) {
			if (age > 0) {
				this.age = Optional.of(age);
			} else {
				this.age = Optional.empty();
			}
			return this;
		}

		public StudentBuilder withOptionalPhone(String phone) {
			if (phone == null) {
				this.phone = Optional.empty();
			} else {
				this.phone = Optional.of(phone);
			}
			return this;
		}

		public StudentBuilder withOptionalAddress(String address) {
			if (address == null) {
				this.address = Optional.empty();
			}
			else {
				this.address = Optional.of(address);
			}
			return this;
		}

		public Student buildStudent() {
			validateStudentData();
			return new Student(this);
		}


		private boolean validateStudentData() {
			// Validation process, check if student is registered in the database
			return false;
		}
	}
}
