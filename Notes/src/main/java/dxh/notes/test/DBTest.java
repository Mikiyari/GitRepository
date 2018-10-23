package dxh.notes.test;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dxh.notes.bean.Errornotes;
import dxh.notes.bean.Studynotes;
import dxh.notes.bean.User;
import dxh.notes.dao.ErrornotesMapper;
import dxh.notes.dao.StudynotesMapper;
import dxh.notes.dao.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class DBTest {

	@Autowired
	SqlSession sqlsession;

	@Autowired
	UserMapper userMapper;

	@Autowired
	StudynotesMapper studynotesMapper;
	
	@Autowired
	ErrornotesMapper  errornotesMapper;

	@Test
	public void CRUDTest() {
		userMapper = sqlsession.getMapper(UserMapper.class);
		for (int i = 0; i < 20; i++) {
			String username = "";
			String nickname = "";
			String realname = "";
			for (int j = 0; j < 10; j++) {
				char c = (char) ((Math.random() * 26) + 97);
				username += (c + "");
			}
			for (int j = 0; j < 10; j++) {
				char c = (char) ((Math.random() * 26) + 97);
				nickname += (c + "");
			}
			for (int j = 0; j < 10; j++) {
				char c = (char) ((Math.random() * 26) + 97);
				realname += (c + "");
			}
			int pwd = (int) (Math.random() * 1000000);
			int age = (int) (Math.random() * 40);
			String gender = "";
			if (age > 17 && age < 29) {
				gender = "女";
			} else {
				gender = "男";
			}
			String password = String.valueOf(pwd);
			userMapper.insertSelective(new User(username, password, nickname, realname, gender, Integer.valueOf(age),
					"山西农业大学", new Date()));
			username = "";
			nickname = "";
			realname = "";
		}
	}

	@Test
	public void StudyNotesTest() {
		studynotesMapper = sqlsession.getMapper(StudynotesMapper.class);
		for (int i = 0; i < 20; i++) {
			String title = "";
			String content = "";
			for (int j = 0; j < 10; j++) {
				char c = (char) ((Math.random() * 26) + 97);
				title += (c + "");
			}
			for (int j = 0; j < 50; j++) {
				char c = (char) ((Math.random() * 26) + 97);
				content += (c + "");
			}
			studynotesMapper.insert(new Studynotes(title, content, new Date(), 1));
			title = "";
			content = "";
		}
		List<Studynotes> notes = studynotesMapper.selectByExample(null);
		for(Studynotes note:notes) {
			System.out.println(note);
		}
	}
	
	@Test
	public void ErrorNotesTest() {
		errornotesMapper = sqlsession.getMapper(ErrornotesMapper.class);
		for (int i = 0; i < 20; i++) {
			String title = "";
			String content = "";
			for (int j = 0; j < 10; j++) {
				char c = (char) ((Math.random() * 26) + 97);
				title += (c + "");
			}
			for (int j = 0; j < 50; j++) {
				char c = (char) ((Math.random() * 26) + 97);
				content += (c + "");
			}
			errornotesMapper.insert(new Errornotes(title, content, new Date(), 1));
			title = "";
			content = "";
		}
		List<Errornotes> notes = errornotesMapper.selectByExample(null);
		for(Errornotes note:notes) {
			System.out.println(note);
		}
	}

}