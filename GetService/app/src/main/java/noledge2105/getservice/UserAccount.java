package noledge2105.getservice;


import java.io.Serializable;

/**
 * @Description : Class User
 *              : Also every subclass contain getAccountPermissionLevel, 2 = HomeOwner, 1 = ServiceProvider, 0 = Admin
 * @author      : Group ##
 */
@SuppressWarnings("serial")
public class UserAccount implements Serializable {


    private String userID, userName, password, firstName, lastName, dateOfBirth, phoneNumber;
    private int permLevel ;



    /**
     * Default constructor
     */
    public UserAccount(){
        this.userName = "";
        this.password = "";
        this.firstName = "";
        this.lastName = "";
        this.dateOfBirth = "";
        this.phoneNumber = "";
		this.permLevel = -1;
		this.userID = "";
    }

    /**
     * Constructor taking Username, ID, userLevel
     * @param userName String
     * @param ID int
     * @param password string
     */
    public UserAccount(String userName,
                       String ID,
                       String password,
                       String firstName,
                       String lastName,
                       String dateOfBirth,
					   String phoneNumber,
					   int permLevel){
        this.userName = userName;
        this.userID = ID;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
		this.permLevel = permLevel;
    }

    /**
     * Constructor taking himself as param.
     * @param ua
     */
    public UserAccount(UserAccount ua){
        this.userName = ua.getUserName();
        this.password = ua.getPassword();
        this.userID = ua.getUserID();
        this.firstName = ua.getFirstName();
        this.lastName = ua.getLastName();
        this.dateOfBirth = ua.getDateOfBirth();
        this.phoneNumber = ua.getPhoneNumber();
		this.permLevel = ua.getPermLevel();
    }
    /**
     * ========================================== GETTERS ==========================================
     */

    /**
     * Return the user password
     * @return String
     */
    public String getUserName(){
        return this.userName;
    }

    /**
     * return the password, might remove it because it is very sensitive data
     * @return String
     */
    public String getPassword(){
        return this.password;
    }

    /**
     * return the ID
     * @return Int
     */
    public String getUserID(){
        return this.userID;
    }

    /**
     * Return the first name of the user
     * @return string
     */
    public String getFirstName(){
        return(this.firstName);
    }

    /**
     * Return the last name of the user
     * @return string
     */
    public String getLastName(){
        return(this.lastName);
    }

    /**
     * Return the name of the user
     * @return string
     */
    public String getDateOfBirth(){
        return(this.dateOfBirth);
    }

	public int getPermLevel(){
		return(this.permLevel);
	}

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * ========================================== SETTERS ==========================================
     * This class is about setter, but theses setter are made from the database
     */
    /**
     * Set username (string)
     * @param userName String
     */
    public void setUserName(String userName){
        this.userName = userName;
    }

    /**
     * Set password (string)
     * @param password String
     */

    public void setPassword(String password){
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setUserID(String id){
        this.userID = id;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPermLevel(int permLevel){
		this.permLevel = permLevel;
	}


}
