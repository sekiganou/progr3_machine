package model;

public record Exercise(String text, int solution) {
    public boolean isAnswerCorrect(int answer){
        return answer == solution;
    }
}
