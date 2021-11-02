package edu.nwmissouri.zoo07group;

/**
 * Human super class for traits shared by all Human.
 * @author VamsiBhogireddy
 */
public abstract class Human {

    protected String name = "no name";
    protected String Gender;
    enum generation{
        FirsGenration,
        SecoundGeneration,
        ThirdGeneration
    }

    public Human(String name) {
        this.name = name;
    }

    public void experience() {
        System.out.println("I have 3 years of experience");
    }

    public void salary() {
        System.out.println("My annual income is 5LPA");
    }
    public void role(){
        System.out.println("My role is Team Manager");
    }
}
    