/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS444Onimus.domain;

import java.util.*;

/**
 *
 * @author matt
 */
public class Round {
    
    private int hole1Par, hole2Par, hole3Par, hole4Par, hole5Par, hole6Par,
             hole7Par, hole8Par, hole9Par, hole10Par, hole11Par, hole12Par,
             hole13Par, hole14Par, hole15Par, hole16Par, hole17Par, hole18Par;
    
    private int hole1Score, hole2Score, hole3Score, hole4Score, hole5Score, 
            hole6Score, hole7Score, hole8Score, hole9Score, hole10Score, 
            hole11Score, hole12Score, hole13Score, hole14Score, hole15Score, 
            hole16Score, hole17Score, hole18Score;
    
    private int hole1Difference, hole2Difference, hole3Difference, 
            hole4Difference, hole5Difference, hole6Difference, hole7Difference, 
            hole8Difference, hole9Difference, hole10Difference, hole11Difference,
            hole12Difference, hole13Difference, hole14Difference, hole15Difference, 
            hole16Difference, hole17Difference, hole18Difference;
    
    private String courseName = "";
    
    private int Id;

    /**
     * @return the hole1Par
     */
    public int getHole1Par() {
        return hole1Par;
    }

    /**
     * @param hole1Par the hole1Par to set
     */
    public void setHole1Par(int hole1Par) {
        this.hole1Par = hole1Par;
    }

    /**
     * @return the hole2Par
     */
    public int getHole2Par() {
        return hole2Par;
    }

    /**
     * @param hole2Par the hole2Par to set
     */
    public void setHole2Par(int hole2Par) {
        this.hole2Par = hole2Par;
    }

    /**
     * @return the hole3Par
     */
    public int getHole3Par() {
        return hole3Par;
    }

    /**
     * @param hole3Par the hole3Par to set
     */
    public void setHole3Par(int hole3Par) {
        this.hole3Par = hole3Par;
    }

    /**
     * @return the hole4Par
     */
    public int getHole4Par() {
        return hole4Par;
    }

    /**
     * @param hole4Par the hole4Par to set
     */
    public void setHole4Par(int hole4Par) {
        this.hole4Par = hole4Par;
    }

    /**
     * @return the hole5Par
     */
    public int getHole5Par() {
        return hole5Par;
    }

    /**
     * @param hole5Par the hole5Par to set
     */
    public void setHole5Par(int hole5Par) {
        this.hole5Par = hole5Par;
    }

    /**
     * @return the hole6Par
     */
    public int getHole6Par() {
        return hole6Par;
    }

    /**
     * @param hole6Par the hole6Par to set
     */
    public void setHole6Par(int hole6Par) {
        this.hole6Par = hole6Par;
    }

    /**
     * @return the hole7Par
     */
    public int getHole7Par() {
        return hole7Par;
    }

    /**
     * @param hole7Par the hole7Par to set
     */
    public void setHole7Par(int hole7Par) {
        this.hole7Par = hole7Par;
    }

    /**
     * @return the hole8Par
     */
    public int getHole8Par() {
        return hole8Par;
    }

    /**
     * @param hole8Par the hole8Par to set
     */
    public void setHole8Par(int hole8Par) {
        this.hole8Par = hole8Par;
    }

    /**
     * @return the hole9Par
     */
    public int getHole9Par() {
        return hole9Par;
    }

    /**
     * @param hole9Par the hole9Par to set
     */
    public void setHole9Par(int hole9Par) {
        this.hole9Par = hole9Par;
    }

    /**
     * @return the hole10Par
     */
    public int getHole10Par() {
        return hole10Par;
    }

    /**
     * @param hole10Par the hole10Par to set
     */
    public void setHole10Par(int hole10Par) {
        this.hole10Par = hole10Par;
    }

    /**
     * @return the hole11Par
     */
    public int getHole11Par() {
        return hole11Par;
    }

    /**
     * @param hol11Par the hole11Par to set
     */
    public void setHole11Par(int hol11Par) {
        this.hole11Par = hol11Par;
    }

    /**
     * @return the hole12Par
     */
    public int getHole12Par() {
        return hole12Par;
    }

    /**
     * @param hole12Par the hole12Par to set
     */
    public void setHole12Par(int hole12Par) {
        this.hole12Par = hole12Par;
    }

    /**
     * @return the hole13Par
     */
    public int getHole13Par() {
        return hole13Par;
    }

    /**
     * @param hole13Par the hole13Par to set
     */
    public void setHole13Par(int hole13Par) {
        this.hole13Par = hole13Par;
    }

    /**
     * @return the hole14Par
     */
    public int getHole14Par() {
        return hole14Par;
    }

    /**
     * @param hole14Par the hole14Par to set
     */
    public void setHole14Par(int hole14Par) {
        this.hole14Par = hole14Par;
    }

    /**
     * @return the hole15Par
     */
    public int getHole15Par() {
        return hole15Par;
    }

    /**
     * @param hole15Par the hole15Par to set
     */
    public void setHole15Par(int hole15Par) {
        this.hole15Par = hole15Par;
    }

    /**
     * @return the hole16Par
     */
    public int getHole16Par() {
        return hole16Par;
    }

    /**
     * @param hole16Par the hole16Par to set
     */
    public void setHole16Par(int hole16Par) {
        this.hole16Par = hole16Par;
    }

    /**
     * @return the hole17Par
     */
    public int getHole17Par() {
        return hole17Par;
    }

    /**
     * @param hole17Par the hole17Par to set
     */
    public void setHole17Par(int hole17Par) {
        this.hole17Par = hole17Par;
    }

    /**
     * @return the hole18Par
     */
    public int getHole18Par() {
        return hole18Par;
    }

    /**
     * @param hole18Par the hole18Par to set
     */
    public void setHole18Par(int hole18Par) {
        this.hole18Par = hole18Par;
    }

    /**
     * @return the hole1Score
     */
    public int getHole1Score() {
        return hole1Score;
    }

    /**
     * @param hole1Score the hole1Score to set
     */
    public void setHole1Score(int hole1Score) {
        this.hole1Score = hole1Score;
    }

    /**
     * @return the hole2Score
     */
    public int getHole2Score() {
        return hole2Score;
    }

    /**
     * @param hole2Score the hole2Score to set
     */
    public void setHole2Score(int hole2Score) {
        this.hole2Score = hole2Score;
    }

    /**
     * @return the hole3Score
     */
    public int getHole3Score() {
        return hole3Score;
    }

    /**
     * @param hole3Score the hole3Score to set
     */
    public void setHole3Score(int hole3Score) {
        this.hole3Score = hole3Score;
    }

    /**
     * @return the hole4Score
     */
    public int getHole4Score() {
        return hole4Score;
    }

    /**
     * @param hole4Score the hole4Score to set
     */
    public void setHole4Score(int hole4Score) {
        this.hole4Score = hole4Score;
    }

    /**
     * @return the hole5Score
     */
    public int getHole5Score() {
        return hole5Score;
    }

    /**
     * @param hole5Score the hole5Score to set
     */
    public void setHole5Score(int hole5Score) {
        this.hole5Score = hole5Score;
    }

    /**
     * @return the hole6Score
     */
    public int getHole6Score() {
        return hole6Score;
    }

    /**
     * @param hole6Score the hole6Score to set
     */
    public void setHole6Score(int hole6Score) {
        this.hole6Score = hole6Score;
    }

    /**
     * @return the hole7Score
     */
    public int getHole7Score() {
        return hole7Score;
    }

    /**
     * @param hole7Score the hole7Score to set
     */
    public void setHole7Score(int hole7Score) {
        this.hole7Score = hole7Score;
    }

    /**
     * @return the hole8Score
     */
    public int getHole8Score() {
        return hole8Score;
    }

    /**
     * @param hole8Score the hole8Score to set
     */
    public void setHole8Score(int hole8Score) {
        this.hole8Score = hole8Score;
    }

    /**
     * @return the hole9Score
     */
    public int getHole9Score() {
        return hole9Score;
    }

    /**
     * @param hole9Score the hole9Score to set
     */
    public void setHole9Score(int hole9Score) {
        this.hole9Score = hole9Score;
    }

    /**
     * @return the hole10Score
     */
    public int getHole10Score() {
        return hole10Score;
    }

    /**
     * @param hole10Score the hole10Score to set
     */
    public void setHole10Score(int hole10Score) {
        this.hole10Score = hole10Score;
    }

    /**
     * @return the hole11Score
     */
    public int getHole11Score() {
        return hole11Score;
    }

    /**
     * @param hol11Score the hole11Score to set
     */
    public void setHole11Score(int hol11Score) {
        this.hole11Score = hol11Score;
    }

    /**
     * @return the hole12Score
     */
    public int getHole12Score() {
        return hole12Score;
    }

    /**
     * @param hole12Score the hole12Score to set
     */
    public void setHole12Score(int hole12Score) {
        this.hole12Score = hole12Score;
    }

    /**
     * @return the hole13Score
     */
    public int getHole13Score() {
        return hole13Score;
    }

    /**
     * @param hole13Score the hole13Score to set
     */
    public void setHole13Score(int hole13Score) {
        this.hole13Score = hole13Score;
    }

    /**
     * @return the hole14Score
     */
    public int getHole14Score() {
        return hole14Score;
    }

    /**
     * @param hole14Score the hole14Score to set
     */
    public void setHole14Score(int hole14Score) {
        this.hole14Score = hole14Score;
    }

    /**
     * @return the hole15Score
     */
    public int getHole15Score() {
        return hole15Score;
    }

    /**
     * @param hole15Score the hole15Score to set
     */
    public void setHole15Score(int hole15Score) {
        this.hole15Score = hole15Score;
    }

    /**
     * @return the hole16Score
     */
    public int getHole16Score() {
        return hole16Score;
    }

    /**
     * @param hole16Score the hole16Score to set
     */
    public void setHole16Score(int hole16Score) {
        this.hole16Score = hole16Score;
    }

    /**
     * @return the hole17Score
     */
    public int getHole17Score() {
        return hole17Score;
    }

    /**
     * @param hole17Score the hole17Score to set
     */
    public void setHole17Score(int hole17Score) {
        this.hole17Score = hole17Score;
    }

    /**
     * @return the hole18Score
     */
    public int getHole18Score() {
        return hole18Score;
    }

    /**
     * @param hole18Score the hole18Score to set
     */
    public void setHole18Score(int hole18Score) {
        this.hole18Score = hole18Score;
    }

    /**
     * @return the hole1Difference
     */
    public int getHole1Difference() {
        return hole1Difference;
    }

    /**
     * @param hole1Difference the hole1Difference to set
     */
    public void setHole1Difference(int hole1Difference) {
        this.hole1Difference = hole1Difference;
    }

    /**
     * @return the hole2Difference
     */
    public int getHole2Difference() {
        return hole2Difference;
    }

    /**
     * @param hole2Difference the hole2Difference to set
     */
    public void setHole2Difference(int hole2Difference) {
        this.hole2Difference = hole2Difference;
    }

    /**
     * @return the hole3Difference
     */
    public int getHole3Difference() {
        return hole3Difference;
    }

    /**
     * @param hole3Difference the hole3Difference to set
     */
    public void setHole3Difference(int hole3Difference) {
        this.hole3Difference = hole3Difference;
    }

    /**
     * @return the hole4Difference
     */
    public int getHole4Difference() {
        return hole4Difference;
    }

    /**
     * @param hole4Difference the hole4Difference to set
     */
    public void setHole4Difference(int hole4Difference) {
        this.hole4Difference = hole4Difference;
    }

    /**
     * @return the hole5Difference
     */
    public int getHole5Difference() {
        return hole5Difference;
    }

    /**
     * @param hole5Difference the hole5Difference to set
     */
    public void setHole5Difference(int hole5Difference) {
        this.hole5Difference = hole5Difference;
    }

    /**
     * @return the hole6Difference
     */
    public int getHole6Difference() {
        return hole6Difference;
    }

    /**
     * @param hole6Difference the hole6Difference to set
     */
    public void setHole6Difference(int hole6Difference) {
        this.hole6Difference = hole6Difference;
    }

    /**
     * @return the hole7Difference
     */
    public int getHole7Difference() {
        return hole7Difference;
    }

    /**
     * @param hole7Difference the hole7Difference to set
     */
    public void setHole7Difference(int hole7Difference) {
        this.hole7Difference = hole7Difference;
    }

    /**
     * @return the hole8Difference
     */
    public int getHole8Difference() {
        return hole8Difference;
    }

    /**
     * @param hole8Difference the hole8Difference to set
     */
    public void setHole8Difference(int hole8Difference) {
        this.hole8Difference = hole8Difference;
    }

    /**
     * @return the hole9Difference
     */
    public int getHole9Difference() {
        return hole9Difference;
    }

    /**
     * @param hole9Difference the hole9Difference to set
     */
    public void setHole9Difference(int hole9Difference) {
        this.hole9Difference = hole9Difference;
    }

    /**
     * @return the hole10Difference
     */
    public int getHole10Difference() {
        return hole10Difference;
    }

    /**
     * @param hole10Difference the hole10Difference to set
     */
    public void setHole10Difference(int hole10Difference) {
        this.hole10Difference = hole10Difference;
    }

    /**
     * @return the hole11Difference
     */
    public int getHole11Difference() {
        return hole11Difference;
    }

    /**
     * @param hol11Difference the hole11Difference to set
     */
    public void setHole11Difference(int hol11Difference) {
        this.hole11Difference = hol11Difference;
    }

    /**
     * @return the hole12Difference
     */
    public int getHole12Difference() {
        return hole12Difference;
    }

    /**
     * @param hole12Difference the hole12Difference to set
     */
    public void setHole12Difference(int hole12Difference) {
        this.hole12Difference = hole12Difference;
    }

    /**
     * @return the hole13Difference
     */
    public int getHole13Difference() {
        return hole13Difference;
    }

    /**
     * @param hole13Difference the hole13Difference to set
     */
    public void setHole13Difference(int hole13Difference) {
        this.hole13Difference = hole13Difference;
    }

    /**
     * @return the hole14Difference
     */
    public int getHole14Difference() {
        return hole14Difference;
    }

    /**
     * @param hole14Difference the hole14Difference to set
     */
    public void setHole14Difference(int hole14Difference) {
        this.hole14Difference = hole14Difference;
    }

    /**
     * @return the hole15Difference
     */
    public int getHole15Difference() {
        return hole15Difference;
    }

    /**
     * @param hole15Difference the hole15Difference to set
     */
    public void setHole15Difference(int hole15Difference) {
        this.hole15Difference = hole15Difference;
    }

    /**
     * @return the hole16Difference
     */
    public int getHole16Difference() {
        return hole16Difference;
    }

    /**
     * @param hole16Difference the hole16Difference to set
     */
    public void setHole16Difference(int hole16Difference) {
        this.hole16Difference = hole16Difference;
    }

    /**
     * @return the hole17Difference
     */
    public int getHole17Difference() {
        return hole17Difference;
    }

    /**
     * @param hole17Difference the hole17Difference to set
     */
    public void setHole17Difference(int hole17Difference) {
        this.hole17Difference = hole17Difference;
    }

    /**
     * @return the hole18Difference
     */
    public int getHole18Difference() {
        return hole18Difference;
    }

    /**
     * @param hole18Difference the hole18Difference to set
     */
    public void setHole18Difference(int hole18Difference) {
        this.hole18Difference = hole18Difference;
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    
    public boolean validate() {
        if (courseName == null || courseName.equals("")) return false;
                
        return true;
        
        
    }
    
    public int scoreToPar(int par, int score) {
        return par - score;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }
    
    
    
    
    
}
