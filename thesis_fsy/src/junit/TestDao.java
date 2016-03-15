package junit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thesised.fsy.user.dao.IUserInfoDao;
import com.thesised.fsy.user.domain.UserInfo;
import com.thesised.fsy.utils.MD5Util;

public class TestDao {
	/**����*/
	@Test
	public void save(){
		//����spring����
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IUserInfoDao UserInfoDao = (IUserInfoDao)ac.getBean(IUserInfoDao.SERVICE_NAME);
		
		UserInfo elecText = new UserInfo();
		elecText.setFsyUser("12110031011");
		elecText.setFsyAlterTime(new Date());
		elecText.setFsyName("��ʤ��");
		elecText.setFsyPassword(MD5Util.getMD5String("123456"));
		UserInfoDao.save(elecText);
		
	}
	
	@Test
	public void update(){
		//����spring����
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IUserInfoDao UserInfoDao = (IUserInfoDao)ac.getBean(IUserInfoDao.SERVICE_NAME);
		
		UserInfo user = UserInfoDao.findByUserId("402881ef53688618015368861a2d0001");
		user.setFsyAlterTime(new Date());
		user.setFsyGrade("���");
		user.setFsyDepartment("ѧϰ��");
		user.setFsyDepartmentStatus(1);
		user.setFsyPost("������");
		UserInfoDao.update(user);
		
	}
	
	@Test
	public void findByUserId(){
		//����spring����
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IUserInfoDao UserInfoDao = (IUserInfoDao)ac.getBean(IUserInfoDao.SERVICE_NAME);
		Serializable fsyId="402881ef53688618015368861a2d0001";
		
		UserInfo user=UserInfoDao.findByUserId(fsyId);
		System.out.println(user.getFsyName());
		
	}
	/*��������idɾ��*/
	@Test
	public void deleteObjectByIds(){
		//����spring����
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IUserInfoDao UserInfoDao = (IUserInfoDao)ac.getBean(IUserInfoDao.SERVICE_NAME);
//		Serializable [] fsyIds={"402880ed5309f52a015309f52cce0001",""};
		Serializable fsyId="4028869e5318e05d015318e05fc60001";
		UserInfoDao.deleteObjectByIds(fsyId);
		
	}
	
	/*ʹ�ü���ɾ��*/
	@Test
	public void deleteObjectByCollention(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IUserInfoDao UserInfoDao = (IUserInfoDao)ac.getBean(IUserInfoDao.SERVICE_NAME);
		
		UserInfo user1=new UserInfo();
		UserInfo user2=new UserInfo();
		UserInfo user3=new UserInfo();
		
		user1.setFsyId("4028869e5318e9b6015318e9b8b00001");
		user2.setFsyId("4028869e531e2ddc01531e2f796d0001");
		user3.setFsyId("4028869e531e4a7801531e4ab33a0001");
		List<UserInfo> list=new ArrayList<UserInfo>();
		 
		list.add(user1);
		list.add(user2);
		list.add(user3);
		
		UserInfoDao.deleteObjectByCollention(list);
		
	}
	
}
