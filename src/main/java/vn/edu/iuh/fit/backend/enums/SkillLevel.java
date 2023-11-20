package vn.edu.iuh.fit.backend.enums;



public enum SkillLevel {
    MASTER(5),
    BEGINNER(1),
    ADVANCED(2),
    PROFESSIONAL(4),
    INTERMEDIATE(3);

    private int value;
    SkillLevel(int value){
        this.value = value;
    }


}
