package org.jt.springblog;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Student {
    private String name;
    private String enrollmentDate;
    private String course;
    private double fees;

}
