package hello.refactoring._08_shotgun_surgery._01_move_field.befor;

import java.time.LocalDate;

public class CustomerContract {

    private LocalDate startDate;
    
    public CustomerContract(LocalDate startDate) {
        this.startDate = startDate;
    }
}
