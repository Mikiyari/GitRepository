package dxh.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dxh.notes.bean.Studyquestions;
import dxh.notes.bean.StudyquestionsExample;
import dxh.notes.dao.StudyquestionsMapper;

@Service
public class QuestionsService {

	@Autowired
	StudyquestionsMapper studyquestionsMapper;

	public void addQuestion(Studyquestions studyquestions) {
		studyquestionsMapper.insertSelective(studyquestions);
	}

	public void deleteQuestion(Integer id) {
		studyquestionsMapper.deleteByPrimaryKey(id);
	}

	public void updateQuestion(Studyquestions studyquestions) {
		studyquestionsMapper.updateByPrimaryKeySelective(studyquestions);
	}

	public Studyquestions findQuestion(Integer id) {
		Studyquestions studyquestions = studyquestionsMapper.selectByPrimaryKey(id);
		return studyquestions;
	}

	public void deleteQuestions(List<Integer> ids) {
		StudyquestionsExample example = new StudyquestionsExample();
		StudyquestionsExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		studyquestionsMapper.deleteByExample(example);
	}

	public List<Studyquestions> findQuestions() {
		List<Studyquestions> questions = studyquestionsMapper.selectByExample(null);
		return questions;
	}
}
