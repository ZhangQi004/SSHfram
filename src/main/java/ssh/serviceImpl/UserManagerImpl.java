package ssh.serviceImpl;

import ssh.beans.User;
import ssh.daoImpl.UserDao;
import ssh.service.UserManager;
import ssh.vo.UserForm;
import org.springframework.beans.BeanUtils;

public class UserManagerImpl implements UserManager {
  private UserDao baseDao;
    public void regUser(UserForm userForm) {
      User user=new User();
      BeanUtils.copyProperties(userForm,user);
      baseDao.save(user);
    }

  public void setBaseDao(UserDao baseDao) {
      this.baseDao=baseDao;
  }
}
