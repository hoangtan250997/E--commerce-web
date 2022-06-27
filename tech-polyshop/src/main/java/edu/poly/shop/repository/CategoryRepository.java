package edu.poly.shop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import edu.poly.shop.domain.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	List<Category> findByNameContaining(String name);
	Page<Category> findByNameContaining(String name,Pageable pageable );
}
