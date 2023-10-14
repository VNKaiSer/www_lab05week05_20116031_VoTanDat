package vn.edu.iuh.fit.entities;

import jakarta.persistence.*;

@Entity
public class candidate_skill {
    @Id
    @ManyToOne
    @JoinColumn(name = "can_id", nullable = false)
    private candidate can_id;
    @Id
    @OneToOne
    @JoinColumn(name = "skill_id")
    private skill skill_id;

    @Enumerated(EnumType.ORDINAL)
    private SkillLevel skill_level;
    private String more_infos;

    public candidate_skill() {
    }

    public candidate_skill(candidate can_id, skill skill_id, SkillLevel skill_level, String more_infos) {
        this.can_id = can_id;
        this.skill_id = skill_id;
        this.skill_level = skill_level;
        this.more_infos = more_infos;
    }

    public candidate getCan_id() {
        return can_id;
    }

    public void setCan_id(candidate can_id) {
        this.can_id = can_id;
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
        return "candidate_skill{" +
                "can_id=" + can_id +
                ", skill_id=" + skill_id +
                ", skill_level=" + skill_level +
                ", more_infos='" + more_infos + '\'' +
                '}';
    }
}
