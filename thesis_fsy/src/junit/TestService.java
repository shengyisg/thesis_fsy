package junit;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thesised.fsy.user.dao.IUserInfoDao;
import com.thesised.fsy.user.domain.UserInfo;
import com.thesised.fsy.user.service.IUserInfoService;

public class TestService {
	/**����*/
	@Test
	public void save(){
		//����spring����
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IUserInfoService userInfoService = (IUserInfoService)ac.getBean(IUserInfoService.SERVICE_NAME);
		
		UserInfo elecText = new UserInfo();
		elecText.setFsyUser("12110031002");
		elecText.setFsyAlterTime(new Date());
		elecText.setFsyName("����Service2��ע");
		elecText.setFsyPassword("123456");
		userInfoService.saveUserInfo(elecText);
		
	}
	
	/*�ײ㷽����ָ����ѯ�������ؽ������*/
	@Test
	public void findListByCondition(){
		//����spring����
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IUserInfoService userInfoService = (IUserInfoService)ac.getBean(IUserInfoService.SERVICE_NAME);	
		
		UserInfo user=new UserInfo();
		
		user.setFsyUser("121100");
		
		List<UserInfo> list=userInfoService.findListByCondition(user);
		
		if(list!=null&&list.size()>0){
			for (UserInfo entity:list) {
				System.out.println(entity.getFsyName());
			}
		}
		
	}
	
}
