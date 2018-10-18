/*
 * Evan Robertson
 * October 18th 2018
 * A story the changes depending on your actions
 */

package adventuregame;

import java.util.Scanner;

/**
 *
 * @author evrob0095
 */
public class AdventureGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Question Answers
        String question1;
        String question2;
        String question3;
        String question4;
        String question5;
        String question6;
        
        
        //Boss fight variables
        int randomAttack1 = (int)Math.round(Math.random()*2+1);
        int randomAttack2 = (int)Math.round(Math.random()*2+1);
        boolean didHeal = false;
        boolean isBlind = false;
        boolean wasHit = false;
        
        Scanner input = new Scanner(System.in);
        
        //Starting Intro
        System.out.println("The is a choose your own adventure story. The answers you give will set \n"
                + "the outcome of the story. At the end of each decision you will be prompted with \n"
                + "the possible answers you can input in brackets. For example: Do you want to continue? (Yes / No) \n"
                + "then you would enter one of the possible answers given and move on \n"
                + "before we start, I highly recommend making the output screen as big as possible. \n"
                + "So are you ready to start? (Yes / No)");
        
        question1 = input.nextLine();
        
        //Answer 1st question
        if (question1.equalsIgnoreCase("no")) {
        System.exit(1);
        }
        else if (question1.equalsIgnoreCase("yes")) {
        //If said yes execute all this
            System.out.println("Ok let's set the mood real quick. Middle of the night. Your sleeping \n"
                    + "Loud crashing noise. You wake up. Do you want to investigate? (Yes / No)");
            question2 = input.nextLine();
            
            //Answer for question 2
            if (question2.equalsIgnoreCase("no")) {
                System.out.println("Oh ok that's fine. I didn't want you to investigate anyways. It was probably just \n"
                        + "another car crash or something. Anyways, 3 weeks go by and then BAM the supreme ruler of the universe \n"
                        + "just swoops down and eliminates Earth from exsistance. So your dead. Maybe next time show a little more \n"
                        + "intrest in loud noises you hear in the middle of night.");
                System.exit(1);
            }
            else if (question2.equalsIgnoreCase("yes"))
                //If yes then execute all this
                
                System.out.println("So you decide to investigate. You go outside and notice a bright light emmiting form the top of a nearby hill. \n"
                        + "You head towards the light and suddenly you hear a voice. The voice tells you to head to the top of the highest mountain in \n"
                        + "search of a stone capable of defeating the supreme ruler of the universe. Do you believe the voice? (Yes / No)");
                question3 = input.nextLine();
                if (question3.equalsIgnoreCase("no")) {
                    System.out.println("Are you serious, you hear a disembodied voice coming from a giant glowing rock and your just gonna sit there and \n"
                            + "act like your curious at all about what the heck is happening?!?? Fine I don't even care lol");
                    System.exit(1);
                }
                else if (question3.equalsIgnoreCase("yes")) {
                    System.out.println("So you trust the voice and head up the mountain. Out of nowhere a unkown entity blocks your path and you are required to fight it \n"
                            + "Luckily the voice had told you that you had phycic powers this whole time and you didn't know until now. Perfect time to use them \n"
                            + "So you do and then the entity is defeated. The more up the hill you went, the more enemies you encountered, the more powerful you became. \n"
                            + "*Start montage of you just climbing this big mountain for 3 weeks and killing a lot of things nad getting realy powerful.*\n"
                            + "Wowow look at that your at the top of the mountain already. You find the stone and then BAM it's the Supreme Ruler of the Universe\n"
                            + "and he looking not happy because you got the stone that gonna kill the dude. Anyways, you've come so far and it is now time to put your skills \n"
                            + "to the test. This is the final battle \n \n *Megalovania starts playing* \n \n  What is your first attack? "
                            + "(Hit it with your fist because why not / Use ultimate phycic ability / Run away)");
                    question4 = input.nextLine();
                    switch (question4.toLowerCase()) {
                        case "hit it with your fist because why not":
                            System.out.println("You deal 4 damage to the supreme ruler");
                            break;
                        case "use ultimate phycic ability":
                            System.out.println("You deal 250 damage to the supreme ruler");
                            break;
                        case "run away":
                            System.out.println("HAHHAHAHAHAHAHHAHAHAHAHAHAHAHAHAAHHAHA Nice try chief");
                            break;
                    }
                    System.out.println("The Supreme Ruler is fighting back!");
                    switch (randomAttack1) {
                        case 1:
                            System.out.println("The Supreme ruler of the universe defends");
                            break;
                        case 2:
                            System.out.println("The supreme ruler of the universe casts a blinding light");
                            isBlind = true;
                            break;
                        default:
                            System.out.println("The supreme ruler of the universe uses a phycic attack! Doing 700 damage to you! "
                                    + "You will die if you do not heal this turn!");
                            wasHit = true;
                            break;
                    }
                    System.out.println("What do you do? (Phycic attack / Heal / Put on sunglasses)");
                    question5 = input.nextLine();
                    switch (question5.toLowerCase()) {
                        case "phycic attack":
                            System.out.println("You use a phycic attack and deal 250 damage");
                            break;
                        case "heal":
                            System.out.println("You heal back to full health");
                            didHeal = true;
                            break;
                        case "put on sunglasses":
                            System.out.println("You put on sunglasses");
                            if (isBlind == true) {
                                System.out.println("You are no longer blind");
                                isBlind = false;
                            }
                            else if (isBlind == false){
                                System.out.println("Though you weren't blinded by one of his attacks, you now look super cool!");
                            }
                            break;
                    }
                    if (wasHit == true && didHeal == false) {
                        System.out.println("You have died. Restart");
                        System.exit(1);
                    }
                    else {
                        wasHit = false;
                    }
                    if (isBlind == true) {
                        System.out.println("The bright light disapeears and is replaced by darkness. You then die becuase why not. Restart");
                        System.exit(1);
                    }
                    switch (randomAttack2) {
                        case 1:
                            System.out.println("The supreme ruler defends");
                            break;
                        case 2:
                            System.out.println("The supreme ruler tries to run away");
                            break;
                        default:
                            System.out.println("The supreme ruler attacks dealing 900 damage! You will die if you do not heal next turn!");
                            wasHit = true;
                            break;
                    }
                    System.out.println("What will you do? (Finish him / Heal and then be an aboslute savage and attack even though it's not your turn)");
                    question6 = input.nextLine();
                    switch (question6.toLowerCase()) {
                        case "finish him":
                            System.out.println("You call the supreme ruler an idiot head. He dies");
                            break;
                        case "heal and then be an aboslute savage and attack even though it's not your turn":
                            System.out.println("You absolute mad lad. You actually typed all that out");
                            System.out.println("You call the supreme ruler an idiot head. He dies");
                            break;
                    }
                    System.out.println("You win YAY!");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("BAM outa nowhere the superme ruler enters its final form and uses its mega ultimate attack leaving you at one health");
                    System.out.println("*Megalovania stops playing*");   
                    System.out.println("All is tense, the supreme ruler has defeated you. But wait!");
                    System.out.println("With your last breath you say");
                    System.out.println("*No u*");
                    System.out.println("The supeme ruler then dies because no u is the best comeback ever created and nothing can defeat it");
                    System.out.println("RIP supreme ruler, was literally a a measuring ruler with a supereme sticker slapped on it. SO sad");
                    System.out.println("Welp you win ez game the end");
                    
                //10 out of 10 would kill a ruler again
                }
        }
    }
    
}
