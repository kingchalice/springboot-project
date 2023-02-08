package generate;

import lombok.Data;

import java.io.Serializable;

/**
 * demo
 * @author 
 */
@Data
public class Demo implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    private static final long serialVersionUID = 1L;
}