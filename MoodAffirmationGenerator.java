import java.util.Random;
import java.util.Scanner;

public class MoodAffirmationGenerator {

    public static void main(String[] args) {
        Scanner pookie = new Scanner(System.in);

        System.out.println("How are you feeling today pookie? Enter the integer.");
        System.out.println("1. happy");
        System.out.println("2. stressed and poopy");
        System.out.println("3. depressed");
        System.out.println("4. whimsical");
        System.out.println("5. delulu");
        System.out.println("6. sane");
        System.out.println("7. heartbroken bc a man ghosted you");
        System.out.println("8. mid");
        System.out.println("9. need a glow-up");
        System.out.println("10. insane");

        boolean dookie = true;
        int mood = 0;
        do {
            if (pookie.hasNextInt()) {
                mood = pookie.nextInt();
                if (mood <= 10 && mood >= 1) {
                    dookie = false;
                } else {
                    System.out.println("bro enter a number between 1-10");
                    pookie.nextLine();
                }
            } else {
                System.out.println("Enter a number!! :)))");
                pookie.nextLine();
            }
        } while (dookie);

        String affirmation = generateAffirmation(mood);
        System.out.println("Affirmation: " + affirmation);

        System.out.println("");

            System.out.println("\nIf you're struggling with your mental health, remember that help is available.");
            System.out.println("Reach out to a mental health professional or contact a helpline.");
            System.out.println("National Suicide Prevention Lifeline: 1-800-273-TALK (8255)");
            System.out.println("Crisis Text Line: Text 'HELLO' to 741741");
            System.out.println("Your mental health matters. Take care of yourself.");
            System.out.println("--------------------------------------------------------");

            System.out.println("Lehigh University has many resources readily available for you.");
            System.out.println("Telus Health Student Support (formerly My SSP) is here to help you succeed. Connect with Telus Health Student Support 24/7 for free, confidential \n mental health and wellbeing support. \n Download the app to access: \n * 24/7 real-time, on-demand phone and chat support \n * Multilingual, on-going, short-term phone and video counseling support by appointment \n * and other wellness resources!");
            System.out.println("--------------------------------------------------------");
            System.out.println("Counseling & Psychological Services \n 36 University Drive | Johnson Hall, 4th Floor | Bethlehem, PA 18015 \n PH 610-758-3880 \n incso@lehigh.edu");

            System.out.println("--------------------------------------------------------");
            System.out.println("Counseling is most effective when: \n * You have at least a general idea of what you would like to work on \n * You are motivated to make changes in your life \n * You reflect on your emotions, thoughts, and behaviors during the days between sessions \n * You feel comfortable with and trusting of your counselor. Should that not be the case, we welcome and encourage you to discuss that \n with your counselor or other staff.");


    }

    public static String generateAffirmation(int mood) {
        Random random = new Random();
        String affirmation = ""; // Declare the affirmation variable
        switch (mood) {
            case 1:
                affirmation = happyAffirmation(random);
                break;
            case 2:
                affirmation = stressedAffirmation(random);
                break;
            case 3:
                System.out.println("What's wrong pookie?");
                System.out.println("I don't care.");
                System.out.println("JK!!");
                affirmation = depressedAffirmation(random);
                break;
            case 4:
                affirmation = whimsicalAffirmation(random);
                break;
            case 5:
                affirmation = deluluAffirmation(random);
                break;
            case 6:
                affirmation = saneAffirmation(random);
                break;
            case 7:
                affirmation = heartbrokenAffirmation(random);
                break;
            case 8:
                affirmation = midAffirmation(random);
                break;
            case 9:
                affirmation = glowUpAffirmation(random);
                break;
            case 10:
                affirmation = insaneAffirmation(random);
                break;
            default:
                affirmation = "You are not valid";
                break;
        }
        return affirmation;
    }

    public static String happyAffirmation(Random random) {
       String[] happyAffirmations = {
            "You're so awesome that even your coffee is jealous!",
            "Today's goal: Make the world a better place by just being yourself.",
            "You're not just a star; you're the entire galaxy!",
            "Smile,  it confuses people!",
            "If happiness were a currency, you'd be a billionaire!",
            "You're so bright, you make the sun look like a flashlight!",
            "Your happiness level is off the charts; caution, you might cause joy earthquakes!",
            "You're not aging; you're leveling up!",
            "Your positivity could power a city!",
            "Life's a party, and you're the guest of honor!"};

    return happyAffirmations[random.nextInt(happyAffirmations.length)];
}

 public static String stressedAffirmation(Random random) {
    String[] stressedAffirmations = {
            "In the midst of chaos, I find my strength. It's okay not to have everything figured out right now; life's journey is full of twists and turns.",
            "This challenging time is just a chapter in your story, not the whole book. You're resilient, and you will overcome. Believe in the power within you.",
            "Life has its ups and downs, and right now, it might feel like a rollercoaster. Take a deep breath; you're navigating through the dips, and the climb back up is inevitable.",
            "Acknowledging that things are tough is the first step towards conquering them. You're not alone; we all face challenges. Your strength will carry you through."};
    return stressedAffirmations[random.nextInt(stressedAffirmations.length)];
}

public static String depressedAffirmation(Random random) {
    String[] depressedAffirmations = {
            "It's okay not to be okay. Your feelings are valid, and you're not alone in this journey.",
            "Taking one step at a time is progress. Even in the darkest moments, there's a glimmer of hope waiting for you.",
            "You're not defined by your tough days. Each sunrise brings a new opportunity for healing and growth.",
            "Embracing self-compassion is a powerful act. You're deserving of love, understanding, and patience, especially from yourself.",
		"Pick yourself up pookie. You got this."};
    return depressedAffirmations[random.nextInt(depressedAffirmations.length)];
}


   public static String whimsicalAffirmation(Random random) {
    String[] whimsicalAffirmations = {
            "You're as magical as a unicorn sipping hot cocoa in a rainbow-filled meadow!",
            "Embrace the quirks and twirls of your unique dance through life. Today's adventure: chasing dreams and catching stardust!",
            "Your aura is so whimsical that even clouds envy your style. Sparkle on, you cosmic daydreamer!",
            "In the grand symphony of existence, you're the melody that makes everyone tap their toes and smile in delight."};
    return whimsicalAffirmations[random.nextInt(whimsicalAffirmations.length)];
}



    public static String deluluAffirmation(Random random) {
        String[] deluluAffirmations = {
                "They want you so bad. Trust.",
                "They are definitely thinking about you. You are living rent-free in their head. ",
                "You are soulmates.",
                "You held eye contact for more than 0.5 seconds. Congrats!" };
        return deluluAffirmations[random.nextInt(deluluAffirmations.length)];
    }

 public static String saneAffirmation(Random random) {
    String[] saneAffirmations = {
            "Your mind is a sanctuary of calm and clarity. Today, navigate the chaos with grace and tranquility.",
            "In the rhythm of life, you are the steady beat, guiding your actions with a clear and focused mind.",
            "Balance is your superpower. Embrace the present moment, and let your sane energy radiate peace to those around you.",
            "Amidst the noise, you remain the calm in the storm. Your sanity is a beacon, guiding you through the complexities of life." };
    return saneAffirmations[random.nextInt(saneAffirmations.length)];
}

public static String heartbrokenAffirmation(Random random) {
    String[] heartbrokenAffirmations = {
            "In the storm of emotions, your strength shines through. Take all the time you need to heal.",
            "Your heart is resilient, and healing is a journey. Allow yourself the grace to feel, grieve, and grow.",
            "I'm here with a heart full of empathy. Whenever you're ready, I'm here to listen and support you.",
            "Heartbreak is a testament to the depth of your capacity to love. You will emerge from this stronger and wiser." };
    return heartbrokenAffirmations[random.nextInt(heartbrokenAffirmations.length)];
}
    public static String midAffirmation(Random random) {
        String[] midAffirmations = {
                "You are living life and that's good enough!",
                "Taking care of yourself is productive.",
                "Take it easy, one day at a time.",
                "Trust the process. Small steps every day."};
        return midAffirmations[random.nextInt(midAffirmations.length)];
    }

    public static String glowUpAffirmation(Random random) {
        String[] glowUpAffirmations = {
                "Remember to be kind to yourself throughout this process. Self-love is an essential part of any glow-up",
                "Your glow-up is a journey, not a destination. Enjoy the process and celebrate the person you are becoming",
                "You are beautiful and it is your era.",
                "Each small step you take is a victory. Progress, not perfection" };
        return glowUpAffirmations[random.nextInt(glowUpAffirmations.length)];
    }

    public static String insaneAffirmation(Random random) {
        String[] insaneAffirmations = {
                "Taking care of yourself is important.",
                "You are not losing your mind, your mind is losing you.",
                "Go punch the wall",
                "He won't love you if you're like this." };
        return insaneAffirmations[random.nextInt(insaneAffirmations.length)];
    }
}