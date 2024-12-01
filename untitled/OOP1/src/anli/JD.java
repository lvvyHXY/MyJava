package anli;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//家电
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JD implements Function{
    private String name;
    //状态:开或者关
    private boolean status;
    public void press()
    {
        status = !status;
    }

    public boolean isStatus() {
        return status;
    }
}
