package patronesDisenio.comportamiento.chainOfResponsability;

import java.util.Scanner;

public class SimpleAssistant extends BaseAssistant
{
    private Scanner answerScanner;

    public SimpleAssistant()
    {
        answerScanner = new Scanner(System.in);
    }

    public void handle(HelpDeskRequest helpDeskRequest) {
        String answer;

        do {
            System.out.println("SIMPLE ASSISTANT: Chose an option from the menu... *0 to call with a customer assistant: ");
            answer = answerScanner.next();

            if (answer.equals("*0")) {
                helpDeskRequest.setProblemStatus(ProblemStatus.OPEN);
                super.handle(helpDeskRequest);
                break;
            }

            System.out.println("Try simple solution...");
            System.out.println("Was the problem solved (Y/N)? ");
            answer = answerScanner.next();

            if (answer.equals("Y")) {
                helpDeskRequest.setProblemType(ProblemType.SIMPLE);
                helpDeskRequest.setProblemStatus(ProblemStatus.SOLVED);
                helpDeskRequest.setSolution("Simple solution x");
                break;
            }
        } while (true);
    }
}
