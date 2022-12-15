/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ge.vako.testrestapi.repositories;

import ge.vako.testrestapi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author vako
 */
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    
}
