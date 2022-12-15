/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ge.vako.testrestapi.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author vako
 */
@Data
@AllArgsConstructor
public class CatorgoryListDTO {

    List<CategoryDTO> categories;

}