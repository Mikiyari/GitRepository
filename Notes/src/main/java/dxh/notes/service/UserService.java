package dxh.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dxh.notes.bean.User;
import dxh.notes.bean.UserExample;
import dxh.notes.dao.UserMapper;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;

	public void addUser(User user) {
		userMapper.insertSelective(user);
	}

	public void deleteUser(Integer id) {
		userMapper.deleteByPrimaryKey(id);
	}

	public void updateUser(User user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

	public User findUser(Integer id) {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}

	public List<User> findUsers() {
		List<User> users = userMapper.selectByExample(null) ;
		return users;
	}

	public void deleteUsers(List<Integer> ids) {
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andIdIn(ids);
		userMapper.deleteByExample(userExample);
	}

	public User isHasUser(User user) {
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
		List<User> users = userMapper.selectByExample(userExample);
		return users.get(0);
	}
}
