package vn.edu.iuh.fit.backend.ids;

import jakarta.persistence.Embeddable;


import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CandidateSkillPk implements Serializable {
    private long can;
    private long skill;

    public CandidateSkillPk(){}

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandidateSkillPk that = (CandidateSkillPk) o;
        return can == that.can && skill == that.skill;
    }

    @Override
    public int hashCode() {
        return Objects.hash(can, skill);
    }
}
