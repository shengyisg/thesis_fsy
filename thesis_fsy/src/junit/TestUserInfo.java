package junit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.thesised.fsy.user.domain.UserInfo;

public class TestUserInfo {
	/**���Ա���*/
	@Test
	public void save(){
		Configuration configuration = new Configuration();
		configuration.configure();//����classpath�µ�hibernate.cfg.xml���ļ�
		SessionFactory sf = configuration.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		UserInfo me=new UserInfo();
		me.setFsyUser("12110031011");
		me.setFsyName("��ʤ��");
		me.setFsyPassword("12110031011");
		s.save(me);
		tr.commit();
		s.close();
	}
}
