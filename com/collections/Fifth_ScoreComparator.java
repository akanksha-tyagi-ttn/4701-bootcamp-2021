package com.collections;
import java.util.Comparator;
public class Fifth_ScoreComparator implements Comparator<Fifth_Student>
{
    @Override
    public int compare(Fifth_Student stud1, Fifth_Student stud2) {
        if(stud1.getScore() < stud2.getScore())
            return -1;
        else if(stud1.getScore()>stud2.getScore())
            return 1;
        //comparing the names when scores are equal
        else return stud1.getName().compareTo(stud2.getName());
    }
}
