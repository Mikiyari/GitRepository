package dxh.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dxh.notes.bean.Studynotes;
import dxh.notes.bean.StudynotesExample;
import dxh.notes.dao.StudynotesMapper;

@Service
public class StudyNotesService {
	@Autowired
	StudynotesMapper studynotesMapper;
	
	public void addNote(Studynotes note) {
		studynotesMapper.insertSelective(note);
	}

	public void deleteNote(Integer id) {
		studynotesMapper.deleteByPrimaryKey(id);
	}

	public void updateNote(Studynotes note) {
		studynotesMapper.updateByPrimaryKeySelective(note);
	}

	public Studynotes findNote(Integer id) {
		Studynotes notes = studynotesMapper.selectByPrimaryKey(id);
		return notes;
	}

	public List<Studynotes> findNotes() {
		List<Studynotes> notes = studynotesMapper.selectByExample(null) ;
		return notes;
	}

	public void deleteNotes(List<Integer> ids) {
		StudynotesExample studynotesExample = new StudynotesExample();
		StudynotesExample.Criteria criteria = studynotesExample.createCriteria();
		criteria.andIdIn(ids);
		studynotesMapper.deleteByExample(studynotesExample);
	}

	public List<Studynotes> findNotesByUserId(Integer id) {
		StudynotesExample example = new StudynotesExample();
		StudynotesExample.Criteria criteria = example.createCriteria();
		criteria.andAuthorEqualTo(id);
		List<Studynotes> notes = studynotesMapper.selectByExample(example);
		return notes;
	}
}
