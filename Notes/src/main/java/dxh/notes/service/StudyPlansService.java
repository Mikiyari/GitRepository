package dxh.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dxh.notes.bean.Studyplans;
import dxh.notes.bean.StudyplansExample;
import dxh.notes.dao.StudyplansMapper;

@Service
public class StudyPlansService {

	@Autowired
	StudyplansMapper studyplansMapper;

	public void addPlan(Studyplans plan) {
		studyplansMapper.insertSelective(plan);
	}

	public void deletePlan(Integer id) {
		studyplansMapper.deleteByPrimaryKey(id);
	}

	public void updatePlan(Studyplans plan) {
		studyplansMapper.updateByPrimaryKeySelective(plan);
	}

	public Studyplans findPlan(Integer id) {
		Studyplans plan = studyplansMapper.selectByPrimaryKey(id);
		return plan;
	}

	public void deletePlans(List<Integer> ids) {
		StudyplansExample studyplansExample = new StudyplansExample();
		StudyplansExample.Criteria criteria = studyplansExample.createCriteria();
		criteria.andIdIn(ids);
		studyplansMapper.deleteByExample(studyplansExample);
	}

	public List<Studyplans> findPlans() {
		List<Studyplans> plans = studyplansMapper.selectByExample(null);
		return plans;
	}

}
