package dxh.notes.util;

import java.util.List;

public interface CommonService<T> {

	public void add(T t);
	public void delete(Integer id);
	public void update(T t);
	public T find(Integer id);
	public void deleteMany(List<Integer> ids);
	public List<T> findAll();
}
