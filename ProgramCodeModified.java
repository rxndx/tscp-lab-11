/**
 * Some info about package.
 */
package com.nuop.tscp;

import com.nuop.tscp.healthCondition.healthCondition;
import java.util.HashMap;
import java.util.Map;

/**
 * This is the class.
 */
public class setHealthConditionTest {
  
  /**
   * Some information about MIN_LITERATURE_ID.
   */
  private static final Integer MIN_CONDITION_ID = 0;
  /**
   * Some information about MAX_LITERATURE_ID.
   */
  private static final Integer MAX_CONDITION_ID = 1000000000;

   /**
   * Method to perform check condition id.
   *
   * @param conditionId condition id
   * @return true if condition id is correct, else false
   */
    public static boolean isIdCorrect(healthCondition healthCondition) {
        return healthCondition.getId() > MIN_CONDITION_ID && healthCondition.getId() < MAX_CONDITION_ID;
    }
  
    /**
   * Method to perform check date.
   *
   * @param date
   * @return true if date is correct, else false
   */
    public static boolean isDateCorrect(healthCondition healthCondition) {
        return healthCondition.getDate().matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
    }

   /**
   * Method to perform check values of condition.
   *
   * @param calories, pace, pressure, pulse
   * @return true if values is correct, else false
   */
    public static boolean areValuesCorrect(healthCondition healthCondition) {
        return healthCondition.getCalories() > MIN_CONDITION_ID && healthCondition.getCalories() < MAX_CONDITION_ID
                && healthCondition.getPace() > MIN_CONDITION_ID && healthCondition.getPace() < MAX_CONDITION_ID
                && healthCondition.getPressure() > MIN_CONDITION_ID && healthCondition.getPressure() < MAX_CONDITION_ID
                && healthCondition.getPulse() > MIN_CONDITION_ID && healthCondition.getPulse() < MAX_CONDITION_ID;
    }


   /**
   * Main class.
   *
   * @param args String array args argument
   */
    public static void main(String[] args) {

        Map<healthCondition, Integer> valueMap = new HashMap<>(Map.of(
                new healthCondition(9, "16.07.21", 446, 68, 6734, 118), 1,
                new healthCondition(-100, "16.07.21", 446, 68, 6734, 118), -1,
                new healthCondition(1, "16.13.26", 446, 68, 6734, 118), -2,
                new healthCondition(1, "16.07.21", -100, 68, 6734, 118), -3
        ));

        int i = 1;
        for (healthCondition healthCondition : valueMap.keySet()) {
            if (valueMap.get(healthCondition) == setHealthCondition(healthCondition)) {
                System.out.println("TC" + i++ + ": PASSED");
            } else {
                System.out.println("TC" + i++ + ": FAILED");
            }
        }
    }
}
