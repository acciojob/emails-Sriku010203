package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        if(oldPassword==getPassword(){
            if(newPassword.length()<8){
                System.out.println("It must contain at least 8 characters");
                return;
            }
            int cnt_up=0;
            int cnt_down=0;
            int cnt_dig=0;
            int cnt_spe=0;
            for(int i=0;i<newPassword.length();i++){
                if(newPassword.charAt(i)>='A' && newPassword.charAt(i)<='Z'){
                    cnt_up++;
                }
                else if(newPassword.charAt(i)>='a' && newPassword.charAt(i)<='z'){
                    cnt_down++;
                }
                else if(newPassword.charAt(i)>='1' && newPassword.charAt(i)<='9'){
                    cnt_dig++;
                }
                else{
                    cnt_spe++;
                } 
            }
            if(cnt_up>0 && cnt_down>0 && cnt_dig>0 && cnt_spe>0){
                password=newPassword;
                return;
            }
            else{
                System.out.println("Password doesn't meet the requirements");
                return;
            }
        }
        else{
            Sysyem.out.println("Please enter the correct credentials");
        }
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
    }
}
