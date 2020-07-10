package pl.coderslab.charity.category;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
