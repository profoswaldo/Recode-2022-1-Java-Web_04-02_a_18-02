package br.com.recode.exemplo04.repositories;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.recode.exemplo04.entities.Product;

@Component
public class ProductRepository {
	
	private Map<Long, Product> map = new HashMap<Long, Product>(); // gambiarra provisória
	
	public void save(Product obj) {
		map.put(obj.getId(), obj);
	}
	
    public Product findById(Long id) {
		return map.get(id);
	}

    public List<Product> findAll() {
		return new ArrayList<Product>(map.values());
	}

}
