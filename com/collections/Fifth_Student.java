package com.collections;

public class Fifth_Student {
    String name;
    double score,age;
    public Fifth_Student()  {}  //default ctr
    public Fifth_Student(String name,double age,double score) {
        this.name=name;
        this.age=age;
        this.score=score;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }
    public void setScore(double salary) {
        this.score = salary;
    }
    public String toString()
    {
        return "Name: "+this.name+
                "\t\t\tAge: "+this.age+
                "\tScore: "+this.score+"\n";
    }
}
