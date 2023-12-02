/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developer.marvel.com.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ND
 */
@Getter
@Setter
public class Events {

    private Integer available;
    private String collectionURI;
    private List<Item> items;
    private Integer returned;
}
