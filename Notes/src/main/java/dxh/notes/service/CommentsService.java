package dxh.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dxh.notes.bean.Comments;
import dxh.notes.bean.CommentsExample;
import dxh.notes.dao.CommentsMapper;

@Service
public class CommentsService {
	
	@Autowired
	CommentsMapper commentsMapper;
	
	public void add(Comments t) {
		commentsMapper.insertSelective(t);
	}

	public void delete(Integer id) {
		commentsMapper.deleteByPrimaryKey(id);
	}

	public void update(Comments t) {
		commentsMapper.updateByPrimaryKeySelective(t);
		
	}

	public Comments find(Integer id) {
		Comments comment = commentsMapper.selectByPrimaryKey(id);
		return comment;
	}

	public void deleteMany(List<Integer> ids) {
		CommentsExample commentsExample = new CommentsExample();
		CommentsExample.Criteria criteria = commentsExample.createCriteria();
		criteria.andIdIn(ids);
		commentsMapper.deleteByExample(commentsExample);
	}

	public List<Comments> findAll() {
		List<Comments> comments = commentsMapper.selectByExample(null);
		return comments;
	}

}
