/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ge.vako.testrestapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author vako
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
     
    @ApiModelProperty(value="this is the first name", required = true)
    private String firstname;
    @ApiModelProperty(required = false)
    private String lastname;
    
    @JsonProperty("customer_url")
    private String customerUrl;
}