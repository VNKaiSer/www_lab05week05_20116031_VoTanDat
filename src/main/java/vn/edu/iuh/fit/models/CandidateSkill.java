package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.enums.SkillLevel;

@Getter
@Setter
@Entity
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "can_id", nullable = false)
    private Candidate canId;
    @Id
    @OneToOne
    @JoinColumn(name = "skill_id")
    private Skill skillId;

    @Enumerated(EnumType.ORDINAL)
    private SkillLevel skillLevel;
    private String moreInfos;

    public CandidateSkill() {
    }

    public CandidateSkill(Candidate can_id, Skill skill_id, SkillLevel skill_level, String more_infos) {
        this.canId = can_id;
        this.skillId = skill_id;
        this.skillLevel = skill_level;
        this.moreInfos = more_infos;
    }


    @Override
    public String toString() {
        return "candidate_skill{" +
                "can_id=" + canId +
                ", skill_id=" + skillId +
                ", skill_level=" + skillLevel +
                ", more_infos='" + moreInfos + '\'' +
                '}';
    }
}
