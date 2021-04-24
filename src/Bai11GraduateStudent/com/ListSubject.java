package Bai11GraduateStudent.com;

public class ListSubject {
    private float markOfMath;
    private float markOfEnglish;
    private float markOfHistory;
    private float markOfLiterature;
    private float markOfChemischy;


    public ListSubject() {
    }
    public ListSubject(float markOfMath, float markOfEnglish, float markOfHistory, float markOfLiterature, float markOfChemischy) {
        this.markOfMath = Math.max(markOfMath,0);
        this.markOfEnglish = Math.max(markOfEnglish,0);
        this.markOfHistory = Math.max(markOfHistory,0);
        this.markOfLiterature = Math.max(markOfLiterature,0);
        this.markOfChemischy = Math.max(markOfChemischy,0);
    }

    public float getMarkOfMath() {
        return markOfMath;
    }

    public void setMarkOfMath(float markOfMath) {
        this.markOfMath = markOfMath;
    }

    public float getMarkOfEnglish() {
        return markOfEnglish;
    }

    public void setMarkOfEnglish(float markOfEnglish) {
        this.markOfEnglish = markOfEnglish;
    }

    public float getMarkOfHistory() {
        return markOfHistory;
    }

    public void setMarkOfHistory(float markOfHistory) {
        this.markOfHistory = markOfHistory;
    }

    public float getMarkOfLiterature() {
        return markOfLiterature;
    }

    public void setMarkOfLiterature(float markOfLiterature) {
        this.markOfLiterature = markOfLiterature;
    }

    public float getMarkOfChemischy() {
        return markOfChemischy;
    }

    public void setMarkOfChemischy(float markOfChemischy) {
        this.markOfChemischy = markOfChemischy;
    }
    public float calculateAverage(){
        return (markOfChemischy+markOfMath+markOfHistory+markOfEnglish+markOfLiterature)/5;
    }

    @Override
    public String toString() {
        return "ListSubject{" +
                "markOfMath=" + markOfMath +
                ", markOfEnglish=" + markOfEnglish +
                ", markOfHistory=" + markOfHistory +
                ", markOfLiterature=" + markOfLiterature +
                ", markOfChemischy=" + markOfChemischy +
                '}';
    }
}
