import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YatzyTest {

    @Test
    public void chanceCategoryTest() {
    	
    	int[] expectedScores = { 15, 16, 20 };
    	
        assertEquals(expectedScores[0], new Yatzy(2,3,4,5,1).chance());
        assertEquals(expectedScores[1], new Yatzy(3,3,4,5,1).chance());
        assertEquals(expectedScores[2], new Yatzy(6,5,4,3,2).chance());
    }

    @Test 
    public void yatzyCategoryTest() {
    	
    	int[] expectedScores = { 0, 50 };
      
    	assertEquals(expectedScores[1], new Yatzy(4,4,4,4,4).yatzy());
        assertEquals(expectedScores[1], new Yatzy(6,6,6,6,6).yatzy());
        assertEquals(expectedScores[0], new Yatzy(6,6,6,6,3).yatzy());
    }

    @Test 
    public void onesCategoryTest() {
    	
    	int[] expectedScores = { 0, 1, 2, 4 };
    	
    	assertEquals(expectedScores[0], new Yatzy(6,2,2,4,5).ones());
        assertEquals(expectedScores[1], new Yatzy(1,2,3,4,5).ones());
        assertEquals(expectedScores[2], new Yatzy(1,2,1,4,5).ones());
        assertEquals(expectedScores[3], new Yatzy(1,2,1,1,1).ones());
    }

    @Test
    public void twosCategoryTest() {
    	
    	int[] expectedScores = { 4, 10, 2 };
    	
        assertEquals(expectedScores[0], new Yatzy(1,2,3,2,6).twos());
        assertEquals(expectedScores[1], new Yatzy(2,2,2,2,2).twos());
        assertEquals(expectedScores[2], new Yatzy(2,1,1,4,4).twos());
        
    }

    @Test
    public void threesCategoryTest() {
    	
    	int[] expectedScores = { 6, 12, 3 };
    	
        assertEquals(expectedScores[0], new Yatzy(1,2,3,2,3).threes());
        assertEquals(expectedScores[1], new Yatzy(2,3,3,3,3).threes());
        assertEquals(expectedScores[2], new Yatzy(1,6,2,3,4).threes());
    }

    @Test
    public void foursCategoryTest() 
    {
    	int[] expectedScores = { 4, 8, 12 };
    	
    	assertEquals(expectedScores[0], new Yatzy(4,5,5,5,5).fours());
        assertEquals(expectedScores[1], new Yatzy(4,4,5,5,5).fours());
        assertEquals(expectedScores[2], new Yatzy(4,4,4,5,5).fours());
    }

    @Test
    public void fivesCategoryTest() {
    	
    	int[] expectedScores = { 10, 15, 20 };
    	
        assertEquals(expectedScores[0], new Yatzy(4,4,4,5,5).fives());
        assertEquals(expectedScores[1], new Yatzy(4,4,5,5,5).fives());
        assertEquals(expectedScores[2], new Yatzy(4,5,5,5,5).fives());
    }

    @Test
    public void sixesCategoryTest() {
    	
    	int[] expectedScores = { 0, 6, 18 };
    	
        assertEquals(expectedScores[0], new Yatzy(4,4,4,5,5).sixes());
        assertEquals(expectedScores[1], new Yatzy(4,4,6,5,5).sixes());
        assertEquals(expectedScores[2], new Yatzy(6,5,6,6,5).sixes());
    }

    @Test
    public void onePairCategoryTest() {
    	
    	int[] expectedScores = { 6, 10, 12 };
    	
        assertEquals(expectedScores[0], new Yatzy(3,4,3,5,6).scorePair());
        assertEquals(expectedScores[1], new Yatzy(5,3,3,3,5).scorePair());
        assertEquals(expectedScores[2], new Yatzy(5,3,6,6,5).scorePair());
    }

    @Test
    public void twoPairCategoryTest() {
    	
    	int[] expectedScores = { 16, 16, 0 };
    	
        assertEquals(expectedScores[0], new Yatzy(3,3,5,4,5).twoPair());
        assertEquals(expectedScores[1], new Yatzy(3,3,5,5,5).twoPair());
        assertEquals(expectedScores[2], new Yatzy(3,1,2,6,5).twoPair());
    }

    @Test
    public void threeOfAkindCategoryTest() 
    {
    	int[] expectedScores = { 9, 15, 9 };
    	
        assertEquals(expectedScores[0], new Yatzy(3,3,3,4,5).threeOfAKind());
        assertEquals(expectedScores[1], new Yatzy(5,3,5,4,5).threeOfAKind());
        assertEquals(expectedScores[2], new Yatzy(3,3,3,3,5).threeOfAKind());
    }

    @Test
    public void fourOfAKindCategoryTest() {
    	
    	int[] expectedScores = { 12, 20, 20 };
    	
        assertEquals(expectedScores[0], new Yatzy(3,3,3,3,5).fourOfAKind());
        assertEquals(expectedScores[1], new Yatzy(5,5,5,4,5).fourOfAKind());
        assertEquals(expectedScores[2], new Yatzy(5,5,5,5,5).fourOfAKind());
    }

    @Test
    public void smallStraightCategoryTest() {
    	
    	int[] expectedScores = { 15, 15, 0 };
    	
        assertEquals(expectedScores[0], new Yatzy(1,2,3,4,5).smallStraight());
        assertEquals(expectedScores[1], new Yatzy(2,3,4,5,1).smallStraight());
        assertEquals(expectedScores[2], new Yatzy(1,2,2,4,5).smallStraight());
    }

    @Test
    public void largeStraightCategoryTest() {
    	
    	int[] expectedScores = { 20, 20, 0 };
    	
        assertEquals(expectedScores[0], new Yatzy(6,2,3,4,5).largeStraight());
        assertEquals(expectedScores[1], new Yatzy(2,3,4,5,6).largeStraight());
        assertEquals(expectedScores[2], new Yatzy(1,2,2,4,5).largeStraight());
    }

    @Test
    public void fullHouseCategoryTest() {
    	
    	int[] expectedScores = { 18, 17, 0 };
    	
        assertEquals(expectedScores[0], new Yatzy(6,2,2,2,6).fullHouse());
        assertEquals(expectedScores[1], new Yatzy(3,4,3,4,3).fullHouse());
        assertEquals(expectedScores[2], new Yatzy(2,3,4,5,6).fullHouse());
     }
    
    @Test
    public void invalideDiceScoreTest() {
    		
    	assertThrows(IllegalArgumentException.class, ()->{new Yatzy(8,2,2,2,6);});
    	assertThrows(IllegalArgumentException.class, ()->{new Yatzy(-1,0,2,2,7);});
     }
}
