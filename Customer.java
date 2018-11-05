package customer;
//import java.util.Date;;

public class Customer implements Comparable<Customer> {
		//class variables
		private int id;
		private String name;
		private String email;
		private int dob;
		private String city;
		
		//getters & setters
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getDob() {
			return dob;
		}
		public void setDob(int dob) {
			this.dob = dob;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		//default constructor
		public Customer() {
			super();
		}
		
		//parameterized constructor
		public Customer(int id, String name, String email, int dob, String city) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.dob = dob;
			this.city = city;
		}
		
		@Override
		public int compareTo(Customer c2) {
		// TODO Auto-generated method stub
			int compareInt = this.name.compareTo(c2.name);
			if (compareInt < 0) //this.name bigger than c2.name alphabetically
			{
				return -1;
			} else if(compareInt > 0) //this.name smaller than c2.name alphabetically
			{
				return 1;
			}
		return 0; //this.name and c2.name are equal alphabetically
		}
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return "id: " + id + " name: " + name + " email: " +email + " DOB: " + dob + " city: " + city;
		}
		
		@Override
		public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
		}
}
