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
public class Data {
    
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<Result> results;
}
