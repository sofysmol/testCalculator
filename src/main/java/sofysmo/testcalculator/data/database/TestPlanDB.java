package sofysmo.testcalculator.data.database;

import sofysmo.testcalculator.data.Identified;

/**
 * Created by sofysmo on 19.12.16.
 */
public class TestPlanDB extends Identified<Integer> {
    private String name;
    private String description;

    public TestPlanDB(String name, String description) {
        super(name.hashCode());
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
