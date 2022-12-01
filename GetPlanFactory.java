public class GetPlanFactory {
    public Plan GenerateBill(String plan)
    {
        if(plan == null)
        {
            return null;
        }

        if(plan.equalsIgnoreCase("domestic plan"))
        {
            return new DomesticPlan();
        }

        if(plan.equalsIgnoreCase("institutional plan"))
        {
            return new InstitutionalPlan();
        }

        if(plan.equalsIgnoreCase("commercial plan"))
        {
            return new CommercialPlan();
        }

        return null;
    }
}
