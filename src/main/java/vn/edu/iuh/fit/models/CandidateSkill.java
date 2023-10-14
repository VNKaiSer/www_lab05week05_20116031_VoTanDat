package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.enums.SkillLevel;
import vn.edu.iuh.fit.ids.CandidateSkillPk;

@Getter
@Setter
@Entity
@IdClass(CandidateSkillPk.class)
@Table(name = "candidate_skill")
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "can_id", nullable = false)
    private Candidate can;
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Enumerated(EnumType.STRING)
    private SkillLevel skillLevel;
    private String moreInfos;

    public CandidateSkill() {
    }

    public CandidateSkill(Candidate can_id, Skill skill_id, SkillLevel skill_level, String more_infos) {
        this.can = can_id;
        this.skill = skill_id;
        this.skillLevel = skill_level;
        this.moreInfos = more_infos;
    }


    @Override
    public String toString() {
        return "candidate_skill{" +
                "can_id=" + can +
                ", skill_id=" + skill +
                ", skill_level=" + skillLevel +
                ", more_infos='" + moreInfos + '\'' +
                '}';
    }
}
