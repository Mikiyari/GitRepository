package dxh.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dxh.notes.bean.Errornotes;
import dxh.notes.bean.ErrornotesExample;
import dxh.notes.dao.ErrornotesMapper;

@Service
public class ErrorNotesService {
	
	@Autowired
	ErrornotesMapper errornotesMapper;


	/**
	 * 增删改查
	 */
	public void addNote(Errornotes note) {
		errornotesMapper.insertSelective(note);
	}

	public void deleteNote(Integer id) {
		errornotesMapper.deleteByPrimaryKey(id);
	}

	public void updateNote(Errornotes note) {
		errornotesMapper.updateByPrimaryKeySelective(note);

	}

	public Errornotes findNote(Integer id) {
		Errornotes note = errornotesMapper.selectByPrimaryKey(id);
		return note;
	}

	public List<Errornotes> findNotes() {
		List<Errornotes> notes = errornotesMapper.selectByExample(null);
		return notes;
	}

	//这里是测试  不一定通过  结果 测试没有通过
	public void deleteNotes(List<Integer> ids) {
		ErrornotesExample errornotesExample = new ErrornotesExample();
		ErrornotesExample.Criteria criteria = errornotesExample.createCriteria();
		criteria.andIdIn(ids);
		errornotesMapper.deleteByExample(errornotesExample);
	}
}
