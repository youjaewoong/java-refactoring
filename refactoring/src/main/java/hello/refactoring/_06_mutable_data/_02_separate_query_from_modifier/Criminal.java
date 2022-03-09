package hello.refactoring._06_mutable_data._02_separate_query_from_modifier;

import java.util.List;

/**
 * 조회와 액션으로 나눈다.
 * @author gos10
 *
 */
public class Criminal {
	/**
	 * 알람액션
	 * @param people
	 */
    public void alertForMiscreant(List<Person> people) {
    	if(!findMiscreant(people).isBlank()) {
    		setOffAlarms();
    	}
    }

    /**
     * 알람조회
     * @param people
     * @return
     */
    public String findMiscreant(List<Person> people) {
        for (Person p : people) {
            if (p.getName().equals("Don")) {
                setOffAlarms();
                return "Don";
            }

            if (p.getName().equals("John")) {
                setOffAlarms();
                return "John";
            }
        }
        return "";
    }
    
    private void setOffAlarms() {
        System.out.println("set off alarm");
    }
}
