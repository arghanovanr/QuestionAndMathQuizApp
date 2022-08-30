package com.example.sairamkrishna.tugasbesar;

public class Question {

    public String mQuestion[] = {
            "What is part of a database that holds only one type of information?",
            " 'OS' computer abbreviation usually means ?",
            " '.MOV' extension refers usually to what kind of file?",
            "Which is a type of Electrically-Erasable Programmable Read-Only Memory?",
            "The most common format for a home video recorder is VHS. VHS stands for...?",
            "What frequency range is the High Frequency band?",
            "The first step to getting output from a laser is to excite an active medium. What is this process called?",
            "'DB' computer abbreviation usually means ?",
            "The sampling rate, (how many samples per second are stored) for a CD is...?",
            "Sometimes computers and cache registers in a foodmart are connected to a UPS system. What does UPS mean?"
    };

    private String mChoices[][] = {
            {"Report","Field","Record","File"},
            {"Order of Significance","Open Software","Operating System","Optical Sensor"},
            {"Image file","Animation/movie file","Audio file","MS Office document"},
            {"Flash","Flange","Fury","FRAM"},
            {"Video Home System","Very high speed","Video horizontal standard","Voltage house standard"},
            {"100 kHz","1 GHz","30 to 300 MHz","3 to 30 MHz"},
            {"Pumping","Exciting","Priming","Raising"},
            {"Double Byte","Database","Data Block","Driver Boot"},
            {"48.4 kHz","22,050 Hz","44.1 kHz","48 kHz"},
            {"United Parcel Service","Uniform Product Support","Under Paneling Storage","Uninterruptable Power Supply"},
    };

    private String mCorrectAnswer[] = {
            "Field","Operating System","Animation/movie file","Flash","Video Home System",
            "3 to 30 MHz","Pumping","Database","44.1 kHz","Uninterruptable Power Supply"
    };

    public String getQuestion(int index){
        String question = mQuestion[index];
        return question;
    };

    public String getChoice1(int index){
        String Choice = mChoices[index][0];
        return  Choice;
    };
    public String getChoice2(int index){
        String Choice = mChoices[index][1];
        return  Choice;
    };
    public String getChoice3(int index){
        String Choice = mChoices[index][2];
        return  Choice;
    };
    public String getChoice4(int index){
        String Choice = mChoices[index][3];
        return  Choice;
    };

    public String getCorrectAnswer(int index){
        String Answer = mCorrectAnswer[index];
        return Answer;
    };

}
