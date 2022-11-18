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
  private static final Integer MIN_LITERATURE_ID = 0;
  
   /**
   * Some information about MAX_LITERATURE_ID.
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
