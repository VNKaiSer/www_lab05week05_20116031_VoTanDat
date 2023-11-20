package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.Getter;
import vn.edu.iuh.fit.enums.SkillType;

import java.util.List;

@Getter
@Entity
public class Skill {
    @Id
    @Column(name = "skill_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long skillId;
    @Enumerated(EnumType.STRING)
    private SkillType skillType;
    private String skillName;
    private String skillDesc;
    @OneToMany
    @JoinColumn(name = "skill_id")
    private List<JobSkill> jobSkils;

    public Skill() {
    }

    public Skill(long skill_id, SkillType skill_type, String skill_name, String skill_desc) {
        this.skillId = skill_id;
        this.skillType = skill_type;
        this.skillName = skill_name;
        this.skillDesc = skill_desc;
    }

    public void setSkillId(long skillId) {
        this.skillId = skillId;
    }

    public void setSkillType(SkillType skill_type) {
        this.skillType = skill_type;
    }

    public void setSkillName(String skill_name) {
        this.skillName = skill_name;
    }

    public void setSkillDesc(String skill_desc) {
        this.skillDesc = skill_desc;
    }

    @Override
    public String toString() {
        return "skill{" +
                "skill_id=" + skillId +
                ", skill_type=" + skillType +
                ", skill_name='" + skillName + '\'' +
                ", skill_desc='" + skillDesc + '\'' +
                '}';
    }
}
