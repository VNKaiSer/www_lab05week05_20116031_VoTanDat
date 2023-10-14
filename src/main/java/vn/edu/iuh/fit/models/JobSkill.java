package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.Getter;
import vn.edu.iuh.fit.enums.SkillLevel;

@Getter
@Entity
public class JobSkill {
    @Id
    @OneToOne
    @JoinColumn(name = "job_id", nullable = false)
    private Job job_id;
    @Id
    @OneToOne
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill_id;
    @Enumerated(EnumType.ORDINAL)
    private SkillLevel skill_level;
    private String more_infos;

    public JobSkill() {
    }

    public JobSkill(Job job_id, Skill skill_id, SkillLevel skill_level, String more_infos) {
        this.job_id = job_id;
        this.skill_id = skill_id;
        this.skill_level = skill_level;
        this.more_infos = more_infos;
    }

    public void setJob_id(Job job_id) {
        this.job_id = job_id;
    }

    public void setSkill_id(Skill skill_id) {
        this.skill_id = skill_id;
    }

    public void setSkill_level(SkillLevel skill_level) {
        this.skill_level = skill_level;
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