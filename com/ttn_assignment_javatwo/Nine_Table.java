package com.ttn_assignment_javatwo;
public class Nine_Table extends Nine_Furniture {
    String type;
    int stressNum; boolean fire_capable;
    public Nine_Table()
    {System.out.println("Table Class"); }
    public Nine_Table(String type,int stress,boolean testFire)
    {
        this.type=type;
        this.stressNum=stress; this.fire_capable=testFire;
     }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setStressNum(int stressNum) {
         this.stressNum = stressNum;
     }
    public void setFire_capable(boolean fire_capable) {
        this.fire_capable = fire_capable;
    }

    @Override
    public int getStressLevel() {
        return this.stressNum;
    }
    @Override
    public boolean fireTest() {
        return fire_capable;
    }

    public String toString() {
        return "{{ Table:\nType: "+type+
                "\nStress Level: "+stressNum+ " kg"+
                "\nfire-capable: "+fire_capable +"  }}";    }
}
