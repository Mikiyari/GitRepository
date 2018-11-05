package dxh.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dxh.notes.bean.Manager;
import dxh.notes.bean.ManagerExample;
import dxh.notes.dao.ManagerMapper;

@Service
public class ManagerService {

	@Autowired
	ManagerMapper managerMapper;
	
	public Manager ishasManager(String username,String password) {
		ManagerExample managerExample = new ManagerExample();
		ManagerExample.Criteria criteria = managerExample.createCriteria();
		criteria.andUsernameEqualTo(username).andPasswordEqualTo(password);
		List<Manager> managers = managerMapper.selectByExample(managerExample);
		if(managers!=null) {
			return managers.get(0);
		}else {
			return null;
		}
	}
	
}
