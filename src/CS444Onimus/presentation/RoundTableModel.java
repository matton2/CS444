/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS444Onimus.presentation;

import java.util.*;
import CS444Onimus.domain.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author matt
 */
public class RoundTableModel extends AbstractTableModel {
    
    private String[] columnNames = {"Course Name", "Par", "Score", "Net Score"};
    
    private List<Round> rounds = new LinkedList<Round>();
    
    public void setRounds (List<Round> rounds) {
        this.rounds = rounds;
    }
    
    @Override
    public int getRowCount(){
        return rounds.size();
    }
    
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Round round = rounds.get(row);
        switch (column) {
            case 0:
                return round.getCourseName();
            case 1:
                return round.getCoursePar();
            case 2:
                return round.getScore();
            case 3:
                return round.getNetScore();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    public int getAvgScore() {
        int score = 0;
        
        for(int i = 0; i < rounds.size(); i++) {
            Round round = rounds.get(i);
            int currentScore = round.getNetScore();
            score = score + currentScore;
                        
        }
        
        return(score);
        
        
    }
    
    
    
    
}
