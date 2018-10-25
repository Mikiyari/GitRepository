package dxh.notes.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dxh.notes.bean.Comments;
import dxh.notes.util.CommonService;

@Controller
public class CommentsController{

	@Autowired
	CommonService<Comments> commentsService;
	
	@RequestMapping("addComment")
	public String addComment(Comments t) {
		t.setCreatetime(new Date());
		commentsService.add(t);
		return "redirect:findComments";
	}

	@RequestMapping("deleteComment")
	public String deleteComment(Integer id) {
		commentsService.delete(id);
		return "redirect:findComments";
	}

	@RequestMapping("updateComment")
	public String updateComment(Comments t) {
		commentsService.update(t);
		return "redirect:findComments";
	}

	@RequestMapping("findComment")
	@ResponseBody
	public Comments findComment(Integer id) {
		return commentsService.find(id);
	}

	@RequestMapping("deleteComments")
	public String deleteComments(String ids) {
		if(ids.contains("-")) {
			List<Integer> idsInt = new ArrayList<>();
			String[] idsStr = ids.split("-");
			for(String id:idsStr) {
				idsInt.add(Integer.parseInt(id));
			}
			commentsService.deleteMany(idsInt);
		}else {
			Integer id = Integer.parseInt(ids);
			commentsService.delete(id);
		}
		return "redirect:findComments";
	}

	@RequestMapping("findComments")
	public String findComments(Model model) {
		List<Comments> comments = commentsService.findAll();
		model.addAttribute("comments", comments);
		return "comments/comments";
	}

}
