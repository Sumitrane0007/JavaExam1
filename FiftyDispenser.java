public class FiftyDispenser extends PaperCurrencyDispenser{
    public FiftyDispenser()
    {
        super();
    }

    @Override
    public void dispenser(PaperCurrency currency)
    {
        if(currency != null)
        {
            int amount = currency.getAmount();
            int remainder = amount;

            if(amount >= 50)
            {
                int count = amount / 50;
                remainder = amount % 50;
                System.out.printf("Dispending '%d' 50$ currency note\n",count);
            }
            
            if(remainder > 0 && this.nextDispenser != null)
            {
                this.nextDispenser.dispenser(new PaperCurrency(remainder));
            }
        }
    }
}
