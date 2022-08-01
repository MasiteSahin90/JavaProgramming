package Oscar;

public class Credentials {

    public String email = "oscar@cydeo.com";
    private String userName = "Scolfield";
    private String password = "Cydeo123";

    public String getUserName(String emailInput){
        if(emailInput.equalsIgnoreCase(email)) {
            return userName;
        }
        return "condition has not been satisfied";

    }


    public String getPassword(String emailInput , String userNameInput){
        if (emailInput.equalsIgnoreCase(email) && userNameInput.equalsIgnoreCase(userName)){
            return this.password;
        }
        return "condition has not been satisfied";
    }

    public void setPassword(String newPassword){
        if (true){
            this.password = newPassword;
            System.exit(-1);
        }
    }







}
