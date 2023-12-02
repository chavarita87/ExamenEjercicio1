/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developer.marvel.com.dto;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ND
 */
@Getter
@Setter
public class Root {
    private Integer code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private String etag;
    private Data data;
}
