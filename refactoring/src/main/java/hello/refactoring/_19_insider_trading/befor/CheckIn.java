package hello.refactoring._19_insider_trading.befor;

import java.time.LocalDate;

public class CheckIn {

    public boolean isFastPass(Ticket ticket) {
        LocalDate earlyBirdDate = LocalDate.of(2022, 1, 1);
        return ticket.isPrime() && ticket.getPurchasedDate().isBefore(earlyBirdDate);
    }
}
