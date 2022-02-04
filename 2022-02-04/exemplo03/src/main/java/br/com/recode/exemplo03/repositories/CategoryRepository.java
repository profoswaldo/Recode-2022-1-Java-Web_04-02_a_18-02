package br.com.recode.exemplo03.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.recode.exemplo03.entities.Category;

@Component
public class CategoryRepository {
	
	private Map<Long, Category> map = new HashMap<Long, Category>(); // gambiarra provisória
	
	public void save(Category obj) {
		map.put(obj.getId(), obj);
	}
	
    public Category findById(Long id) {
		return map.get(id);
	}

    public List<Category> findAll() {
		return new ArrayList<Category>(map.values());
	}

}
