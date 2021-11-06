package patronesDisenio.comportamiento.chainOfResponsability;

public class HelpDeskRequest
{
    private String user;
    private ProblemType problemType;
    private String problem;
    private ProblemStatus problemStatus;
    private String solution;

    public HelpDeskRequest(String user, String problem)
    {
        this.user = user;
        this.problem = problem;
    }

    public String getUser()
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public ProblemType getProblemType()
    {
        return problemType;
    }

    public void setProblemType(ProblemType problemType)
    {
        this.problemType = problemType;
    }

    public String getProblem()
    {
        return problem;
    }

    public void setProblem(String problem)
    {
        this.problem = problem;
    }

    public ProblemStatus getSolutionType()
    {
        return problemStatus;
    }

    public void setProblemStatus(ProblemStatus problemStatus)
    {
        this.problemStatus = problemStatus;
    }

    public String getSolution()
    {
        return solution;
    }

    public void setSolution(String solution)
    {
        this.solution = solution;
    }

    @Override
    public String toString()
    {
        return "HelpDeskRequest{" +
               "user='" + user + '\'' +
               ", problemType=" + problemType +
               ", problem='" + problem + '\'' +
               ", problemStatus=" + problemStatus +
               ", solution='" + solution + '\'' +
               '}';
    }
}
