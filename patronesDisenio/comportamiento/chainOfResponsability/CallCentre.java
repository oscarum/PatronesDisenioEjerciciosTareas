package patronesDisenio.comportamiento.chainOfResponsability;

import java.util.Scanner;

public class CallCentre
{
    public static void main(String[] args) {
        Assistant simpleAssistant = new SimpleAssistant();
        Assistant customerAssistant = new CustomerAssistant();
        Assistant technicalAssistant = new TechnicalAssistant();
        Assistant legalAssistant = new LegalAssistant();

        simpleAssistant.setNext(customerAssistant);
        customerAssistant.setNext(technicalAssistant);
        technicalAssistant.setNext(legalAssistant);

        HelpDeskRequest helpDeskRequest;

        Scanner answerScanner = new Scanner(System.in);

        System.out.println("User: ");
        String user = answerScanner.next();
        System.out.println("Problem: ");
        String problem = answerScanner.next();

        helpDeskRequest = new HelpDeskRequest(user, problem);
        simpleAssistant.handle(helpDeskRequest);

        System.out.println(helpDeskRequest);
    }
}
