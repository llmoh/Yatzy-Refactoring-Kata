import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YatzyTest {

    @Test
    public void chance_scores_sum_of_all_dice() {
    	
    	int[] expectedScores = { 15, 16 };
    	
        assertEquals(expectedScores[0], new Yatzy(2,3,4,5,1).chance());
        assertEquals(expectedScores[1], new Yatzy(3,3,4,5,1).chance());
    }

    @Test 
    public void yatzy_scores_50() {
    	
    	int[] expectedScores = { 0, 50 };
      
    	assertEquals(expectedScores[1], new Yatzy(4,4,4,4,4).yatzy());
        assertEquals(expectedScores[1], new Yatzy(6,6,6,6,6).yatzy());
        assertEquals(expectedScores[0], new Yatzy(6,6,6,6,3).yatzy());
    }

    @Test 
    public void test_1s() {
    	
    	int[] expectedScores = { 0, 1, 2, 4 };
    	
    	assertEquals(expectedScores[0], new Yatzy(6,2,2,4,5).ones());
        assertEquals(expectedScores[1], new Yatzy(1,2,3,4,5).ones());
        assertEquals(expectedScores[2], new Yatzy(1,2,1,4,5).ones());
        assertEquals(expectedScores[3], new Yatzy(1,2,1,1,1).ones());
    }

    @Test
    public void test_2s() {
    	
    	int[] expectedScores = { 4, 10 };
    	
        assertEquals(expectedScores[0], new Yatzy(1,2,3,2,6).twos());
        assertEquals(expectedScores[1], new Yatzy(2,2,2,2,2).twos());
    }

    @Test
    public void test_threes() {
    	
    	int[] expectedScores = { 6, 12 };
    	
        assertEquals(expectedScores[0], new Yatzy(1,2,3,2,3).threes());
        assertEquals(expectedScores[1], new Yatzy(2,3,3,3,3).threes());
    }

    @Test
    public void fours_test() 
    {
        assertEquals(12, new Yatzy(4,4,4,5,5).fours());
        assertEquals(8, new Yatzy(4,4,5,5,5).fours());
        assertEquals(4, new Yatzy(4,5,5,5,5).fours());
    }

    @Test
    public void fives() {
        assertEquals(10, new Yatzy(4,4,4,5,5).fives());
        assertEquals(15, new Yatzy(4,4,5,5,5).fives());
        assertEquals(20, new Yatzy(4,5,5,5,5).fives());
    }

    @Test
    public void sixes_test() {
        assertEquals(0, new Yatzy(4,4,4,5,5).sixes());
        assertEquals(6, new Yatzy(4,4,6,5,5).sixes());
        assertEquals(18, new Yatzy(6,5,6,6,5).sixes());
    }

    @Test
    public void one_pair() {
        assertEquals(6, new Yatzy(3,4,3,5,6).scorePair());
        assertEquals(10, new Yatzy(5,3,3,3,5).scorePair());
        assertEquals(12, new Yatzy(5,3,6,6,5).scorePair());
    }

    @Test
    public void two_Pair() {
        assertEquals(16, new Yatzy(3,3,5,4,5).twoPair());
        assertEquals(16, new Yatzy(3,3,5,5,5).twoPair());
    }

    @Test
    public void three_of_a_kind() 
    {
        assertEquals(9, new Yatzy(3,3,3,4,5).threeOfAKind());
        assertEquals(15, new Yatzy(5,3,5,4,5).threeOfAKind());
        assertEquals(9, new Yatzy(3,3,3,3,5).threeOfAKind());
    }

    @Test
    public void four_of_a_knd() {
        assertEquals(12, new Yatzy(3,3,3,3,5).fourOfAKind());
        assertEquals(20, new Yatzy(5,5,5,4,5).fourOfAKind());
        assertEquals(20, new Yatzy(5,5,5,5,5).fourOfAKind());
    }

    @Test
    public void smallStraight() {
        assertEquals(15, new Yatzy(1,2,3,4,5).smallStraight());
        assertEquals(15, new Yatzy(2,3,4,5,1).smallStraight());
        assertEquals(0, new Yatzy(1,2,2,4,5).smallStraight());
    }

    @Test
    public void largeStraight() {
        assertEquals(20, new Yatzy(6,2,3,4,5).largeStraight());
        assertEquals(20, new Yatzy(2,3,4,5,6).largeStraight());
        assertEquals(0, new Yatzy(1,2,2,4,5).largeStraight());
    }

    @Test
    public void fullHouse() {
        assertEquals(18, new Yatzy(6,2,2,2,6).fullHouse());
        assertEquals(0, new Yatzy(2,3,4,5,6).fullHouse());
     }
}
