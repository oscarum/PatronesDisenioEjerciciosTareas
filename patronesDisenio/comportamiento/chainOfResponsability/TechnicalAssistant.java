package patronesDisenio.comportamiento.chainOfResponsability;

import java.util.Scanner;

public class TechnicalAssistant extends BaseAssistant
{
    private Scanner answerScanner;

    public TechnicalAssistant()
    {
        answerScanner = new Scanner(System.in);
    }

    public void handle(HelpDeskRequest helpDeskRequest) {
        String answer;

        do {
            System.out.println("TECHNICAL ASSISTANT: Chose an option from the menu... *0 to call with a legal assistant: ");
            answer = answerScanner.next();

            if (answer.equals("*0")) {
                helpDeskRequest.setProblemStatus(ProblemStatus.OPEN);
                super.handle(helpDeskRequest);
                break;
            }

            System.out.println("Try technical solution...");
            System.out.println("Was the problem solved (Y/N)? ");
            answer = answerScanner.next();

            if (answer.equals("Y")) {
                helpDeskRequest.setProblemType(ProblemType.TECHNICAL);
                helpDeskRequest.setProblemStatus(ProblemStatus.SOLVED);
                helpDeskRequest.setSolution("Technical solution x");
                break;
            }
        } while (true);
    }
}
