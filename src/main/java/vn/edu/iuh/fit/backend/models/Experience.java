package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Getter
@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long expId;
    private Date fromDate;
    private Date toDate;
    
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate canId;
    private String role;
    private String company;
    private String workDesc;

    public Experience() {
    }

    public Experience(long exp_id, Date from_date, Date to_date, Candidate can_id, String role, String company, String work_desc) {
        this.expId = exp_id;
        this.fromDate = from_date;
        this.toDate = to_date;
        this.canId = can_id;
        this.role = role;
        this.company = company;
        this.workDesc = work_desc;
    }

    public void setExpId(long expId) {
        this.expId = expId;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public void setCanId(Candidate canId) {
        this.canId = canId;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setWorkDesc(String workDesc) {
        this.workDesc = workDesc;
    }

    @Override
    public String toString() {
        return "experience{" +
                "exp_id=" + expId +
                ", from_date=" + fromDate +
                ", to_date=" + toDate +
                ", can_id=" + canId +
                ", role='" + role + '\'' +
                ", company='" + company + '\'' +
                ", work_desc='" + workDesc + '\'' +
                '}';
    }
}
