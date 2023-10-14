package vn.edu.iuh.fit.entities;

import jakarta.persistence.*;

@Entity
public class job_skill {
    @Id
    @OneToOne
    @JoinColumn(name = "job_id", nullable = false)
    private job job_id;
    @Id
    @OneToOne
    @JoinColumn(name = "skill_id", nullable = false)
    private skill skill_id;
    @Enumerated(EnumType.ORDINAL)
    private SkillLevel skill_level;
    private String more_infos;

    public job_skill() {
    }

    public job_skill(job job_id, skill skill_id, SkillLevel skill_level, String more_infos) {
        this.job_id = job_id;
        this.skill_id = skill_id;
        this.skill_level = skill_level;
        this.more_infos = more_infos;
    }

    public job getJob_id() {
        return job_id;
    }

    public void setJob_id(job job_id) {
        this.job_id = job_id;
    }

    public skill getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(skill skill_id) {
        this.skill_id = skill_id;
    }

    public SkillLevel getSkill_level() {
        return skill_level;
    }

    public void setSkill_level(SkillLevel skill_level) {
        this.skill_level = skill_level;
    }

    public String getMore_infos() {
        return more_infos;
    }

    public void setMore_infos(String more_infos) {
        this.more_infos = more_infos;
    }

    @Override
    public String toString() {
        return "job_skill{" +
                "job_id=" + job_id +
                ", skill_id=" + skill_id +
                ", skill_level=" + skill_level +
                ", more_infos='" + more_infos + '\'' +
                '}';
    }
}