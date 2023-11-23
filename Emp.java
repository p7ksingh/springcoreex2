package springcoreex2;

public class Emp {
    private int eid;
    private String ename;
    private double esal;

    public Emp() {
        System.out.println("Beans are created");
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public double getEsal() {
        return esal;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEsal(double esal) {
        this.esal = esal;
    }

}
