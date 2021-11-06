package patronesDisenio.comportamiento.chainOfResponsability;

import java.util.Scanner;

public class CustomerAssistant extends BaseAssistant
{
    private Scanner answerScanner;

    public CustomerAssistant()
    {
        answerScanner = new Scanner(System.in);
    }

    public void handle(HelpDeskRequest helpDeskRequest) {
        String answer;

        do {
            System.out.println("CUSTOMER ASSISTANT: Chose an option from the menu... *0 to call with a technical assistant: ");
            answer = answerScanner.next();

            if (answer.equals("*0")) {
                helpDeskRequest.setProblemStatus(ProblemStatus.OPEN);
                super.handle(helpDeskRequest);
                break;
            }

            System.out.println("Try customer solution...");
            System.out.println("Was the problem solved (Y/N)? ");
            answer = answerScanner.next();

            if (answer.equals("Y")) {
                helpDeskRequest.setProblemType(ProblemType.CUSTOMER);
                helpDeskRequest.setProblemStatus(ProblemStatus.SOLVED);
                helpDeskRequest.setSolution("Customer solution x");
                break;
            }
        } while (true);
    }
}
