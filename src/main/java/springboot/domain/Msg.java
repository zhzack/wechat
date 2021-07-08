package springboot.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * msg
 * @author 
 */
@Data
public class Msg implements Serializable {
    private Integer hq;

    private String cpid;

    private String cpname;

    private String speakerid;

    private String speaker;

    private String text;

    private String speakertype;

    private String type;

    private Integer time;

    private String model;

    private String engineer;

    private Integer status;

    private String processor;

    private Integer endtime;

    private static final long serialVersionUID = 1L;
}