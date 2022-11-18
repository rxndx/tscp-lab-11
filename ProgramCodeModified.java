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
public final class setHealthConditionTest {
    
   /**
   * Some information about MIN_CONDITION_ID.
   */
  private static final Integer MIN_CONDITION_ID = 0;
  
   /**
   * Some information about MAX_CONDITION_ID.
   */
  private static final Integer MAX_CONDITION_ID = 1000000000;
    
   /**
   * Some information about TEST_VALUES.
   */
  private static final Map<healthConditionId, Integer> TEST_VALUES = new HashMap<>(Map.of(
                new TEST_VALUES(9, "16.07.21", 446, 68, 6734, 118),
                new TEST_VALUES(-100, "16.07.21", 446, 68, 6734, 118),
                new TEST_VALUES(1, "16.13.26", 446, 68, 6734, 118),
                new TEST_VALUES(1, "16.07.21", -100, 68, 6734, 118),
        ));
    
   /**
   * Private constructor.
   */
  private setHealthConditionTest() {

  }

   /**
   * Method to perform check healthCondition id.
   *
   * @param healthConditionId healthCondition id
   * @return true if healthCondition id is correct, else false
   */
    public static boolean isIdCorrect(final Integer healthConditionId) {
        return healthConditionId > MIN_CONDITION_ID && healthConditionId < MAX_CONDITION_ID;
    }

   /**
   * Method to perform check healthCondition calories, healthCondition pace, healthCondition pressure, healthCondition pulse
   *
   * @param healthConditionCalories healthCondition calories, healthConditionPace healthCondition pace, healthConditionPressure healthCondition pressure, healthConditionPulse healthCondition pulse
   * @return true if healthCondition calories && healthCondition pace && healthCondition pressure && healthCondition pulse is correct, else false
   */
    public static boolean areValuesCorrect(final Integer healthConditionCalories, final Integer healthConditionPace, final Integer healthConditionPressure, final Integer healthConditionPulse) {
        return healthConditionCalories > MIN_CONDITION_ID && healthConditionCalories < MAX_CONDITION_ID
                && healthConditionPace > MIN_CONDITION_ID && healthConditionPace < MAX_CONDITION_ID
                && healthConditionPressure > MIN_CONDITION_ID && healthConditionPressure < MAX_CONDITION_ID
                && healthConditionPulse > MIN_CONDITION_ID && healthConditionPulse < MAX_CONDITION_ID;
    }
    
        public static boolean isDateCorrect(healthCondition healthCondition) {
        return healthCondition.getDate().matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
    }
    
        public static int setHealthCondition(healthCondition healthCondition) {
        if (!isIdCorrect(healthCondition)) {
            return -1;
        }

        if(!isDateCorrect(healthCondition)) {
            return -2;
        }

        if (!areValuesCorrect(healthCondition)) {
            return -3;
        }

        return 1;
    }

   /**
   * Main class.
   *
   * @param args String array args argument
   */
    public static void main(String[] args) {
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
