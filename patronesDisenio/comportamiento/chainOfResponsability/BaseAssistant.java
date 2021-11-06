package patronesDisenio.comportamiento.chainOfResponsability;

public class BaseAssistant implements Assistant
{
    private Assistant next;

    @Override
    public void setNext(Assistant assistant)
    {
        next = assistant;
    }

    @Override
    public void handle(HelpDeskRequest helpDeskRequest)
    {
        if (this.next != null) {
            next.handle(helpDeskRequest);
        }
    }
}
