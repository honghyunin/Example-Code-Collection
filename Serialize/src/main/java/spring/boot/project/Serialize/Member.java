package spring.boot.project.Serialize;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Member implements Serializable {
    private final static Long serialVersionUID = 1L;
    private String name;
    private String id;
    private Long idx;
    private Etc etc;
    private Something something;

}
