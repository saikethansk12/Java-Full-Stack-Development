package file.storage;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private int reg_Num;
    private String name;
    private int age;
    private String email;
    private  Address address;
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Address{
    private String area;
    private String landmark;
    private String city;
    private Integer pin;
}