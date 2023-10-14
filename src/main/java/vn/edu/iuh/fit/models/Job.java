package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
@Table(name = "job")
public class Job {
    @Id
    @Column(name = "job_id", nullable = false)
    private long jobId;
    @Column(name = "job_desc")
    private String jobDesc;
    @Column(name = "job_name")
    private String jobName;
    @ManyToOne
    @JoinColumn(name = "comp_id", nullable = false)
    private Company company;

    @OneToMany
    private List<JobSkill> jobSkills;
    public Job() {
    }

    public Job(Company company, long job_id, String job_desc, String job_name) {
        this.company = company;
        this.jobId = job_id;
        this.jobDesc = job_desc;
        this.jobName = job_name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setJobId(long job_id) {
        this.jobId = job_id;
    }

    public void setJobDesc(String job_desc) {
        this.jobDesc = job_desc;
    }

    public void setJobName(String job_name) {
        this.jobName = job_name;
    }

    @Override
    public String toString() {
        return "job{" +
                "company=" + company +
                ", job_id=" + jobId +
                ", job_desc='" + jobDesc + '\'' +
                ", job_name='" + jobName + '\'' +
                '}';
    }
}
