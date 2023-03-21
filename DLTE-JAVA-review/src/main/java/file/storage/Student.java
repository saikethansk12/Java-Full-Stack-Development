package file.storage;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student implements Serializable {
    private int reg_Num;
    private String name;
    private int age;
    private String email;
    private  Address address;
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Address implements Serializable {
    private String area;
    private String landmark;
    private String city;
    private Integer pin;
}