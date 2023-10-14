package vn.edu.iuh.fit.ids;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable

public class JobSkillPK implements Serializable {
    private long job;
    private long skill;

    public JobSkillPK(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobSkillPK that = (JobSkillPK) o;
        return job == that.job && skill == that.skill;
    }

    @Override
    public int hashCode() {
        return Objects.hash(job, skill);
    }
}
