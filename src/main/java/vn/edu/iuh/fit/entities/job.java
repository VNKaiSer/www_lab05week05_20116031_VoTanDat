package vn.edu.iuh.fit.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "job")
public class job {
    @Id
    private long job_id;
    private String job_desc;
    private String job_name;
    @ManyToOne
    @JoinColumn(name = "comp_id", nullable = false)
    private company company;

    @OneToMany
    private List<job_skill> jobSkills;
    public job() {
    }

    public job(vn.edu.iuh.fit.entities.company company, long job_id, String job_desc, String job_name) {
        this.company = company;
        this.job_id = job_id;
        this.job_desc = job_desc;
        this.job_name = job_name;
    }

    public vn.edu.iuh.fit.entities.company getCompany() {
        return company;
    }

    public void setCompany(vn.edu.iuh.fit.entities.company company) {
        this.company = company;
    }

    public long getJob_id() {
        return job_id;
    }

    public void setJob_id(long job_id) {
        this.job_id = job_id;
    }

    public String getJob_desc() {
        return job_desc;
    }

    public void setJob_desc(String job_desc) {
        this.job_desc = job_desc;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    @Override
    public String toString() {
        return "job{" +
                "company=" + company +
                ", job_id=" + job_id +
                ", job_desc='" + job_desc + '\'' +
                ", job_name='" + job_name + '\'' +
                '}';
    }
}
