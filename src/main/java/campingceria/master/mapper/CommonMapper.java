package campingceria.master.mapper;

import java.util.List;

public abstract interface CommonMapper<T> {
	
	public abstract T selectOne(T paramT);
	
	public abstract List<T> selectList(T paramT);

}
