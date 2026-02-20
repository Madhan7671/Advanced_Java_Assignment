package com.capgemini.com.manyToOne;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="dept_name")
    private String deptName;

    // One Department → Many Students
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Student> students;

    public Department() {}

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public Long getId() {
        return id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", deptName=" + deptName + "]";
    }
}

