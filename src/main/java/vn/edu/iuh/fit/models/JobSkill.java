package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.Getter;
import vn.edu.iuh.fit.enums.SkillLevel;
import vn.edu.iuh.fit.ids.JobSkillPK;

@Getter
@Entity
@IdClass(JobSkillPK.class)
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;
    @Enumerated(EnumType.STRING)
    private SkillLevel skillLevel;
    private String moreInfos;

    public JobSkill() {
    }

    public JobSkill(Job job_id, Skill skill_id, SkillLevel skill_level, String more_infos) {
        this.job = job_id;
        this.skill = skill_id;
        this.skillLevel = skill_level;
        this.moreInfos = more_infos;
    }

    public void setJob_id(Job job_id) {
        this.job = job_id;
    }

    public void setSkill_id(Skill skill_id) {
        this.skill = skill_id;
    }

    public void setSkillLevel(SkillLevel skill_level) {
        this.skillLevel = skill_level;
    }

    public void setMoreInfos(String more_infos) {
        this.moreInfos = more_infos;
    }

    @Override
    public String toString() {
        return "job_skill{" +
                "job_id=" + job +
                ", skill_id=" + skill +
                ", skill_level=" + skillLevel +
                ", more_infos='" + moreInfos + '\'' +
                '}';
    }
}