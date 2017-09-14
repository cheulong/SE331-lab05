package camt.cbsd.entity;

public class Student {

    public Student(long id, String studentId, String name, String surnmae, double gpa, String image, boolean feature, int penAmount, String description) {
        this.id = id;
        this.studentId = studentId;
        this.name = name;
        this.surnmae = surnmae;
        this.gpa = gpa;
        this.image = image;
        this.feature = feature;
        this.penAmount = penAmount;
        this.description = description;
    }

    long id;
    String studentId;
    String name;
    String surnmae;
    double gpa;
    String image;
    boolean feature;
    int penAmount;
    String description;

    public long getId() {
        return id;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getSurnmae() {
        return surnmae;
    }

    public double getGpa() {
        return gpa;
    }

    public String getImage() {
        return image;
    }

    public boolean isFeature() {
        return feature;
    }

    public int getPenAmount() {
        return penAmount;
    }

    public String getDescription() {
        return description;
    }
}

