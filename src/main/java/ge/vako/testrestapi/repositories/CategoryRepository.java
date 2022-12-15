/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ge.vako.testrestapi.repositories;

import ge.vako.testrestapi.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author vako
 */
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByName(String name);
}
