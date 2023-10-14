package vn.edu.iuh.fit.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class skill {
    @Id
    private long skill_id;
    @Enumerated(EnumType.ORDINAL)
    private SkillType skill_type;
    private String skill_name;
    private String skill_desc;
    @OneToMany
    @JoinColumn()
    private List<job_skill> jobSkils;

    public skill() {
    }

    public skill(long skill_id, SkillType skill_type, String skill_name, String skill_desc) {
        this.skill_id = skill_id;
        this.skill_type = skill_type;
        this.skill_name = skill_name;
        this.skill_desc = skill_desc;
    }

    public long getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(long skill_id) {
        this.skill_id = skill_id;
    }

    public SkillType getSkill_type() {
        return skill_type;
    }

    public void setSkill_type(SkillType skill_type) {
        this.skill_type = skill_type;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    public String getSkill_desc() {
        return skill_desc;
    }

    public void setSkill_desc(String skill_desc) {
        this.skill_desc = skill_desc;
    }

    @Override
    public String toString() {
        return "skill{" +
                "skill_id=" + skill_id +
                ", skill_type=" + skill_type +
                ", skill_name='" + skill_name + '\'' +
                ", skill_desc='" + skill_desc + '\'' +
                '}';
    }
}
