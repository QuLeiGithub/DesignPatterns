package iterator.pojo;

import lombok.*;

/**
 * menu class
 *
 * @author QuLei
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MenuItem {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;
}
