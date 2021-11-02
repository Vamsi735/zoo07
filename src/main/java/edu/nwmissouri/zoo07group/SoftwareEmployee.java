package edu.nwmissouri.zoo07group;

/**
 *
 * @author Vamsi Bhogireddy
 */
public class SoftwareEmployee extends Human {
    
    public SoftwareEmployee(String name){
        super(name);
    }
    @Override
    public void experience() {
        System.out.println("I have 4 years of experience");
    }
    @Override
    public void salary() {
        System.out.println("My annual income is 5.5LPA");
    }
    @Override
    public void role(){
        System.out.println("My role is project Manager");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SoftwareEmployee profession = new SoftwareEmployee("Vamsi");
        profession.experience();
        profession.salary();
        profession.role();
    }
    
}
