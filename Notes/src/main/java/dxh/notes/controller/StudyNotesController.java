package dxh.notes.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dxh.notes.bean.Studynotes;
import dxh.notes.service.StudyNotesService;

@Controller
public class StudyNotesController {
	@Autowired
	StudyNotesService	studyNotesService;
	
	@RequestMapping("/addStudyNote")
	public String addStudyNote(Studynotes studynote) {
		studynote.setCreatetime(new Date());
		studyNotesService.addNote(studynote);
		return "redirect:/findStudyNotes";
	}
	
	@RequestMapping("/deleteStudyNote")
	public String deleteStudyNote(Integer id) {
		studyNotesService.deleteNote(id);
		return "redirect:/findStudyNotes";
	}
	
	@RequestMapping("/updateStudyNote")
	public String updateStudyNote(Studynotes user) {
		studyNotesService.updateNote(user);
		return "redirect:/findStudyNotes";
	}

	@RequestMapping("/findStudyNote")
	@ResponseBody
	public Studynotes findStudyNote(Integer id) {
		Studynotes note = studyNotesService.findNote(id);
		return note;
	}
	
	@RequestMapping("/findStudyNotes")
	public String findStudyNotes(Model model) {
		List<Studynotes> notes = studyNotesService.findNotes();
		model.addAttribute("notes", notes);
		return "notes/studynotes";
	}	
	
	@RequestMapping("/deleteStudyNotes")
	public String deleteStudyNotes(String ids) {
		if(ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			for(String str:str_ids) {
				del_ids.add(Integer.parseInt(str));
			}
			studyNotesService.deleteNotes(del_ids);
		}else {
			Integer i = Integer.parseInt(ids);
			studyNotesService.deleteNote(i);
		}
		return "redirect:/findStudyNotes";
	}
	
}
