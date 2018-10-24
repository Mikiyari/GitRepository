package dxh.notes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dxh.notes.bean.Studyquestions;
import dxh.notes.service.QuestionsService;

@Controller
public class QuestionsController {

	@Autowired
	QuestionsService questionsService;
	
	@RequestMapping("addStudyQuestion")
	public String addStudyQuestion(Studyquestions studyquestions) {
		questionsService.addQuestion(studyquestions);
		return "redirect:findStudyQuestions";
	}
	
	@RequestMapping("deleteStudyQuestion")
	public String deleteStudyQuestion(Integer id) {
		questionsService.deleteQuestion(id);
		return "redirect:findStudyQuestions";
	}
	
	@RequestMapping("updateStudyQuestion")
	public String updateStudyQuestion(Studyquestions studyquestions) {
		questionsService.updateQuestion(studyquestions);
		return "redirect:findStudyQuestions";
	}
	
	@RequestMapping("findStudyQuestion")
	@ResponseBody
	public Studyquestions findStudyQuestion(Integer id) {
		Studyquestions studyquestions = questionsService.findQuestion(id);
		return studyquestions;
	}
	
	@RequestMapping("deleteStudyQuestions")
	public String deleteStudyQuestions(String ids) {
		if(ids.contains("-")) {
			List<Integer> idsInt = new ArrayList<>();
			String[] idsStr = ids.split("-");
			for(String id:idsStr) {
				idsInt.add(Integer.parseInt(id));
			}
			questionsService.deleteQuestions(idsInt);
		}else {
			Integer id = Integer.parseInt(ids);
			questionsService.deleteQuestion(id);
		}
		return "redirect:findStudyQuestions";
	}
	
	@RequestMapping("findStudyQuestions")
	public String findStudyQuestions(Model model) {
		List<Studyquestions> questions = questionsService.findQuestions();
		model.addAttribute("questions", questions);
		return "notes/questions"; 
	}
	
	
}
