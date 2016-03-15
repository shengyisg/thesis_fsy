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
	/**保存*/
	@Test
	public void save(){
		//加载spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IUserInfoService userInfoService = (IUserInfoService)ac.getBean(IUserInfoService.SERVICE_NAME);
		
		UserInfo elecText = new UserInfo();
		elecText.setFsyUser("12110031002");
		elecText.setFsyAlterTime(new Date());
		elecText.setFsyName("测试Service2备注");
		elecText.setFsyPassword("123456");
		userInfoService.saveUserInfo(elecText);
		
	}
	
	/*底层方法，指定查询条件返回结果类型*/
	@Test
	public void findListByCondition(){
		//加载spring容器
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
