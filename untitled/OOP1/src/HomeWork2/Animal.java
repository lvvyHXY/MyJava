package HomeWork2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class Animal {
    private String name;
    private double weight;
    public abstract void eat();
}
