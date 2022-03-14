package hello.refactoring._07_divergent_change._02_move_function;

public class AccountType {
    private boolean premium;

    public AccountType(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return this.premium;
    }

	double overdraftCharge(int dasyOverdrawn) {
	    if (this.isPremium()) {
	        final int baseCharge = 10;
	        if (dasyOverdrawn <= 7) {
	            return baseCharge;
	        } else {
	            return baseCharge + (dasyOverdrawn - 7) * 0.85;
	        }
	    } else {
	        return dasyOverdrawn * 1.75;
	    }
	}
}
