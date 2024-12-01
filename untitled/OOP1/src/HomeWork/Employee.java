package HomeWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Employee {
    private String ID;
    private String name;
    private double income;
    public abstract void work();
    public abstract void eat();
}
