package dxh.notes.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dxh.notes.bean.Studyplans;
import dxh.notes.service.StudyPlansService;

@Controller
public class StudyPlansController {

	@Autowired
	StudyPlansService studyPlansService;
	
	
	@RequestMapping("addStudyPlan")
	public String addStudyPlan(Studyplans plan) {
		plan.setCreatetime(new Date());
		studyPlansService.addPlan(plan);
		return "redirect:findStudyPlans";
	}
	@RequestMapping("deleteStudyPlan")
	public String deleteStudyPlan(Integer id) {
		studyPlansService.deletePlan(id);
		return "redirect:findStudyPlans";
	}
	@RequestMapping("updateStudyPlan")
	public String updateStudyPlan(Studyplans plan) {
		studyPlansService.updatePlan(plan);
		return "redirect:findStudyPlans";
	}
	@RequestMapping("findStudyPlan")
	@ResponseBody
	public Studyplans findStudyPlan(Integer id) {
		Studyplans plan = studyPlansService.findPlan(id);
		return plan;
	}
	@RequestMapping("deleteStudyPlans")
	public String deleteStudyPlans(String ids) {
		if(ids.contains("-")) {
			String[] strids = ids.split("-");
			List<Integer> intids = new ArrayList<>();
			for(String id:strids) {
				intids.add(Integer.parseInt(id));
			}
			studyPlansService.deletePlans(intids);
		}else {
			Integer id = Integer.parseInt(ids);
			studyPlansService.deletePlan(id);
		}
		return "redirect:findStudyPlans";
	}
	@RequestMapping("findStudyPlans")
	public String findStudyPlans(Model model) {
		List<Studyplans> plans = studyPlansService.findPlans();
		model.addAttribute("plans", plans);
		return "notes/studyplans";
	}
	
}
