public class HundredDispenser extends PaperCurrencyDispenser{
    public HundredDispenser()
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

            if(amount >= 100)
            {
                int count = amount / 100;
                remainder = amount % 100;
                System.out.printf("Dispending '%d' 100$ currency note\n",count);
            }
            
            if(remainder > 0 && this.nextDispenser != null)
            {
                this.nextDispenser.dispenser(new PaperCurrency(remainder));
            }
        }
    }
}
