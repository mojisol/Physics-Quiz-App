package com.example.android.physicsquiz;

/**
 * Created by MOJISOLA on 31/05/2017.
 */

public class Questions {
    public String mQuestions[] = {
         "Newton's first law of motion states that?",
         "What is a machine?",
         "Matter is?",
         "State Newton's third law",
         "What are fundamental quantities?",
         "The formula for speed is ?",
         "The unit of mass is in?"
    };

    private String mChoices[][] = {
            {"(a.) For every action there is an equal and opposite reaction",
            "(b.) A body in rest or motion stays the same way unless acted upon by an external force",
            "(c.) What goes up must come down", "(d.) Energy is needed for work"},
            {"(a.) A mechanical device that changes the direction or magnitude of a force",
            "(b.) A musical instrument", "(c.) A device used in the market",
            "(d.) A device used to carry load"},
            {"(a.) Any thing that has weight and occupies space",
            "(b.) Anything that has a body", "(c.) Anything that is alive",
            "(d.) Anything that has a heart beat"},
            {"(a.) For every action there is an equal and opposite reaction",
            "(b.) A body in rest or motion stays the same way unless acted upon by an external force",
            "(c.) What goes up must come down", "(d.) Energy is needed for work"},
            {"(a.) They are quantities that do not depend on any other physical quantities for their measurement",
            "(b.) They are quantities that depend on other physical quanties for their measurement",
            "(c.) They are used for measuring other quantities",
            "(d.) They are not used for measuring other quantities"},
            {"(a.) velocity/displacement", "(b.) time/displacement", "(c.) distance/time", "(d.) time/distance"},
            {"(a.) gram", "(b.) kilometer", "(c.) meter", "(d.) kilogram"}
    };

    private String mCorrectAnswers[] = {"(b.) A body in rest or motion stays the same way unless acted upon by an external force",
    "(a.) A mechanical device that changes the direction or magnitude of a force", "(a.) Any thing that has weight and occupies space",
    "(a.) For every action there is an equal and opposite reaction", "(a.) They are quantities that do not depend on any other physical quantities for their measurement",
    "(c.) distance/time", "(d.) kilogram"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
