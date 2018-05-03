package ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import ssh.serviceImpl.UserManagerImpl;
import ssh.vo.UserForm;

public class Register extends ActionSupport {
    private UserForm userForm;
    private UserManagerImpl userManager;

    public UserForm getUserForm() {
        return userForm;
    }

    public void setUserForm(UserForm userForm) {
        this.userForm = userForm;
    }

    public void setUserManager(UserManagerImpl userManager) {
        this.userManager = userManager;
    }

    public String execute() {
        try {
            userManager.regUser(userForm);
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }
}