package dxh.notes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dxh.notes.bean.Errornotes;
import dxh.notes.service.ErrorNotesService;

@Controller
public class ErrorNotesController {

	@Autowired
	ErrorNotesService errornotesService;
	
	@RequestMapping("addErrorNote")
	public String addErrorNote(Errornotes note) {
		errornotesService.addNote(note);
		return "redirect:/findErrorNotes";
	}
	
	@RequestMapping("deleteErrorNote")
	public String deleteErrorNote(Integer id) {
		errornotesService.deleteNote(id);
		return "redirect:/findErrorNotes";
	}
	
	@RequestMapping("updateErrorNote")
	public String updateErrorNote(Errornotes note) {
		errornotesService.updateNote(note);
		return "redirect:/findErrorNotes";
	}
	
	@RequestMapping("findErrorNote")
	@ResponseBody
	public Errornotes findErrorNote(Integer id) {
		Errornotes note = errornotesService.findNote(id);
		return note;
	}
	
	@RequestMapping("findErrorNotes")
	public String findErrorNotes() {
		return "notes/errornotes";
	}
	
	@RequestMapping("deleteErrorNotes")
	public String deleteErrorNotes(String ids) {
		if(ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] ida = ids.split("-");
			for(String str:ida) {
				del_ids.add(Integer.parseInt(str));
			}
			errornotesService.deleteNotes(del_ids);
		}else {
			Integer id = Integer.parseInt(ids);
			errornotesService.deleteNote(id);
		}
		return "redirect:/findErrorNotes";
	}
}
