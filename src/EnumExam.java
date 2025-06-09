public class EnumExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    public static void main(String[] args) {
        String gender;
        gender = EnumExam.MALE;
        gender = EnumExam.FEMALE;

        // 다른값이 들어오면 안됨.
        gender = "boy";

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

//        gender2 = "boy";
    }
}
enum Gender {
    MALE, FEMALE;
}
