package qaf.practice.beans;



	import com.qmetry.qaf.automation.data.BaseDataBean;
import com.qmetry.qaf.automation.util.RandomStringGenerator.RandomizerTypes;
import com.qmetry.qaf.automation.util.Randomizer;

	public class UserDetails  extends BaseDataBean {
		
		@Randomizer(length=20,type=RandomizerTypes.LETTERS_ONLY)
	    private String fName;
		@Randomizer(length=20,type=RandomizerTypes.LETTERS_ONLY)
	    private String lName;
		@Randomizer(length=10,type=RandomizerTypes.DIGITS_ONLY)
	    private String phone;
		@Randomizer(suffix=".com",type=RandomizerTypes.MIXED)
	    private String email;
		@Randomizer(length=20)
	    private String address1;
		@Randomizer(length=20)
	    private String address2;
		@Randomizer(length=20)
	    private String city;
		@Randomizer(length=20)
	    private String state;
		@Randomizer(type=RandomizerTypes.DIGITS_ONLY)
	    private String postal;
		@Randomizer(length=20)
	    private String country;
		@Randomizer(length=20)
	    private String username;
		@Randomizer(length=20)
	    private String password;
		@Randomizer(length=20)
	    private String cpassword;

	    public String getCpassword() {
			return cpassword;
		}

		public void setCpassword(String cpassword) {
			this.cpassword = cpassword;
		}

		public String getPhone() {
			return phone;
		}

		public String getfName() {
			return fName;
		}

		public void setfName(String fName) {
			this.fName = fName;
		}

		public String getlName() {
			return lName;
		}

		public void setlName(String lName) {
			this.lName = lName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress1() {
			return address1;
		}

		public void setAddress1(String address1) {
			this.address1 = address1;
		}

		public String getAddress2() {
			return address2;
		}

		public void setAddress2(String address2) {
			this.address2 = address2;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPostal() {
			return postal;
		}

		public void setPostal(String postal) {
			this.postal = postal;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		

		

	}
