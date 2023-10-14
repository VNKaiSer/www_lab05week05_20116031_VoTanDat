package vn.edu.iuh.fit.entities;

import java.util.Date;

public class experience {
    private long exp_id;
    private Date from_date;
    private Date to_date;
    private candidate can_id;
    private String role;
    private String company;
    private String work_desc;

    public experience() {
    }

    public experience(long exp_id, Date from_date, Date to_date, candidate can_id, String role, String company, String work_desc) {
        this.exp_id = exp_id;
        this.from_date = from_date;
        this.to_date = to_date;
        this.can_id = can_id;
        this.role = role;
        this.company = company;
        this.work_desc = work_desc;
    }

    public long getExp_id() {
        return exp_id;
    }

    public void setExp_id(long exp_id) {
        this.exp_id = exp_id;
    }

    public Date getFrom_date() {
        return from_date;
    }

    public void setFrom_date(Date from_date) {
        this.from_date = from_date;
    }

    public Date getTo_date() {
        return to_date;
    }

    public void setTo_date(Date to_date) {
        this.to_date = to_date;
    }

    public candidate getCan_id() {
        return can_id;
    }

    public void setCan_id(candidate can_id) {
        this.can_id = can_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWork_desc() {
        return work_desc;
    }

    public void setWork_desc(String work_desc) {
        this.work_desc = work_desc;
    }

    @Override
    public String toString() {
        return "experience{" +
                "exp_id=" + exp_id +
                ", from_date=" + from_date +
                ", to_date=" + to_date +
                ", can_id=" + can_id +
                ", role='" + role + '\'' +
                ", company='" + company + '\'' +
                ", work_desc='" + work_desc + '\'' +
                '}';
    }
}
