package campingceria.master.service;

import java.util.List;

public abstract interface CommonService<T> {
	
	public abstract T selectOne(T paramT);
	
	public abstract List<T> selectList(T paramT);

}
