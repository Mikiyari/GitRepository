package dxh.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dxh.notes.bean.Comments;
import dxh.notes.bean.CommentsExample;
import dxh.notes.dao.CommentsMapper;
import dxh.notes.util.CommonService;

@Service
public class CommentsService implements CommonService<Comments>{
	
	@Autowired
	CommentsMapper commentsMapper;
	
	@Override
	public void add(Comments t) {
		commentsMapper.insertSelective(t);
	}

	@Override
	public void delete(Integer id) {
		commentsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Comments t) {
		commentsMapper.updateByPrimaryKeySelective(t);
		
	}

	@Override
	public Comments find(Integer id) {
		Comments comment = commentsMapper.selectByPrimaryKey(id);
		return comment;
	}

	@Override
	public void deleteMany(List<Integer> ids) {
		CommentsExample commentsExample = new CommentsExample();
		CommentsExample.Criteria criteria = commentsExample.createCriteria();
		criteria.andIdIn(ids);
		commentsMapper.deleteByExample(commentsExample);
	}

	@Override
	public List<Comments> findAll() {
		List<Comments> comments = commentsMapper.selectByExample(null);
		return comments;
	}

}
