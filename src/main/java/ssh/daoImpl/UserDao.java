package ssh.daoImpl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import ssh.dao.BaseDao;

public class UserDao extends HibernateDaoSupport implements BaseDao {
    public void save(Object obj) {
        this.getHibernateTemplate().save(obj);
    }
}
