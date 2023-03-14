package sem5.model;

import java.util.regex.Pattern;

public class ValidateUser {
    private Pattern patternName = Pattern.compile("^\\S*$");
    private Pattern patternPhone = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");

    public void check(User user) throws Exception {
        if (!patternName.matcher(user.getFirstName()).find()){
            throw new Exception("invalid first name");
        }
        if (!patternName.matcher(user.getLastName()).find()){
            throw new Exception("invalid last name");
        }
        if (!patternPhone.matcher(user.getPhone()).find()){
            throw new Exception("invalid Phone");
        }
    }
    public boolean checkPhone(String phone){
        return patternPhone.matcher(phone).find();
    }
}