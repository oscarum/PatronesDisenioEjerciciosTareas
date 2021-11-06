package patronesDisenio.comportamiento.chainOfResponsability;

import java.util.Scanner;

public class LegalAssistant extends BaseAssistant
{
    private Scanner answerScanner;

    public LegalAssistant()
    {
        answerScanner = new Scanner(System.in);
    }

    public void handle(HelpDeskRequest helpDeskRequest) {
        String answer;

        do {
            System.out.println("CUSTOMER ASSISTANT: Chose an option from the menu...: ");
            answer = answerScanner.next();

            System.out.println("LEGAL ASSISTANT: Try solution...");
            System.out.println("Was the problem solved (Yes/No/Follow up/Explore another option)? ");
            answer = answerScanner.next();

            if (answer.equals("Y")) {
                helpDeskRequest.setProblemType(ProblemType.LEGAL);
                helpDeskRequest.setProblemStatus(ProblemStatus.SOLVED);
                helpDeskRequest.setSolution("Legal solution x");
                break;
            }

            if (answer.equals("N")) {
                helpDeskRequest.setProblemType(ProblemType.LEGAL);
                helpDeskRequest.setProblemStatus(ProblemStatus.CLOSED);
                helpDeskRequest.setSolution("It was impossible to get to an agreement");
                break;
            }

            if (answer.equals("F")) {
                helpDeskRequest.setProblemType(ProblemType.LEGAL);
                helpDeskRequest.setProblemStatus(ProblemStatus.PENDING);
                helpDeskRequest.setSolution("We will continue with the process afterwards");
                break;
            }
        } while (true);
    }
}
